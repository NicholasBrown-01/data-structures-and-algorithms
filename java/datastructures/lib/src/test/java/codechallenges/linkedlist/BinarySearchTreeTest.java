package codechallenges.linkedlist;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

  @Test
  @DisplayName("Test for adding single to Binary Tree: ")
  void addOnceTEST() {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);

    Integer expected = 15;
    Integer actual = tree.root.value;

    assertEquals(expected, actual);
  }

  @Test
  @DisplayName("Test for Adding Smaller: ")
  void addSmallerTEST() {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(10);

    assertEquals(15, tree.root.value);

  }

  @Test
  @DisplayName("Test for Adding Larger: ")
  void addLargerTEST() {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(10);
    tree.add(20);

    assertEquals(15, tree.root.value); // Root value
    assertEquals(10, tree.root.left.value); // Left child of root
    assertEquals(20, tree.root.right.value); // Right child of root
  }

  @Test
  @DisplayName("Test for Contains: ")
  void containsTEST() {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(10);
    tree.add(20);

    assertTrue(tree.contains(10));
    assertFalse(tree.contains(50));
  }

}
