
 * Balanced Binary Tree Checker
 * ============================
 *
 * This Java program checks if a binary tree is balanced using recursive algorithms.
 *

 *
 * Overview:
 * ---------
 * This program defines a `Solution` class that provides methods to determine if a given binary tree,
 * represented by `TreeNode` objects, is balanced. A binary tree is considered balanced if the heights
 * of its left and right subtrees differ by no more than 1.
 *
 * Classes:
 * --------
 * - `TreeNode`:
 *   Definition for a binary tree node with fields for value (`val`), left child (`left`), and right child (`right`).
 *
 * - `Solution`:
 *   Contains methods:
 *   - `checkBalanced(TreeNode root)`: Recursively computes the height of each subtree and checks if it is balanced.
 *   - `isBalanced(TreeNode root)`: Returns `true` if the tree is balanced, using `checkBalanced(root)`.
 *
 * Installation:
 * -------------
 * 1. Clone the repository:
 *    ```
 *    git clone https://github.com/your-username/balanced-binary-tree.git
 *    cd balanced-binary-tree
 *    ```
 *
 * 2. Compile and run the program:
 *    ```
 *    javac Solution.java
 *    java Solution
 *    ```
 *
 * Usage:
 * ------
 * - Modify `TreeNode` class or `Solution` class as needed for your specific tree structure.
 * - Call `isBalanced(TreeNode root)` method with the root of your binary tree to check for balance.
 *
 * Examples:
 * ---------
 * ```java
 * public class Main {
 *     public static void main(String[] args) {
 *         // Example usage
 *         TreeNode root = new TreeNode(1);
 *         root.left = new TreeNode(2);
 *         root.right = new TreeNode(3);
 *         root.left.left = new TreeNode(4);
 *
 *         Solution solution = new Solution();
 *         boolean isBalanced = solution.isBalanced(root);
 *         System.out.println("Is the tree balanced? " + isBalanced);
 *     }
 * }
 * ```


### time and space Complexity

 Time complexity : In worst case ,we have to visit all the nodes,so it would be 0(h) 
 Space complexity : In worst , we need to stack up the all the nodes into the stack memory : o (m) , where m is number of nodes.
 *

 