package 11-July-2023-Unique Binary search Trees;

# Unique Binary Search Trees

This repository contains a Java solution to the problem of finding the number of unique Binary Search Trees (BSTs) that can be formed with a given number of nodes. The solution is implemented using a recursive approach.

## Problem Statement

Given an integer `n`, return the number of structurally unique BST's (binary search trees) which have exactly `n` nodes of unique values from 1 to `n`.

## Solution Explanation

The code provides a recursive solution to calculate the number of unique BSTs for a given number of nodes. The main idea is to use the concept of Catalan numbers to count the number of BSTs.

### Code Structure

The solution is implemented in the `Solution` class with two main methods:

#### `buildTree(int start, int end)`

This is a recursive helper method that computes the number of unique BSTs that can be formed with nodes ranging from `start` to `end`.

It follows these steps:
- If `end` is less than `start`, return 1 (base case for empty subtree).
- If `end` is equal to `start`, return 1 (base case for a single-node tree).
- For each node `i` from `start` to `end`, consider `i` as the root and calculate the number of unique left and right subtrees recursively.
- The total number of unique BSTs with `i` as the root is the product of the number of left and right subtrees.
- Sum up the counts for all possible roots to get the total number of unique BSTs for the range.

#### `numTrees(int n)`

This method calls the `buildTree` method with the range from 1 to `n` to compute the number of unique BSTs for `n` nodes.

### Code

```java
public class Solution {

    public int buildTree(int start, int end) {
        if (end < start) {
            return 1;
        } else if (end == start) {
            return 1;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            int root = i;
            int a = buildTree(start, root - 1);
            int b = buildTree(root + 1, end);
            count += a * b;
        }
        return count;
    }

    public int numTrees(int n) {
        return buildTree(1, n);
    }
}
