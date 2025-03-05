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
    public TreeNode deleteNode(TreeNode root, int val) {
         if (root == null) return null;

    TreeNode parent = null;
    TreeNode current = root;

    // Step 1: Find the node to delete and its parent
    while (current != null && current.val != val) {
        parent = current;
        if (val < current.val) {
            current = current.left;
        } else {
            current = current.right;
        }
    }

    if (current == null) return root;  // Node not found

    // Step 2: Handle deletion cases

    // Case 1: Node has no children (leaf)
    if (current.left == null && current.right == null) {
        if (parent == null) return null; // Deleting root with no children
        if (parent.left == current) parent.left = null;
        else parent.right = null;
    }

    // Case 2: Node has only one child
    else if (current.left == null || current.right == null) {
        TreeNode child = (current.left != null) ? current.left : current.right;
        if (parent == null) return child; // Deleting root with one child
        if (parent.left == current) parent.left = child;
        else parent.right = child;
    }

    // Case 3: Node has two children
    else {
        // Find in-order successor (smallest in right subtree)
        TreeNode successorParent = current;
        TreeNode successor = current.right;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        // Replace current's value with successor's value
        current.val = successor.val;

        // Delete the successor node
        if (successorParent.left == successor) {
            successorParent.left = successor.right;
        } else {
            successorParent.right = successor.right;
        }
    }

    return root;
    }
}
