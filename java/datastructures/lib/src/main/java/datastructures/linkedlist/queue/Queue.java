package datastructures.linkedlist.queue;

import datastructures.linkedlist.stack.Node;

import java.util.NoSuchElementException;

public class Queue<T>
{
    Node<T> front;
    Node<T> back;

  void enqueue(T valueToEnqueue)
  {
    Node<T> enqueueNode = new Node<>(valueToEnqueue);
    if (isEmpty()) {
      front = enqueueNode;
      back = enqueueNode;
    } else {
      back.next = enqueueNode;
      back = enqueueNode;
    }
  }

  T dequeue() {

    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty!");
    }

    T value = front.value;
    front = front.next;

    // if the queue is now empty, update the back pointer as well
    if (front == null) {
      back = null;
    }

    return value;
  }

    T peek()
    {
       return this.front.value;
    }

    boolean isEmpty()
    {
       return this.front == null;
    }
}
