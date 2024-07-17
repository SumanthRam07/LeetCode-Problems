# Unique Binary Search Trees

## Problem Statement
Given an integer `n`, return the number of structurally unique BST's (binary search trees) which has exactly `n` nodes of unique values from `1` to `n`.


## MY Thought process
Before doing this question , i was doing some in order and post order traversal problems using the recusrsion , i realized this problems would definately require recursion as iteratively , this would take up some much time and space complexity and understood that, we have to solve the each block of the input  as root node and append all the left and right possible nodes to it .


## Solution Explanation
This solution uses recursion to count the number of unique BSTs that can be constructed using values from `start` to `end`.

### Approach
1. **Recursive Function (buildTree)**: 
   - If `end` is less than `start`, return 1 because there are no nodes to construct a tree.
   - If `end` equals `start`, return 1 because there's only one way to construct the tree with a single node.
   - Iterate through each value from `start` to `end`, considering each value as the root of the tree.
   - For each root, recursively calculate the number of unique BSTs that can be formed on the left (`start` to `root-1`) and right (`root+1` to `end`) subtrees.
   - Multiply the number of unique BSTs from the left and right subtrees and add to the total count.

2. **Wrapper Function (numTrees)**:
   - Calls the recursive function `buildTree` with `start` as 1 and `end` as `n`.

## Space Complexity= O(n)
## Time Complexity = O(n) 