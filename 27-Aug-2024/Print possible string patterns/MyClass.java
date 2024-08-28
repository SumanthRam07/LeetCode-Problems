package 27-Aug-2024.Print possible string patterns;

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
  
  
      
    permutation("abc") ;
      
    }
    
    
    
    
    
    
   public static void permutation(String str) {
      permutation(str, "");
  }
  
  public static void permutation(String str, String prefix) {
      if (str.length() == 0) {
          System.out.println(prefix);
      } else {
          for( int i = 0 ; i < str.length() ; i++)
          {
               
               String temp = str.substring(0,i) + str.substring(i+1)  ;
               
                 System.out.println(" sub string 0 , "+ i +  "= >" + str.substring(0,i)   ) ;
                 
                 System.out.println(" sub string  , " + i+1 +"= >" + str.substring(i+1)   ) ;
               
               System.out.println(temp) ;
               
               permutation(temp , prefix+str.charAt(i)) ;
          }
      }
  }
  }
