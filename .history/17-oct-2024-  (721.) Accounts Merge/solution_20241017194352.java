package 17-oct-2024;

public class solution {

    import java.util.*;

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; 
        }
    }

    // Find with path compression
    public int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);  // Path compression
        }
        return parent[x];
    }

    // Union by rank
    public boolean union(int x1, int x2) {
        int root1 = find(x1);
        int root2 = find(x2);

        if (root1 == root2) {
            return false;
        }

        // Union by rank
        if (rank[root1] > rank[root2]) {
            parent[root2] = root1;
            rank[root1] += rank[root2];
        } else {
            parent[root1] = root2;
            if (rank[root1] == rank[root2]) {
                rank[root2]++;
            }
        }
        return true;
    }
}

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        UnionFind uf = new UnionFind(n);
        Map<String, Integer> emailToAcc = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {  
                String email = account.get(j);
                if (emailToAcc.containsKey(email)) {
                    uf.union(i, emailToAcc.get(email));
                } else {
                    emailToAcc.put(email, i);
                }
            }
        }

       
        Map<Integer, List<String>> emailGroup = new HashMap<>();
        for (Map.Entry<String, Integer> entry : emailToAcc.entrySet()) {
            String email = entry.getKey();
            int accountIndex = entry.getValue();
            int leader = uf.find(accountIndex);

            emailGroup.computeIfAbsent(leader, k -> new ArrayList<>()).add(email);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : emailGroup.entrySet()) {
            int accountIndex = entry.getKey();
            List<String> emails = entry.getValue();
            Collections.sort(emails);  
            List<String> mergedAccount = new ArrayList<>();
            mergedAccount.add(accounts.get(accountIndex).get(0)); 
            mergedAccount.addAll(emails);  
            result.add(mergedAccount);
        }

        return result;
    }
}
    
}
