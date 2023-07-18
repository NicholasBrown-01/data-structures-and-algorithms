package datastructures.linkedlist; // Program has to know where it is and have access for it to work.

public class LinkedList { // Needs to be accessible to run. Probably helps. A lot.
  Node head = null; // Defining the start and setting to null because nothing has been placed in it yet.
  Node tail = null;  // Not really required but makes for cleaner code because you are defining the default value instead of assuming

  public void insert(int value) { // 1st Task
    Node insertNode = new Node(value); // Have make a node to put data into.
    insertNode.next = this.head; // When inserting nodes to the beginning(head) we need to literally tell it to add it to the beginning.
    this.head = insertNode; // Once we insert a node we need to re-reference the head to this new node and thus an updated beginning.
  }

  public boolean includes(int value) { // 2nd Task
    Node currentNode = this.head; // Set the current node to the beginning(head)

    while (currentNode != null) { // If the value of that current node(head) is not empty of data...
      if (currentNode.value == value) { // then the value that is in that node is in fact its value
        return true; // so we will return true that it has a current value
      }
      currentNode = currentNode.next; // let's move onto the next node to see if it has a value
    }
    return false; // the current node did NOT have a value. So it's null, and we aren't moving on to the next node...because there probably isn't one.
  }

  //////////// CODE CHALLENGE 06 ////////////////////////

  public int append(int value) {
    Node appendNode = new Node(value); // Have make a node to put data into.
    appendNode.next = null; // Assign the next node to null in case it's the tail...it should point to null.
    if (this.head == null) { // If the head is equal to null than...
      this.head = appendNode; // make the head this value
      this.tail = appendNode; // make the tail this value....since it was all empty anyway
    } else {
      this.tail.next = appendNode; // link the nodes
      this.tail = appendNode; // put in the new value
    }
    return value;
  }

  public void insertBefore(int value, int searchValue) {
    Node insertBeforeNode = new Node(value); // Have make a node to put data into.
    Node current = this.head;

    if (this.head == null) { // If the head is equal to null than...
      insertBeforeNode.next = null; // Assign the next node to null in case it's the tail...it should point to null.
      this.head = insertBeforeNode; // take the current head null value and make it the insertBeforeNode value
      this.tail = insertBeforeNode; // since head was null, therefore there was not a tail, so make it the insertBeforeNode value too
      return;
    }
    if (this.head.value == searchValue) { // If the searched(targeted) Value is the same as the head than..
      insertBeforeNode.next = this.head; // well that was a quick search..put your value here
      this.head = insertBeforeNode; // you are now the beginning node (head)
      return;
    }
    while (current.next != null) { // while the next node does not equal node
      if (current.next.value == searchValue) { // if the next node's value matches the search value...then you are here!
        insertBeforeNode.next = current.next; // link the two nodes
        current.next = insertBeforeNode; // put the new value in
        return;
      }
      current = current.next; // keep moving on
    }
  }

  public void insertAfter(int value, int searchValue) {
    Node insertAfterNode = new Node(value); // Have make a node to put data into.
    Node current = this.head; // make a beginning

  // Basically copy & paste from insertBefore but removed head conditions.

    while (current != null) {
      if (current.value == searchValue) {
        insertAfterNode.next = current.next;
        current.next = insertAfterNode;
        if (current == this.tail) {
          this.tail = insertAfterNode;
        }
        return;
      }
      current = current.next;
    }
  }

  @Override
  public String toString() { // 3rd Task
    StringBuilder stringNode = new StringBuilder(); // Have to use built in Java class StringBuilder to make strings in the nodes.
    Node currentNode = this.head; // Set the current node to the beginning(head)

    while (currentNode != null) { // If the value of that current node(head) is not empty of data...
      stringNode.append("{ ").append((char) currentNode.value).append(" } -> "); // then we are going to append(attach) these "{}->" to the char(because we used single letters "a" "b" and those are primitives to the current nodes value.
      currentNode = currentNode.next; // let's move onto the next node to see if it has a value
    }
    stringNode.append("NULL"); // No next node? Make it "NULL"
      return stringNode.toString(); // Let's make really sure we are getting back a String and not some I@65537 stuff
  }

  //////////// CODE CHALLENGE 07 ////////////////////////
  public int kthFromEnd(int k) {
    if (head == null || k < 0) {
      throw new IllegalArgumentException("List is empty or k is not positive");
    }

    Node p1 = head; // Set P1 to head along with P2
    Node p2 = head;

    for (int i = 0; i < k; i++) { // Move P1 along the LinkedList to find the end.
      p1 = p1.next; // Set P1 to the last node
      if (p1 == null) // Need to make sure k is not longer than the LinkedList
        throw new IllegalArgumentException("k exceeds length");
    }


    while (p1.next != null) {
      p1 = p1.next;
      p2 = p2.next; // Set P2 to P1 to count back from.
    }
    return p2.value;
  }
}

