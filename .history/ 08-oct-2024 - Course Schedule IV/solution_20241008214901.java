class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
        // Build the graph representation using HashMap
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for (int[] temp : prerequisites) {
            map.computeIfAbsent(temp[1], k -> new ArrayList<>()).add(temp[0]);
            map.computeIfAbsent(temp[0], k -> new ArrayList<>()); 
        }
        
        // List to store the results for each query
        List<Boolean> retList = new ArrayList<>();
        
        // For each query, check if prerequisite relationship exists using DFS
        for (int[] query : queries) {
            if (dfs(query[1], query[0], map, new HashSet<>(), new HashSet<>())) {
                retList.add(true);
            } else {
                retList.add(false);
            }
        }
        
        return retList;
    }
    
    public boolean dfs(int subject, int prerequisite, HashMap<Integer, ArrayList<Integer>> map, Set<Integer> visited, Set<Integer> currentPath) {
     
        if (currentPath.contains(subject)) return false;
        
        // If subject is already visited, return false to avoid reprocessing
        if (visited.contains(subject)) return false;

        // Check if prerequisite relationship exists directly
        if (!map.containsKey(subject) || map.get(subject).size() == 0) return false;
        if (map.get(subject).contains(prerequisite)) return true;
        
        // Mark subject as visited and add to the current path
        visited.add(subject);
        currentPath.add(subject);

        // Recur for all prerequisites of the subject
        for (int pre : map.get(subject)) {
            if (dfs(pre, prerequisite, map, visited, currentPath)) return true;
        }
        
        // Remove subject from current path after exploration
        currentPath.remove(subject);
        
        return false;
    }
}