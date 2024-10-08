//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.classroomattendance;
import java.util.Scanner;
public class ClassroomAttendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input the total number of students
        System.out.println("Enter the Total Number of Students");
        int totalStudents = scanner.nextInt();
        
        //Variables to count present and absent students
        int presentCount, absentCount = 0;
        
        //Loop through each student to take attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.println("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().toUpperCase().charAt(0);
            
            if (attendance == 'Y') {
                presentCount++;
            } else if (attendance == 'N') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'. ");
                i--; // Decrement i to repeat the attendance check for this student
            
            } 
        }
        
        //Display the total counts
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);
        
        //Close the scanner
        scanner.close();
        
    }
}
