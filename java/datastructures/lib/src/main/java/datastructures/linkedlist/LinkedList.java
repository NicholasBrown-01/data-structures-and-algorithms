package datastructures.linkedlist; // Program has to know where it is and have access for it to work.

public class LinkedList { // Needs to be accessible to run. Probably helps. A lot.
  Node head = null; // Defining the start and setting to null because nothing has been placed in it yet.
  Node tail = null;  // Not really required but makes for cleaner code because you are defining the default value instead of assuming

  public void insert(int value) { // 1st Task
    Node insertNode = new Node(value); // Have make a node to put data into.
    insertNode.next = head; // When inserting nodes to the beginning(head) we need to literally tell it to add it to the beginning.
    head = insertNode; // Once we insert a node we need to re-reference the head to this new node and thus an updated beginning.
  }

  public boolean includes(int value) { // 2nd Task
    Node currentNode = head; // Set the current node to the beginning(head)

    while (currentNode != null) { // If the value of that current node(head) is not empty of data...
      if (currentNode.value == value) { // then the value that is in that node is in fact its value
        return true; // so we will return true that it has a current value
      }
      currentNode = currentNode.next; // let's move onto the next node to see if it has a value
    }
    return false; // the current node did NOT have a value. So it's null, and we aren't moving on to the next node...because there probably isn't one.
  }

  @Override
  public String toString() { // 3rd Task
    StringBuilder stringNode = new StringBuilder(); // Have to use built in Java class StringBuilder to make strings in the nodes.
    Node currentNode = head; // Set the current node to the beginning(head)

    while (currentNode != null) { // If the value of that current node(head) is not empty of data...
      stringNode.append("{ ").append((char) currentNode.value).append(" } -> "); // then we are going to append(attach) these "{}->" to the char(because we used single letters "a" "b" and those are primitives to the current nodes value.
      currentNode = currentNode.next; // let's move onto the next node to see if it has a value
    }
    stringNode.append("NULL"); // No next node? Make it "NULL"
      return stringNode.toString(); // Let's make really sure we are getting back a String and not some I@65537 stuff
  }
}

