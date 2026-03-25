package com.cucumber.bdd;

public class Student {
    // 1. Attributes (Fields)
    String name;
    int age;
    double gpa;

    // 2. Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // 3. Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // 4. Main method to run the code
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student myStudent = new Student("Alex", 20, 3.8);

        // Calling the method
        myStudent.displayInfo();
    }
}
