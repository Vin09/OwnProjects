package com.demo.javabasics;

import com.demo.java8Features.GreetingImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaBasics<x> {
    //For Each
    public static void main(String args[]) throws IOException,FileNotFoundException {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    try{
        System.out.println("1");
        System.exit(0);
        System.out.println("2");
    }
    finally {
        System.out.println("3");
        }

        //JAVA 7 Features 1. String in switch case
        printBasedOnStatusCode("ADD");
        //Feature 2: Try-Catch Resource Management
        //Feature 3: Binary Literals
        int x=0b0111;
        System.out.println("The binary value :"+x);
        //Feature 4: UnderScores in the Numeric Literals
        int ssn=999_999;
        System.out.println("SSN:"+ssn);
        //Feature 5: Multiple Catch Exceptions in one cactch block with a pipeline
        GreetingImpl greeting=new GreetingImpl();
        greeting.perform();
    }

    public static void printBasedOnStatusCode(String code) {
        switch (code) {
            case "ADD":
                System.out.println("Action Code Add is selected");
                break;
            default:
                System.out.println("Nothing from the option is selected");
        }
    }
    //Java 8: features more o vcome
    //Lambda Expressions
    //


}