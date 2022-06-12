package Java;

import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {

        /**
         * First in First out structure 
         */

        // Declare stack with Stack Keyword
        Stack<String> animals = new Stack<String>();

        /**
         *  add element in stack 
         */
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Hourse");
        animals.push("Cat");


        /**
         * Get top elements from the stack
         */
        animals.peek();

        /**
         * Remove top element from the stack 
         * Also this will return popped element
         */
        animals.pop();

        /**
         * This will return true if Stack is empty
         */
        animals.empty();
    }
}
