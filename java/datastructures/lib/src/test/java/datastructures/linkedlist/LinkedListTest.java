package datastructures.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

  @Test
    //Can successfully instantiate an empty linked list
  void instantiateEmptyListTEST() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Assert
    assertNull(sut.head);
    System.out.println("The current head's value is: " + sut.head);

  }

  @Test
    //Can properly insert into the linked list
  void insertNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();

    //Act
    sut.insert(21);

    //Assert
    assertEquals(21, sut.head.value);
    System.out.println("Inserted Head value is: " + sut.head.value);
  }

  @Test
    //Will return true when finding a value within the linked list that exists AND false when searching for a value in the linked list that does not exist
  void includesNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();

    // Act
    sut.insert(33);

    //Assert
    assertTrue(sut.includes(33));
    System.out.println("Was 33 present in the list: " + sut.includes(33));
    assertFalse(sut.includes(43));
    System.out.println("Was 43 present in th list: " + sut.includes(43));
  }

  @Test
    //Can properly return a collection of all the values that exist in the linked list
  void toStringNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.insert('a');
    sut.insert('b');
    sut.insert('c');
    sut.insert('d');
    sut.insert('e');
    String tested = sut.toString();
    String expected = "{ e } -> { d } -> { c } -> { b } -> { a } -> NULL";
    //Assert
    assertEquals(expected, tested);
    System.out.println("The expected string: " + expected + "\n" + "matched the string tested: " + tested);
  }

  ///////////////////// CODE CHALLENGE 06 ////////////////////////////
  @Test
  void appendNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.append(5);
    sut.append(10);
    sut.append(15);
    //Assert
    assertTrue(sut.includes(5));
    System.out.println("Was 5 present in the list: " + sut.includes(5));
    assertTrue(sut.includes(10));
    System.out.println("Was 10 present in the list: " + sut.includes(10));
    assertTrue(sut.includes(15));
    System.out.println("Was 15 present in the list: " + sut.includes(15));
    assertFalse(sut.includes(20));
    System.out.println("Was 20 present in the list: " + sut.includes(20));
  }

  @Test
  void insertBeforeNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.append(5);
    sut.append(10);
    sut.append(15);
    sut.insertBefore(6, 15);
    //Assert
    assertTrue(sut.includes(5));
    System.out.println("Was 8 present in the list: " + sut.includes(5));
    assertTrue(sut.includes(10));
    System.out.println("Was 10 present in the list: " + sut.includes(10));
    assertTrue(sut.includes(6));
    System.out.println("6 INSERTED BEFORE: " + sut.includes(6));
    assertTrue(sut.includes(15));
    System.out.println("Was 15 present in the list: " + sut.includes(15));
  }

  @Test
  void insertAfterNodeTEST() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.append(5);
    sut.append(10);
    sut.append(15);
    sut.insertAfter(6, 15);
    //Assert
    assertTrue(sut.includes(5));
    System.out.println("Was 8 present in the list: " + sut.includes(5));
    assertTrue(sut.includes(10));
    System.out.println("Was 10 present in the list: " + sut.includes(10));
    assertTrue(sut.includes(6));
    System.out.println("6 INSERTED AFTER: " + sut.includes(6));
    assertTrue(sut.includes(15));
    System.out.println("Was 15 present in the list: " + sut.includes(15));
  }

  //////////// CODE CHALLENGE 07 ////////////////////////

  @Test
  @DisplayName("K Same Length TEST")
  void kSameLengthTEST() {
    LinkedList sut = new LinkedList();
    //Act
    sut.insert(2);
    sut.insert(8);
    sut.insert(3);
    sut.insert(1);

    int k = 3;
    int expectedValue = 1;
    //Assert
    assertEquals(sut.kthFromEnd(k), expectedValue);
    System.out.println("We were looking for " + sut.kthFromEnd(k) + " and got back " + expectedValue + ".");
  }

  @Test
  @DisplayName("K longer than length")
  void kTooLong() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.insert(2);
    sut.insert(8);
    sut.insert(3);
    sut.insert(1);

    int k = 20;
    int expectedValue = 3;
    //Assert
    assertEquals(sut.kthFromEnd(k), expectedValue);
    System.out.println("We were looking for " + sut.kthFromEnd(k) + " and got back " + expectedValue + ".");
  }

  @Test
  @DisplayName("K is Negative")
  void kIsNegative() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.insert(2);
    sut.insert(8);
    sut.insert(3);
    sut.insert(1);

    int k = -3;
    int expectedValue = 3;
    //Assert
    assertEquals(sut.kthFromEnd(k), expectedValue);
    System.out.println("We were looking for " + sut.kthFromEnd(k) + " and got back " + expectedValue + ".");
  }

  @Test
  @DisplayName("Linked List is 1 long")
  void linkedListIsOneLong() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.insert(2);

    int k = 0;
    int expectedValue = 2;
    //Assert
    assertEquals(sut.kthFromEnd(k), expectedValue);
    System.out.println("We were looking for " + sut.kthFromEnd(k) + " and got back " + expectedValue + ".");
  }

  @Test
  @DisplayName("Happy Path")
  void happyPath() {
    //Arrange
    LinkedList sut = new LinkedList();
    //Act
    sut.insert(2);
    sut.insert(8);
    sut.insert(3);
    sut.insert(1);

    int k = 2;
    int expectedValue = 3;
    //Assert
    assertEquals(sut.kthFromEnd(k), expectedValue);
    System.out.println("We were looking for " + sut.kthFromEnd(k) + " and got back " + expectedValue + ".");
  }

}
