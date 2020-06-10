package com.company;

public class SingletonTest {

    public static void main(String[] args) {
	// write your code here
        Renban renbanA = Renban.getInstance();
        System.out.println(renbanA.getNumber());
        System.out.println(renbanA.getNumber());
    }
}

class Renban{
    private static Renban instance = new Renban();
    private int number=0000;

    private Renban(){

    }

    public static Renban getInstance(){
        return instance;
    }

    public int getNumber(){
        if(number < 10000) {
            number = number + 1;
        }
        return number;
    }
}
