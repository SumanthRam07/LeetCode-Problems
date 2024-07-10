# MyQueue

MyQueue is a custom implementation of a queue using two stacks. This implementation provides the basic operations of a queue (enqueue, dequeue, peek, and empty) by leveraging the LIFO (Last In First Out) nature of stacks.

## problem statement
The MyQueue class uses two stacks (mStack and supportStack) to simulate the behavior of a queue. The main idea is to use one stack for input operations and the other stack to reverse the order of elements temporarily, thereby achieving the FIFO (First In First Out) behavior of a queue.

### Basic Idea 

My Inital though after seeing this problem is that , i have to reverse the operations , so i check the constraints of the given probem to see if i can get any time complexity issues , for this problem my the input sizes limited , so i have used two stack to achieve and below are code blocks which are self explanatory


#### To create a new instance of MyQueue:

##### java

```java
MyQueue queue = new MyQueue();
Enqueue (push)
To add an element to the queue:
```

##### java

queue.push(1);
queue.push(2);
queue.push(3);
Dequeue (pop)
To remove and return the element at the front of the queue:

##### java

```java
int front = queue.pop(); // Returns the first element added to the queue
Peek
To return the element at the front of the queue without removing it:
```

java

```java
int front = queue.peek(); // Returns the first element added to the queue without removing it
Empty
To check if the queue is empty:
```

##### java

```java
boolean isEmpty = queue.empty(); // Returns true if the queue is empty, false otherwise
Example
Here is an example of how to use the MyQueue class:
```

##### java
```java

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.empty()); // Output: false

        queue.pop();
        queue.pop();
        System.out.println(queue.empty()); // Output: true
    }
}
```