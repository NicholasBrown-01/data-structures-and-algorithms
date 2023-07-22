package datastructures.linkedlist.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

  @Test
  @DisplayName("Testing Enqueue")
  void enqueue() {
    //Arrange
    Queue sut = new Queue();

    //Act
  sut.enqueue(1);
  sut.enqueue(2);
  sut.enqueue(3);
  sut.enqueue(4);

    //Assert
    assertEquals(4, sut.back.value);

    //Sout
    System.out.println("Value at Back of Queue: "+sut.back.value);

  }

  @Test
  @DisplayName("Testing Dequeue")
  void dequeue() {
    //Arrange
    Queue sut = new Queue();

    //Act
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    sut.enqueue(4);

    sut.dequeue();

    //Assert
    assertEquals(2, sut.front.value);

    //Sout
    System.out.println("Value at Front of Queue: " + sut.front.value);
  }


  @Test
  @DisplayName("Testing Peek")
  void peek() {
    //Arrange
    Queue sut = new Queue();

    //Act
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    sut.enqueue(4);

    //Assert

    assertEquals(1, sut.peek());

    //Sout
    System.out.println("Front Value of Queue is: "+sut.peek());
  }

  @Test
  @DisplayName("Testing Null")
  void isEmpty() {
    //Arrange
    Queue sut = new Queue();

    //Act

    //Assert
    assertTrue(sut.isEmpty());

    //Sout
    System.out.println("This Queue is empty: "+sut.isEmpty());
  }
}
