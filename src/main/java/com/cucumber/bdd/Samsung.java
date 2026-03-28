package com.cucumber.bdd;

public class Samsung {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Creating an object of Samsung class
        Samsung phone = new Samsung();

        // Calling a method
        phone.showBrand();
    }

    // Method to display message
    public void showBrand() {
        System.out.println("This is a Samsung phone.");
    }
}