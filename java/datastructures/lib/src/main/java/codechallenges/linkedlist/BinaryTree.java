package codechallenges.linkedlist;

import codechallenges.linkedlist.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

  public TreeNode root;

  public List<Integer> preOrder() {
    List<Integer> values = new ArrayList<>();

    // ***Left, Root, Right *** //

    preOrder(root, values);
    return values;
  }

  void preOrder(TreeNode currentNode, List values) {
    //base case
    if (currentNode == null) return;
    // Root, Left, Right
    values.add(currentNode.value);

    // Go Left
    preOrder(currentNode.left, values);

    // Go Right
    preOrder(currentNode.right, values);
  }

  ////////////////////////////////////////////////////

  public List<Integer> inOrder() {
    List<Integer> values = new ArrayList<>();

    // ***Left, Root, Right *** //

    inOrder(root, values);
    return values;
  }

  void inOrder(TreeNode currentNode, List values) {
    //base case
    if (currentNode == null) return;
    // Left, Root, Right
    // Go Left
    inOrder(currentNode.left, values);

    // Root
    values.add(currentNode.value);

    // Go Right
    inOrder(currentNode.right, values);
  }

  ////////////////////////////////////////////////////


  public List<Integer> postOrder() {
    List<Integer> values = new ArrayList<>();

    // ***Left, Right, Root  *** //

    postOrder(root, values);
    return values;
  }

  void postOrder(TreeNode currentNode, List values) {
    //base case
    if (currentNode == null) return;
    // Left, Right, Root

    // Go Left
    postOrder(currentNode.left, values);

    // Go Right
    postOrder(currentNode.right, values);

    // Root
    values.add(currentNode.value);

  }
}
