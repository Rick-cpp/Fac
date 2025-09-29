package app.projects.filas.data;

public class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full, cannot push " + value);
            return;
        }
        elements[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
}