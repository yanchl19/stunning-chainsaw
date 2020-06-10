package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("instance1 and instance2 are same Instance");
        } else {
            System.out.println("instance1 and instance2 aren't same Instance");
        }
    }

    public static class Singleton {

        //①
        private static Singleton singleton = new Singleton();

        //②
        private Singleton() {
            System.out.println("Cretae Instance");
        }

        //➂
        public static Singleton getInstance() {
            return singleton;
        }
    }
}