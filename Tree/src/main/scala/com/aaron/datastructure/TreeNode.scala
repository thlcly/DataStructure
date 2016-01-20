package com.aaron.datastructure

/**
 * @author tonyhui
 * @since  16/1/20
 */
class TreeNode {
  var value: Int = 0
  var left:TreeNode = null
  var right: TreeNode = null
}

object TreeNode{
  var root: TreeNode = _

  def insertTreeNode(currentNode:TreeNode, newNode: TreeNode):Unit = {
    if(root eq null){
      root = newNode
    }else{
      if(currentNode.value > newNode.value){
        if(currentNode.left eq null){
          currentNode.left = newNode
        }else{
          insertTreeNode(currentNode.left, newNode)
        }
      }else if(currentNode.value < newNode.value){
        if(currentNode.right eq null){
          currentNode.right = newNode
        }else{
          insertTreeNode(currentNode.right, newNode)
        }
      }else {
        println("该值已经存在")
      }
    }
  }

  def printNode(root: TreeNode): Unit ={
    if(!(root eq null)){
      println(root.value)
      printNode(root.left)
      printNode(root.right)
    }
  }
}
