package Ex_22_Collections_Framework;

import java.util.*;
import java.util.Stack;
public class Ex12_Stack {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        s1.push("Namaste");
        s1.push("Vannakkam");
        s1.push("Sasriyakal");
        s1.push("Hello");
        //it will be stored in LIFO way - Last In First Out
        //first namaste will be stored
        //next vannakkam,next sasriyakal,next hello this is the order

        System.out.println(s1);
        System.out.println("***");
        System.out.println(s1.size());
        System.out.println("***");
        //It gives you the last element that has come in which is Hello
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println("***");
        //when we use pop the top most element which is hello here will be removed
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println("***");
        System.out.println(s1.empty());
        System.out.println("***");
        System.out.println(s1.add("Mary"));
        System.out.println(s1);
        System.out.println("***");
        System.out.println(s1.contains("Hello"));
        System.out.println(s1.contains("Namaste"));
        System.out.println("***");
        System.out.println(s1.get(0));
        System.out.println(s1.get(3));




    }
}
