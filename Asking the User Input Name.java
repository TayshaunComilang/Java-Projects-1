//Comilang, Tayshaun M.
//CITCS 1N-A
//September 13, 2024

package com.techvidvan.helloworldexample;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		        
	System.out.print("What is your name: ");
	String name = scanner.nextLine();
		        
	System.out.print("How old are you: ");
	int age = scanner.nextInt();
		        
	System.out.println("How are you?: ");
	char grade = scanner.next().charAt(0);
		        
	System.out.println("What is your GPA last semester?:");
	double gpa = scanner.nextDouble();
		        
	System.out.println("Are you a student (true/false):");
	boolean block = scanner.nextBoolean();
		   

    }

}
