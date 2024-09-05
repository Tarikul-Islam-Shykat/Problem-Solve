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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafNodes1 = new ArrayList<>();
        List<Integer> leafNodes2 = new ArrayList<>();
        collectLeafNodes(root1, leafNodes1);
        collectLeafNodes(root2, leafNodes2);
        return leafNodes1.equals(leafNodes2);
    }

       public void collectLeafNodes(TreeNode root, List<Integer>list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }

        collectLeafNodes(root.left, list);
        collectLeafNodes(root.right, list);
    }

}
