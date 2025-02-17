
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         if (root == null) return null;

        Stack<TreeNode> rootStack = new Stack<>();
        rootStack.push(root);

        while (!rootStack.isEmpty()) {
            TreeNode currentRoot = rootStack.pop();

            if (val == currentRoot.val) {
                return  currentRoot;
            }

            if (val > currentRoot.val && currentRoot.right != null) {
                rootStack.push(currentRoot.right);
            } 
            
            else if (currentRoot.left != null) {
                rootStack.push(currentRoot.left);
            }

        }

        return null;
    }
}
