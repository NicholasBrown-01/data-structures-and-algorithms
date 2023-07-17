package datastructures.linkedlist;

public class Node
{
    public int value;
    public Node next = null; // Must have this for Line 9 of LinkList.java to work (insertNode.next)

    Node(int value) // This is the constructor being called in line 8 of LinkList.java(new Node)
    {
        this.value = value;
        this.next = null;
    }
}
