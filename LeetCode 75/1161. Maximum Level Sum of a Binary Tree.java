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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
//        List<Integer> sum = new ArrayList<>();
//        sum.add(root.val);
        int max = root.val;
        int level = 1;
        int currentLevel = 1;
        while (!queue.isEmpty()) {
            currentLevel++;
            int levelSize = queue.size();
            List<Integer> currentSum = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current.right != null) {
                    queue.offer(current.right);
                    currentSum.add(current.right.val);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                    currentSum.add(current.left.val);

                }
            }
            int currentTotalSum = currentSum.stream().mapToInt(Integer::intValue).sum();
            if (currentTotalSum > max  && !currentSum.isEmpty()) {
                max = currentTotalSum;
                level = currentLevel;
            }
          //  System.out.println("current level" + currentLevel);

        }
       // System.out.println(max);
      //  System.out.println(level);
        // System.out.println(queue.size());
        return level;
    }
}
