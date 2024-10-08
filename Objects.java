
package com.mycompany.objects;

// Class definition for Student
class Student {
    // Attributes
    private String name;
    private int grade;

    // Constructor to initialize the attributes
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

// Main class to run the program
public class Objects {
    public static void main(String[] args) {
        // Create two objects of the Student class and assign values
        Student student1 = new Student("Jayron", 90);
        Student student2 = new Student("Kallex", 95);
        
        // Print the details of both students
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
