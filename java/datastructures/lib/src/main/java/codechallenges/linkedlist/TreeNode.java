package codechallenges.linkedlist;

public class TreeNode {
  public Integer value;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(Integer value) {
    this.value = value;  // added this line to assign value
  }

  public TreeNode(Integer value, TreeNode left, TreeNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "TreeNode{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
