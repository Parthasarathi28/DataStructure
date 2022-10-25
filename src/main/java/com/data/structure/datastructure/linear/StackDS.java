package com.data.structure.datastructure.linear;

import java.util.Iterator;
import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {
        stack();
    }

    /***
     * push, peek, pop, search
     * Last in first out
     * O(1)
     */
    private static void stack() {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(10);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search(5));
        Iterator stackIter = stack.iterator();
        while (stackIter.hasNext()){
            System.out.println(stackIter.next());
        }
    }
}
