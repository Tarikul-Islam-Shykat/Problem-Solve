# Binary Search Tree (BST) - Delete Node Implementation

This repository contains an iterative implementation of the `deleteNode` method for a Binary Search Tree (BST). The `deleteNode` method deletes a node from a BST with a given value and handles all possible deletion cases:
1. Deleting a leaf node (no children).
2. Deleting a node with one child.
3. Deleting a node with two children.

The method is implemented using a **stack** to avoid recursion, performing an iterative preorder traversal to find the node to be deleted and adjusting the tree accordingly.

## **Table of Contents**

- [Overview](#overview)
- [Features](#features)
- [Code Explanation](#code-explanation)
- [Example Usage](#example-usage)
- [Edge Cases](#edge-cases)
- [Time and Space Complexity](#time-and-space-complexity)
- [Contributing](#contributing)

## **Overview**

The `deleteNode` method removes a node from a Binary Search Tree (BST) given a node value and returns the updated root of the tree. It works iteratively by performing a preorder traversal using a stack to find the node and then performs the appropriate deletion operation based on the number of children the node has.

### **Deletion Cases**
1. **Leaf Node:** If the node has no children, simply remove it.
2. **One Child:** If the node has one child (either left or right), replace the node with its child.
3. **Two Children:** If the node has two children, replace it with the inorder successor (the smallest node in the right subtree), then delete the successor node.

## **Features**

- **Iterative approach** using a stack to avoid recursion.
- Handles all three cases for deleting a node in a Binary Search Tree.
- Returns the updated root after deletion.
- Simple and easy-to-understand code structure.

## **Code Explanation**

The `deleteNode` method performs the following steps:

1. **Find the Node to Delete:**
   - It uses a stack to perform an iterative preorder traversal of the tree.
   - If the node with the specified value is found, the method proceeds to handle the deletion.

2. **Handle Deletion:**
   - **Leaf Node:** Simply remove the node by setting the parent’s pointer to `null`.
   - **One Child:** Replace the node with its single child.
   - **Two Children:** 
     - Find the inorder successor, which is the smallest node in the right subtree.
     - Replace the current node's value with the successor's value.
     - Delete the successor node.

## **Example Usage**

To use the `deleteNode` method, create a `TreeNode` object for the root of your BST and call the method by passing the root and the value to delete.

For example, given the tree:

```plaintext
         5
        / \
       3   8
      / \   \
     2   4   9
        / \
       1   2


TreeNode root = buildTree(new int[]{5, 3, 8, 2, 4, 9, 1, 2});
TreeNode updatedRoot = deleteNode(root, 3);


