package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

  @Test //Can successfully instantiate an empty linked list
  void instantiateEmptyListTEST() {
    LinkedList sut = new LinkedList();
    //Assert
    assertNull(sut.head);
    System.out.println("The current head's value is: "+sut.head);

  }
  @Test //Can properly insert into the linked list
  void insertNodeTEST() {
    LinkedList sut = new LinkedList();
    sut.insert(21);

    //Assert
    assertEquals(21, sut.head.value);
    System.out.println("Inserted Head value is: " + sut.head.value);
  }
  @Test //Will return true when finding a value within the linked list that exists AND false when searching for a value in the linked list that does not exist
  void includesNodeTEST() {
    LinkedList sut = new LinkedList();
    sut.insert(33);

    //Assert
    assertTrue(sut.includes(33));
    System.out.println("Was 33 present in the list: "+sut.includes(33));
    assertFalse(sut.includes(43));
    System.out.println("Was 43 present in th list: "+sut.includes(43));
  }

  @Test //Can properly return a collection of all the values that exist in the linked list
  void toStringNodeTEST() {
    LinkedList sut = new LinkedList();
    sut.insert('a');
    sut.insert('b');
    sut.insert('c');
    sut.insert('d');
    sut.insert('e');

    String tested = sut.toString();
    String expected = "{ e } -> { d } -> { c } -> { b } -> { a } -> NULL";
    //Assert
    assertEquals(expected, tested);
    System.out.println("The expected string: "+expected+ "\n" + "matched the string tested: "+tested);
  }
}
