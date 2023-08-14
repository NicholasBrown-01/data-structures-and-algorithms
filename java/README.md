# Data Structures and Algorithms

# Data Structures

## Implementation Notes

## Code Challenge 05

Methods:
- Insert
- Includes
- toString in a specified format

Test were also written that:

- Can successfully instantiate an empty linked list
- Can properly insert into the linked list
- The head property will properly point to the first node in the linked list
- Can properly insert multiple nodes into the linked list
- Will return true when finding a value within the linked list that exists
- Will return false when searching for a value in the linked list that does not exist
- Can properly return a collection of all the values that exist in the linked list

NOTE:Tests must be run one at a time due to a "rg.junit.platform.launcher.core.EngineDiscoveryOrchestrator lambda$logTestDescriptorExclusionReasons$7
INFO: 0 containers and 3 tests were Method or class mismatch" error I receive when doing all at once.

This challenge was completed with the resources of Class Github, Youtube, GPT.

## Code Challenge 06

Methods:
- Append
- Insert Before
- Insert After

Test were also written that:
- Can successfully add a node to the end of the linked list
- Can successfully add multiple nodes to the end of a linked list
- Can successfully insert a node before a node located i the middle of a linked list
- Can successfully insert a node before the first node of a linked list
- Can successfully insert after a node in the middle of the linked list
- Can successfully insert a node after the last node of the linked list
-
  This challenge was completed with the resources of Class Github, Youtube, GPT.


## Code Challenge 07

Methods:
KTH From End

Test were also written that:
- Where k is greater than the length of the linked list
- Where k and the length of the list are the same
- Where k is not a positive integer
- Where the linked list is of a size 1
- “Happy Path” where k is not at the end, but somewhere in the middle of the linked list
-
This challenge was completed with teamwork from Alex Chao. Whiteboard img attached for our planning process.<br>
We did have to look up the dual pointer process and have a written example to follow from which we drew.

![Code Challenge 07 Whiteboard Psuedo Code.png](lib%2Fsrc%2Ftest%2Fjava%2FCode%20Challenge%2007%20Whiteboard%20Psuedo%20Code.png)


## Code Challenge 08

Linked List Zip

This challenge was a whiteboard to pseudo code event in which we attempt to explain out way
through taking multiple args in the form of linked list and combining them into a sintle output.


![Code Challenge 08 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2008%20Whiteboard.png)

## Code Challenge 10

Stack and Queue

This challenge was to hand-write methods for Stacks: Push, Pop, Peek, isEmpty and Queues: enqueue, dequeue, peek, isEmpty.

![Code Challenge 10 Whiteboard.png](lib%2Fsrc%2Ftest%2Fjava%2Fdatastructures%2Flinkedlist%2Fstack%2FCode%20Challenge%2010%20Whiteboard.png)


## Code Challenge 11

Stack Queue Pseudo

This challenge was to:
- Create a new class called pseudo queue.
- Do not use an existing Queue.
- Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
- Internally, utilize 2 Stack instances to create and manage the queue <br>
-
Methods:
- enqueue
- =Arguments: value
- Inserts a value into the PseudoQueue, using a first-in, first-out approach.
- dequeue
- Arguments: none
- Extracts a value from the PseudoQueue, using a first-in, first-out approach.
-
![Code Challenge 11 WhiteBoard.png](lib%2Fsrc%2Ftest%2Fjava%2Fdatastructures%2Flinkedlist%2Fstack%2FCode%20Challenge%2011%20WhiteBoard.png)


## Code Challenge 12

Animal Shelter

This challenge was to:
- Create a class called AnimalShelter which holds only dogs and cats.
- The shelter operates using a first-in, first-out approach.
- Implement the following methods:

Enqueue:

- Arguments: animal
- animal can be either a dog or a cat object.
- It must have a species property that is either "cat" or "dog"
- It must have a name property that is a string.
-
Dequeue:

- Arguments: pref
- pref can be either "dog" or "cat"
- Return: either a dog or a cat, based on preference.
- If pref is not "dog" or "cat" then return null.

![Code Challenge 12 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2012%20Whiteboard.png)


## Code Challenge 13

Multi-bracket Validation

This challenge was to:
- Write a function called validate brackets
- Arguments: string
- Return: boolean representing whether or not the brackets in the string are balanced


There are 3 types of brackets:

- Round Brackets : ()
- Square Brackets : []
- Curly Brackets : {}

![Code Challenge 13 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2013%20Whiteboard.png)


## Code Challenge 15

Binary Tree and BST Features:

Node:
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.<br>
  <br>
Binary Tree:
- Create a Binary Tree class<br>
- <br>

Define a method for each of the depth first traversals:
- pre order
- in order
- post order<br>
<br>

Binary Search Tree:
- Create a Binary Search Tree class
- This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:<br>
<br>
- Add<br>
Arguments: value
- Return: nothing
- Adds a new node with that value in the correct location in the binary search tree.<br>
<br>
Contains
- Argument: value
- Returns: boolean indicating whether or not the value is in the tree at least once.

Includes tests that:
<br>

- Can successfully instantiate an empty tree
- Can successfully instantiate a tree with a single root node
- For a Binary Search Tree, can successfully add a left child and right child properly to a node
- Can successfully return a collection from a pre-order traversal
- Can successfully return a collection from an in-order traversal
- Can successfully return a collection from a post-order traversal
- Returns true	false for the contains method, given an existing or non-existing node value

## Code Challenge 16

Maximum Value in Binary Tree:

Write the following method for the Binary Tree class

- find maximum value
- Arguments: none
- Returns: number
- Find the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

![Code Challenge 16 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2016%20Whiteboard.png)


## Code Challenge 17

Breadth First Traversal:

Write the following method for the Binary Tree class

- Write a function called breadth first
- Arguments: tree
- Return: list of all values in the tree, in the order they were encountered

![Code Challenge 17 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2017%20Whiteboard.png)

## Code Challenge 18

FizzBuzz Tree:


Write a function called fizz buzz tree:
- Arguments: k-ary tree
- Return: new k-ary tree

Determine whether or not the value of each node is divisible by 3, 5 or both.
Create a new tree with the same structure as the original, but the values modified as follows:

- If the value is divisible by 3, replace the value with “Fizz”
- If the value is divisible by 5, replace the value with “Buzz”
- If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
- If the value is not divisible by 3 or 5, simply turn the number into a String.

![Code Challenge 18 Whiteboard.png](lib%2FScreenshots%2FCode%20Challenge%2018%20Whiteboard.png)

## Code Challenge 26

Selection and sort:

- Given pseudocode create a whitboard walkthrough of the provided array.
- Convert the pseudocode into working code in your language
- Present a complete set of working tests

This code was done as a group with Nick Brown, Kyle Knight, Ryan Gosselin, Juan Olmedo

**Resources canvas examples, gpt.
