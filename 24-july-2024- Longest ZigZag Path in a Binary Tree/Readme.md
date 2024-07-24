# Longest Zigzag Path in a Binary Tree

## Overview

This project contains a Java solution for finding the longest zigzag path in a binary tree. The solution involves defining a `TreeNode` class to represent the nodes of the binary tree and a `Solution` class to implement the logic for finding the longest zigzag path using a depth-first search (DFS) approach.

## TreeNode Class

The `TreeNode` class defines the structure of a binary tree node. Each node has an integer value, a left child, and a right child.

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
```


# Explanation
Class Members:

## int ans: Stores the length of the longest zigzag path found.
ArrayList<Integer> countArray: An auxiliary list used to store the lengths of paths encountered during the DFS.
dfs Method:

## Parameters:
TreeNode root: The current node in the DFS traversal.
int count: The current length of the zigzag path.
char prev: The direction from the previous node ('l' for left, 'r' for right).
If the current node is null, the method returns.
Updates ans to be the maximum of the current path length and ans.
Depending on the direction (prev), recursively calls dfs on the left and right children with updated path lengths.
longestZigZag Method:

Initializes prev to 'l' and count to 0.
Starts the DFS traversal from the root.
Returns the length of the longest zigzag path (ans).


# Time and Space Complexity
## Time Complexity: O(N), where N is the number of nodes in the binary tree. Each node is visited once during the DFS traversal.
## Space Complexity: O(H), where H is the height of the tree. This is due to the recursive call stack in the DFS traversal. In the worst case, H can be N for a skewed tree.
