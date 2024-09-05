package 04-sep-2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

       List<List<String>> res ; 
    
      Set<Integer> col ;
    
     Set<Integer> posDiag ;
    
    Set<Integer> negDiag ;
    
    char[][] board ;
    
    
    
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        col = new HashSet<>();
 posDiag = new HashSet<>();
        negDiag = new HashSet<>();
     board = new char[n][n];
        
        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(0, n);
        return res;
    }

    private void backtrack(int r, int n) {
        if (r == n) {
            List<String> copy = new ArrayList<>();
            for (char[] row : board) {
                copy.add(new String(row));
            }
            res.add(copy);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)) {
                continue;
            }

            col.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);
            board[r][c] = 'Q';
            
            backtrack(r + 1, n, col, posDiag, negDiag, board, res);

            col.remove(c);
            posDiag.remove(r + c);
            negDiag.remove(r - c);
            board[r][c] = '.';
        }
    }
}
