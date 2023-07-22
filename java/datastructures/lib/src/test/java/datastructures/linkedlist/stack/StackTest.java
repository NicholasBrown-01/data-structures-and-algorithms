package datastructures.linkedlist.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  @Test
  @DisplayName("Testing Push")
  void push() {
    //Arrange
    Stack sut = new Stack();
    //Act
    sut.push(1);
    sut.push(2);
    sut.push(3);
    sut.push(4);

    //Assert
    assertEquals(4, sut.top.value);

    //Sout
    System.out.println("Stack Top has value of: "+sut.top.value);
  }

  @Test
  @DisplayName("Testing Pop")
  void pop() {
    //Arrange
    Stack sut = new Stack();

    //Act
    sut.push(1);
    sut.push(2);
    sut.push(3);
    sut.push(4);

    //Assert
    Object result = sut.pop();
    assertEquals(4, result);

    //Sout
    System.out.println("Value in Stack that was Popped: "+result);
    System.out.println("New Value at Top of Stack: "+sut.peek());
  }

  @Test
  @DisplayName("Testing Peek")
  void peek() {
    //Arrange
    Stack sut = new Stack();

    //Act
    sut.push(1);
    sut.push(2);
    sut.push(3);
    sut.push(4);

    //Assert
    assertEquals(4, sut.peek());
    //Sout
    System.out.println("Peeking at Top value: "+sut.peek());

  }

  @Test
  @DisplayName("Testing is NULL")
  void isEmpty() {
    //Arrange
    Stack sut = new Stack();

    //Act

    //Assert
    assertTrue(sut.isEmpty());

    //Sout
    System.out.println("Stack is empty: "+sut.isEmpty());
  }
}
