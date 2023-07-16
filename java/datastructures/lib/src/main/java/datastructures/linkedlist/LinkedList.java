package datastructures.linkedlist;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not strictly required

  public void insert(int value) { // 1st Task
    Node insertNode = new Node(value);
    insertNode.next = head;
    head = insertNode;
  }

  public boolean includes(int value) { // 2nd Task
    Node currentNode = head;

    while (currentNode != null) {
      if (currentNode.value == value) {
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  @Override
  public String toString() { // 3rd Task
    StringBuilder stringNode = new StringBuilder();
    Node currentNode = head;

    while (currentNode != null) {
      stringNode.append("{ ").append((char) currentNode.value).append(" } -> ");
      currentNode = currentNode.next;
    }
    stringNode.append("NULL");
      return stringNode.toString();
  }
}

