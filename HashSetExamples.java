package com.collections.example;

import java.util.HashSet;

class HashSetAppender{
    // Private HashSet to store elements
    private HashSet<String> mySet;

    // Constructor to initialize the HashSet
    public HashSetAppender() {
        this.mySet = new HashSet<>();
    }
    // Getter method to get the HashSet
    //@return HashSet
    public HashSet<String> getSet() {
        return mySet;
    }

    // Setter method to set the HashSet
    public void setSet(HashSet<String> set) {
        this.mySet = set;
    }

    //Method to add an element to the HashSet
    public void addElement(String element) {
        mySet.add(element);
    }
    // Method to append an element to the end of the HashSet
    public void appendElement(String element) {
        mySet.add(element); // HashSet automatically appends to the end
    }
    // Method to display the elements of the HashSet
    public void displaySet() {
        System.out.println("HashSet: " + mySet);
    }
}

//  Main class to test the HashSetAppender class
public class HashSetExamples {
    public static void main(String[] args) {
           // Create an instance of HashSetAppender
            HashSetAppender hashSetOperations = new HashSetAppender();

            // Add elements to the HashSet
            hashSetOperations.addElement("Apple");
            hashSetOperations.addElement("Banana");
            hashSetOperations.addElement("Cherry");

            // Display the original HashSet
            System.out.println("Original HashSet:");
            hashSetOperations.displaySet();

            // Append an element to the end of the HashSet
            hashSetOperations.appendElement("Date");

            // Display the HashSet after appending
            System.out.println("HashSet after appending 'Date':");
            hashSetOperations.displaySet();
        }
    }



