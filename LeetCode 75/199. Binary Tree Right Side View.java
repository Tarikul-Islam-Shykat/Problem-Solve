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
    public List<Integer> rightSideView(TreeNode root) {

       List<Integer> result = new LinkedList<>();

        if (root == null) return result ;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //   System.out.println(queue.size());
        while (!queue.isEmpty()) {
            List<Integer> levelValues = new ArrayList<>();
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode current = queue.poll();
                levelValues.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(levelValues.get(levelValues.size() - 1));
            //  System.out.println(levelValues);
            //    System.out.println();
        }
        return result;
        //   System.out.println(result);
        
    }
}
