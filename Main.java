class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element onto the stack.");
            return;
        }
        stackArray[++top] = value;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element from the stack.");
            return -1;
        }
        return stackArray[top--];
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element from the stack.");
            return -1;
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Trying to push an element into a full stack
        stack.push(60);

        // Peeking and popping elements from the stack
        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element of the stack after pop: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element of the stack after pop: " + stack.peek());
    }
}
