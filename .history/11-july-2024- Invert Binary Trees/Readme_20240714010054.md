# Binary Tree Inversion


## Overview
This project contains a Java class named `Solution` that provides methods to invert a binary tree. The inversion process involves swapping the left and right children of all nodes in the tree.

## Features
- Inverts a binary tree.
- Utilizes a post-order traversal to invert the tree recursively.

### My thought process. 

 this problem is basically a post order , at every step we need to interchnage the left node with the right node.

## Usage
To use the `Solution` class, you need to have a binary tree represented using `TreeNode` objects. Here's an example of how to use the class:

```java
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        TreeNode invertedRoot = solution.invertTree(root);
        // Add your code here to print or process the inverted tree
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} ```


# Space and Time Complexity
Time Complexity
The time complexity of this solution is 𝑂(𝑛)
where  𝑛  is the number of nodes in the tree. This is because each node in the tree is visited once.

## Space Complexity
The space complexity of this solution is 𝑂(ℎ)
where  ℎ is the height of the tree. This space is used by the recursion stack. In the worst case, the height of the tree is 𝑂(𝑛) (in the case of a skewed tree), making the space complexity 𝑂(𝑛)
