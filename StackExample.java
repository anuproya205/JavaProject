package com.example.datastructures;

import java.util.Stack;

//This class encapsulates stack operations and manages elements in the stack.
class StackOperation {
    // Stack to store integer elements
    private Stack<Integer> stack;

    // Constructor to initialize the Stack
    public StackOperation() {
        stack = new Stack<>();// Creates a new empty Stack
    }
    // Method to push elements into the Stack
    public void pushElement(int element) {
        stack.push(element);// Adds the element to the top of the stack
        System.out.println(element + " pushed into the stack.");
    }
    // Method to pop(remove) elements from the Stack
    public void popElement() {
        if (!stack.isEmpty()) {// Check if the stack is not empty
            int removedElement = stack.pop(); // Removes and returns the top element
            System.out.println(removedElement + " popped from the stack.");
        } else {
            System.out.println("The stack is empty. No element to pop.");
        }
    }

    // Method to display the current elements in the Stack
    public void displayStack() {
        System.out.println("Current elements in the stack: " + stack);
    }
}

 public class StackExample {
    public static void main(String[] args) {
        // Create an instance of StackOperations to manage the stack operations
        StackOperations stackOperation = new StackOperations();
        // Push 10 elements(from 1 to 10) onto the stack
        for (int i = 1; i <= 10; i++) {
                    stackOperation.pushElement(i);// Pushing elements 1 to 10 into the stack
        }

        // Display the stack after pushing 10 elements
        System.out.println("\nStack after pushing 10 elements:");
        stackOperation.displayStack();// Show the current stack contents

        // Pop 4 elements from the stack
        System.out.println("\nPopping 4 elements from the stack:");
        for (int i = 0; i < 4; i++) {
                    stackOperation.popElement();// Removing the top 4 elements
        }

        // Display the stack after popping 4 elements
        System.out.println("\nStack after popping 4 elements:");
                stackOperation.displayStack(); // Show the remaining stack contents
            }
        }


