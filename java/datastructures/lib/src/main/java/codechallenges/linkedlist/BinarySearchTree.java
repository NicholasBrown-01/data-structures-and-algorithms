package codechallenges.linkedlist;

public class BinarySearchTree extends BinaryTree {
  public void add(Integer value) {
    TreeNode nodeToAdd = new TreeNode(value);
    if (root == null) {
      root = nodeToAdd;
    } else {
      add(root, nodeToAdd);
    }
  }

  void add(TreeNode current, TreeNode nodeToAdd) {
    if (current == null) return;

    if (nodeToAdd.value < current.value) {
      //go left
      if (current.left == null) {
        current.left = nodeToAdd;
      } else {
        add(current.left, nodeToAdd);
      }
    } else {
      if (current.right == null) {
        current.right = nodeToAdd;
      } else {
        add(current.right, nodeToAdd);
      }
    }
    // You need to handle the case where nodeToAdd.value >= current.value, typically adding to the right
  }

  public boolean contains (Integer value){
    return contains(root, value);
  }

  private boolean contains(TreeNode current, Integer value){
    if (current == null)
      return false;
    if (current.value.equals(value))
      return true;
    return contains(current.left, value) || contains(current.right, value);
  }
}
