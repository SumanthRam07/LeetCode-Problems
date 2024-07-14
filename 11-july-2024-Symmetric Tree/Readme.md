# Symmetric Tree Checker


## Overview
This project contains a Java class named `Solution` that provides a method to determine whether a binary tree is symmetric around its center. A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

## Features
- Checks if a binary tree is symmetric.
- Utilizes a recursive approach to compare nodes.

## Thought process 
 
  Initially i could not come up with this uproach directly , i have trying to use the  level order traversal bu using a queue and comparing at each level , but i realized , we have to traverse the same tree in two different ways , one from left to right and other one in the opposite way and compare each result set .

  With this idead , i have joined the both the calls using the '&&' operator and called them.
 

## Usage
To use the `Solution` class, you need to have a binary tree represented using `TreeNode` objects. Here's an example of how to use the class:

```java
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution solution = new Solution();
        boolean isSymmetric = solution.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + isSymmetric);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} ```


### Code Explanation
The Solution class contains two methods:

1) isSame(TreeNode t1, TreeNode t2): This method checks if two subtrees are mirror images of each other.
2) isSymmetric(TreeNode root): This method checks if the entire tree is symmetric by comparing the left and right subtrees of the root.



# Space and Time Complexity
Time Complexity
The time complexity of this solution is 𝑂(𝑛)
where  𝑛  is the number of nodes in the tree. This is because each node in the tree is visited once.

## Space Complexity
The space complexity of this solution is 𝑂(ℎ)
where  ℎ is the height of the tree. This space is used by the recursion stack. In the worst case, the height of the tree is 𝑂(𝑛) (in the case of a skewed tree), making the space complexity 𝑂(𝑛)
