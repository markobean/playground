package org.example;

public class MutableObjectExample {
    public static void main(String[] args) {
        MyObject someObject = new MyObject("Mark", 1);
        System.out.println("main method: someObject = " + someObject);
        updateName(someObject, "Quinci");
        System.out.println("main method: someObject = " + someObject);
        updateNameImmutably(someObject, "Sarah");
        System.out.println("main method: someObject = " + someObject);

    }


    public static void updateName(MyObject thing, String newName) {
        thing.name = newName;
    }

    public static void updateNameImmutably(MyObject thing, String newName) {
        thing = new MyObject(newName, thing.value);
        System.out.println("updateNameImmutably method: someObject = " + thing);

    }

    private static class MyObject {
        String name;
        int value;

        public MyObject(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }
}
