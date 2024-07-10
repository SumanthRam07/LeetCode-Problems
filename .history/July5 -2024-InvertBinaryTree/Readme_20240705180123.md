# 
Hi Guys , Today i have started my trees revision and started with a basic traversal problem .
This problem is based on depth first search and basically simialr to post order , where u visit left , right and root node
ansd as per this problem, we have to interchnage them


**Problem Statement**
Given the root of a binary tree, invert the tree, and return its root.

**UMPIR Strategy**
The UMPIR strategy stands for Understand, Match, Plan, Implement, and Review. This strategy helps in systematically approaching and solving coding problems.
`
**Understand`**
Input: The root node of a binary tree.
Output: The root node of the binary tree after inverting it.
Binary Tree Inversion: Inverting a binary tree means swapping the left and right subtrees of every node in the tree.
Match
Match this problem with common data structure operations. In this case, the problem involves binary tree traversal and manipulation.

Tree Traversal: We need to visit each node to swap its children.
Recursive Solution: Using recursion, we can easily traverse and invert the tree.
Plan
Base Case: If the root is null, return null (i.e., an empty tree).
Swap: For each node, swap its left and right children.
Recursive Inversion: Recursively invert the left and right subtrees.
Return: Return the root after inverting the tree.
Implement
Here's the implementation of the invertTree function in Java:

java

```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}

```

**Review
Test Cases:**

Empty Tree: The input is null. The output should be null.
Single Node Tree: The tree only has one node. The output should be the same node.
Complete Binary Tree: Ensure that all left and right children are swapped correctly.
Imbalanced Tree: Test with trees that are skewed (left-heavy or right-heavy).
Time Complexity: The function visits each node once, so the time complexity is O(n), where n is the number of nodes in the tree.

Space Complexity: The space complexity is O(h), where h is the height of the tree, due to the recursion stack.

Example
Consider the following binary tree:

**markdown
Copy code
    4
   / \
  2   7
 / \ / \
1  3 6  9
After inverting, the tree becomes:

markdown
Copy code
    4
   / \
  7   2
 / \ / \
9  6 3  1**

By following the above steps, we ensure the binary tree is inverted correctly.