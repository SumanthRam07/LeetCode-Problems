# 🌳 Maximum Depth of Binary Tree

## 📜 Problem Statement
Given the `root` of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## 💡 Solution Explanation
This solution uses a post-order traversal to determine the maximum depth of the binary tree. The depth of a binary tree is the maximum depth between its left and right subtrees plus one (for the root node).

### 🔍 Approach
1. **Recursive Function (`postOrder`)**: 
   - If the `root` is `null`, return 0 because an empty tree has depth 0.
   - Recursively calculate the height of the left subtree.
   - Recursively calculate the height of the right subtree.
   - The maximum depth is the greater of the two heights plus one (for the root node).

2. **Wrapper Function (`maxDepth`)**:
   - Calls the recursive function `postOrder` with the `root` of the tree.

## 💻 Code

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0; 
        }

        int leftHeight = postOrder(root.left); 
        int rightHeight = postOrder(root.right); 

        return Math.max(leftHeight, rightHeight) + 1; 
    }

    public int maxDepth(TreeNode root) {
        return postOrder(root);
    }
}
```

##  🚀 How to Run

### Ensure you have Java installed: Make sure you have Java installed on your machine. You can download it from the official website.

### Save the Code: Copy the code into a file named Solution.java.

#### Compile the Code: Open your terminal or command prompt, navigate to the directory where Solution.java is saved, and compile the code using the following command:


```
javac Solution.java
Run the Code: After compilation, run the code using the following command:

java Solution
Test the Function: To test the function, you will need to add a main method and call the maxDepth method with a sample input. Here’s an example of how you can modify the code to include a test:
```

java

public class Solution {
    
    // (Include the TreeNode class and Solution class with methods here)

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        System.out.println("Maximum depth of the binary tree is: " + solution.maxDepth(root));
    }
}
## Run the Test: Compile and run the modified code to see the output.

## Time Complexity
The time complexity of this solution is O(N), where N is the number of nodes in the binary tree. This is because we visit each node exactly once.

## Space Complexity
The space complexity is determined by the maximum depth of the recursion tree, which can go up to O(H), where H is the height of the tree. In the worst case, this can be O(N) if the tree is completely unbalanced (a degenerate tree), and O(log N) if the tree is balanced.

## 📌 Conclusion
This approach provides an efficient way to calculate the maximum depth of a binary tree using a post-order traversal. The solution effectively traverses the tree to determine the depth of the left and right subtrees and combines their results to get the final maximum depth.