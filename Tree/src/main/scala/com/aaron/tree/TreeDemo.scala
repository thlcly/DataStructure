package com.aaron.tree

import com.aaron.datastructure.TreeNode

/**
 * @author tonyhui
 * @since  16/1/20
 */
object TreeDemo {
  def main(argus:Array[String]) = {
    val treeNode1 = new TreeNode
    treeNode1.value = 25
    val treeNode2 = new TreeNode
    treeNode2.value = 19
    val treeNode3 = new TreeNode
    treeNode3.value = 30
    val treeNode4 = new TreeNode
    treeNode4.value = 18
    val treeNode5 = new TreeNode
    treeNode5.value = 20
    TreeNode.insertTreeNode(TreeNode.root, treeNode1)
    TreeNode.insertTreeNode(TreeNode.root, treeNode2)
    TreeNode.insertTreeNode(TreeNode.root, treeNode3)
    TreeNode.insertTreeNode(TreeNode.root, treeNode4)
    TreeNode.insertTreeNode(TreeNode.root, treeNode5)
    TreeNode.printNode(TreeNode.root)
  }
}
