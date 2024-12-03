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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    var list = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()
    preOrderTraversalPrint(p,list)        
    preOrderTraversalPrint(q,list2)
    if(list == list2){
        return true
    } 
    return false
    }

    fun preOrderTraversalPrint(node: TreeNode?,list:MutableList<Int>){
    if(node == null) {
        list.add(-121313)
        return
    }
    println(node.`val`)
    list.add(node.`val`)    
    preOrderTraversalPrint(node.left, list)
    preOrderTraversalPrint(node.right,list)
}
}
