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

  //插入节点
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

  // 打印节点
  def printNode(root: TreeNode): Unit ={
    if(!(root eq null)){
      println(root.value)
      printNode(root.left)
      printNode(root.right)
    }
  }

  // 中序遍历
  def inOrderTraverse(root: TreeNode): Unit ={
    if(!(root eq null)){
      println(root.value)
      inOrderTraverse(root.left)
      inOrderTraverse(root.right)
    }
  }

  // 先序遍历
  def preOrderTraverse(root: TreeNode): Unit ={
    if(!(root eq null)){
      printNode(root.left)
      println(root.value)
      printNode(root.right)
    }
  }

  // 后序遍历
  def afOrderTraverse(root: TreeNode): Unit ={
    if(!(root eq null)){
      printNode(root.left)
      printNode(root.right)
      println(root.value)
    }
  }

  // 查找节点在当前二叉树中的深度
  def findLevel(node: TreeNode): Int = {
    val level = 0

  }
}
