/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
     fun inorderTraversal(root: TreeNode?): List<Int> {
        var list = mutableListOf<Int>()
    inOrderTraversalPrint(root, list)
    return list

    }

fun inOrderTraversalPrint(node: TreeNode?, list:MutableList<Int>){
    if(node == null) return 
    inOrderTraversalPrint(node.left, list)
    println("${node.`val`}")
    list.add(node.`val`)
    inOrderTraversalPrint(node.right, list)
}

}
