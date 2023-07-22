package datastructures.linkedlist.stack;

public class Stack<T>
{
    Node<T> top;

    void push(T valueToPush) {
        Node pushNode = new Node(valueToPush);
        pushNode.next=this.top;
        this.top = pushNode;
    }

    T pop()
    {
      T popNode = this.top.value;
      this.top = this.top.next;

        return popNode;
    }

    T peek()
    {
        return this.top.value;
    }

    boolean isEmpty()
    {
        return this.top == null;
    }
}
