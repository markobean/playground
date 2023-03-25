package org.example;

import java.util.ArrayList;
import java.util.List;

public class ImmutableObjectExample {
    public static void main(String[] args) {
        Double d = 3.14;
        System.out.println("main method: d = " + d); // prints "3.14"
        testPrimitive(d);
        System.out.println("main method: d = " + d); // still prints "3.14" because Double is immutable (i.e. value of the SAME object cannot be changed
        d = 10.0; // auto-unbaoxing of Double object to primitive "double" occurs effectively creating a new object for d.
        System.out.println("main method: d = " + d); // prints "10.0"

        // A new take on a different type of object
        System.out.println("--------------------------------------------------------------");
        List<Double> myList = new ArrayList();
        myList.add(1.0);
        myList.add(2.0);
        System.out.println("main method: myList = " + myList);
        testList(myList);
        System.out.println("main method: myList = " + myList);
    }

    private static void testPrimitive(Double doubleIn) {
        System.out.println("testMe method: at beginning, doubleIn = " + doubleIn);
        doubleIn = 98.6;  // doubleIn is now a new object
        System.out.println("testMe method: after update, doubleIn = " + doubleIn); // prints "98.6"
    }

    private static void testList(List aList) {
        System.out.println("testList method: at beginning, aLIst = " + aList);
        aList.remove(2.0);
        aList.add(99.9);
        System.out.println("testList method: after update, aLIst = " + aList);
    }
}
