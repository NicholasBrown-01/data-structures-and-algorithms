package codechallenges.linkedlist.TreesIntersection;

import codechallenges.linkedlist.BinaryTree;
import codechallenges.linkedlist.TreeNode;
import java.util.HashMap;

public class TreeIntersectionTest {

  public static void main(String[] args) {
    // Create nodes for BT1
    TreeNode bt1Root = new TreeNode(150);
    bt1Root.setLeft(new TreeNode(100, new TreeNode(75), new TreeNode(160, new TreeNode(125), new TreeNode(175))));
    bt1Root.setRight(new TreeNode(250, new TreeNode(200), new TreeNode(350, new TreeNode(300), new TreeNode(500))));

    // Create nodes for BT2
    TreeNode bt2Root = new TreeNode(42);
    bt2Root.setLeft(new TreeNode(100, new TreeNode(15), new TreeNode(160, new TreeNode(125), new TreeNode(175))));
    bt2Root.setRight(new TreeNode(600, new TreeNode(200), new TreeNode(350, new TreeNode(4), new TreeNode(500))));

    // Create binary trees
    BinaryTree bt1 = new BinaryTree();
    bt1.root = bt1Root;
    BinaryTree bt2 = new BinaryTree();
    bt2.root = bt2Root;

    // Create TreeIntersection object
    TreeIntersection treeIntersection = new TreeIntersection();

    // Find intersection
    HashMap<Integer, Boolean> intersection = treeIntersection.intersect(bt1, bt2);

    // Print result
    System.out.println("Intersection of BT1 and BT2: " + intersection.keySet());
  }
}
