package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] numbers = {0, 1, 2, 3, 4, 5};
        System.out.println("Printing out list:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Character> Letters = new ArrayList(Arrays.asList('a','b','c','d'));
        System.out.println("printing the Array list:");
        for (Character letter: Letters) {
            System.out.println(letter);
        }
        // Create an LinkedList, Populate it, and Print it out
        LinkedList<String> schedule = new LinkedList<String>();
        schedule.add("math");
        schedule.add("english");
        schedule.add("science");
        schedule.add("history");
        System.out.println(schedule);
        // Create an Queue, Populate it, and Print it out
        Queue<String> Customers = new LinkedList<String>();
        Customers.add("mike");
        Customers.add("charles");
        Customers.add("kayle");
        Customers.add("lucy");

        System.out.println(Customers);
        // Create an Stack, Populate it, and Print it out
        Stack<String> stack = new Stack<String>();
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        stack.push("date");
        stack.push("eggplant");

        System.out.println(stack);
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        class Plant {
            boolean isEdible;
            boolean needsWater;
            String Scientificname;

    }
}}
