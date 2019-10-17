package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carerra");
        holden.setModel("Commodore");

        System.out.println("This model is " +porsche.getModel());

	// write your code here
    }
}
