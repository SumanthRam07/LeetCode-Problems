class Solution {
    
    Set<Integer> positiveDiagonal; 
   Set<Integer> negativeDiagonal; 
   Set<Integer> column; 
   int[][] chessBoard; 
  // List<List<String>> result; 
   int count  ;
   
   public int totalNQueens(int n) {
       
       
       chessBoard = new int[n][n];
       //result = new LinkedList<>();
       positiveDiagonal = new HashSet<>();
       negativeDiagonal = new HashSet<>();
       column = new HashSet<>();
       
       count = 0 ; 
       solveNQueensHelper(0, n);
       //return result;
       
       return count ; 
   }

   public void solveNQueensHelper(int r, int n) {
       if (r == n) {
           // List<String> temp = new LinkedList<>();
           // for (int[] row : chessBoard) {
           //     StringBuilder sb = new StringBuilder();
           //     for (int i : row) {
           //         if (i == 1) sb.append('Q');
           //         else sb.append('.');
           //     }
           //     temp.add(sb.toString());
           // }
           // result.add(temp);   
           // return;
           
           count ++ ;
           
           
       }

       for (int c = 0; c < n; c++) {
           if (column.contains(c) || positiveDiagonal.contains(r + c) || negativeDiagonal.contains(r - c)) {
               continue; 
           }

           column.add(c);
           positiveDiagonal.add(r + c);
           negativeDiagonal.add(r - c);
           chessBoard[r][c] = 1;

           solveNQueensHelper(r + 1, n);

           chessBoard[r][c] = 0; 
           column.remove(c);
           positiveDiagonal.remove(r + c);
           negativeDiagonal.remove(r - c);
       }
   }
}