package colecciones.Stack;

import java.util.Stack;

public class myStackTest2 {

       public static void main(String[] args){

           Stack<Object> myStack= new Stack<Object>();

           System.out.println("Is my stack empty? " + myStack.empty());
           // PUSH ELEMENTS:
           myStack.push("Orange Ball");
           myStack.push("Violet Ball");
           myStack.push("Green Ball");

           // PRINTS ELEMENTS
           System.out.println("Elements in Stack: " + myStack);
           System.out.println("Is my stack empty? " + myStack.empty());
           while (!myStack.isEmpty()) {
               myStack.pop();
               System.out.println("Elements in Stack: " + myStack);
               System.out.println("Is my stack empty? " + myStack.empty());
          }
     }
}