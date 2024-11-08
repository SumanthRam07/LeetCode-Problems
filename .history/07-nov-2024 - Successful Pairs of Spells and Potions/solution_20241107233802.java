import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
     
        Arrays.sort(potions);
        int potionSize = potions.length;
        int[] result = new int[spells.length];
        
        for (int i = 0; i < spells.length; i++) {
           
            int count = successfulPairsHelper(spells[i], potions, success);
            result[i] = potionSize - count; 
        }
        
        return result;
    }

    public int successfulPairsHelper(int spell, int[] potions, long success) {
        int left = 0, right = potions.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            long product = (long) spell * potions[mid];
            
            if (product >= success) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        
        return left; 
    }
}
