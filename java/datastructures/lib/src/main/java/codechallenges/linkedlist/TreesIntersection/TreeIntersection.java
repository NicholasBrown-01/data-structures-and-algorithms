package codechallenges.linkedlist.TreesIntersection;

import codechallenges.linkedlist.BinaryTree;
import codechallenges.linkedlist.TreeNode;
import java.util.HashMap;
import java.util.List;

public class TreeIntersection {

  public HashMap<Integer, Boolean> intersect(BinaryTree tree1, BinaryTree tree2) {
    // Get the in-order traversal of both trees
    List<Integer> valuesTree1 = tree1.inOrder();
    List<Integer> valuesTree2 = tree2.inOrder();

    // Create a hashmap to store the intersection
    HashMap<Integer, Boolean> intersection = new HashMap<>();

    // Find the intersection of values between the two trees
    for (Integer value : valuesTree1) {
      if (valuesTree2.contains(value)) {
        intersection.put(value, true);
      }
    }

    // Return the intersection
    return intersection;
  }
}
