package 08-OCT-2024-Find All Possible Recipes from Given Supplies;
import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // Create a map to store recipes and their ingredients.
        HashMap<String, List<String>> map = new HashMap<>();
        
        // Populate the map with recipe names and their corresponding ingredients.
        for (int i = 0; i < recipes.length; i++) {
            map.put(recipes[i], ingredients.get(i));
        }

        // Convert the supplies array to a List.
        Set<String> supplier = new HashSet<>(Arrays.asList(supplies));
        
        // List to store successfully created recipes.
        List<String> rCreated = new ArrayList<>();
        
        // State map to track the state of each recipe during DFS.
        Map<String, Integer> state = new HashMap<>();
        
        // For each recipe, check if it can be created using the DFS approach.
        for (String recipe : recipes) {
            if (dfs(recipe, map, supplier, state)) {
                rCreated.add(recipe); // If the recipe can be created, add it to the result.
            }
        }
        
        return rCreated; // Return the list of successfully created recipes.
    }
    
    // DFS method to check if a recipe can be created.
    public boolean dfs(String recipe, Map<String, List<String>> map, Set<String> supplier, Map<String, Integer> state) {
        // If the recipe is already processed, return true.
        if (state.getOrDefault(recipe, 0) == 1) return true;
        // If the recipe is in processing state, it means there is a cycle. Return false.
        if (state.getOrDefault(recipe, 0) == -1) return false;
        
        // If the recipe is not in the map and not a supply, it cannot be created.
        if (!map.containsKey(recipe) && !supplier.contains(recipe)) return false;
        
        // If the recipe is a direct supply, it can be created.
        if (supplier.contains(recipe)) return true;
        
        // Mark this recipe as being processed.
        state.put(recipe, -1);
        
        // Get the list of ingredients needed for this recipe.
        List<String> ingredients = map.get(recipe);
        
        // Check each ingredient to see if it is available or can be created.
        for (String curIngredient : ingredients) {
            // If the ingredient is not in the supplier list and cannot be created, return false.
            if (!supplier.contains(curIngredient) )) {
                if (!dfs(curIngredient, map, supplier, state)) {
                    return false; // If any ingredient cannot be created, return false.
                }
            }
        }
        
        // Mark this recipe as processed and add to supplier as it can now be created.
        state.put(recipe, 1);
        supplier.add(recipe); // Add recipe to supplier list as it can now be considered a supply.
        
        return true; // Return true if all ingredients are available or can be created.
    }
}
