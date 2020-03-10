package com.adp3.submissions;

import java.util.Stack;

public class List_Data_Structure {

    public void stack(){
        System.out.println("The stack is a First In Last Out Data structure!");
        Stack list = new Stack();
        list.push("one");
        list.push("two");
        list.push("three");

        System.out.println("The Top value is: "+list.pop());
    }


}       //end class
