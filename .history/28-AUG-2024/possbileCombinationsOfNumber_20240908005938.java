public class possbileCombinationsOfNumber {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
  
       
         ArrayList<Integer> list1 = new ArrayList<>() ;
         
         list1.add(1) ; 
         list1.add(2) ;
         list1.add(3);
         
         ArrayList<Integer> mainList = new ArrayList<>() ;
      
    permutation(list1 ,mainList) ;
     
  }
  
  public static void permutation(ArrayList<Integer>list1, ArrayList<Integer> mainList) {
      if (list1.size() == 0) {
          System.out.println(mainList);
      } else {
          for (int i = 0; i < list1.size(); i++) {
            // Take the element at index i
            Integer element = list1.remove(i);
            mainList.add(element);
            
            // Recursively permute the remaining elements
            permutation(list1, mainList);
            
            // Backtrack: remove the element and add it back to list1
            list1.add(i, element);
            mainList.remove(mainList.size() - 1);
        }
    

}
