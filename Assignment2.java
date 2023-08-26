
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		/* Task 1 :
		 * Input name, roll number and field of interest from user and print in the format below :
		 * Name: xyz, Roll number: xyz, Field of interest: xyz
		 */
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String firstName =sc.next();
		String lastName = sc.next();
		int rollNumber = sc.nextInt();
		String fieldOfInterest = sc.next();
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Roll number: "+rollNumber);
		System.out.println("Field of interest: "+fieldOfInterest);
		
		/* Task 2:
		 * Input two different string and print them in same line.
		 */
		System.out.println("Enter first string: ");
		String first_string = sc.next();
		System.out.println("Enter second string: ");
		String second_string = sc.next();
		System.out.println(first_string+second_string);
		
		/* Task 3:
		 * If the marks of Robert in three subjects are entered through keyboard (each out of 100),
		 *  write a program to calculate his total marks and percentage marks.
		 */
		System.out.println("Enter the marks: ");
		int mark1 =sc.nextInt();
		int mark2 =sc.nextInt();
		int mark3 =sc.nextInt();
		int totalNumberOfSubjects = 3;
		int totalMarks = mark1+mark2+mark3;
		double percentage = totalMarks/totalNumberOfSubjects;
		System.out.println("Total marks: "+totalMarks);
		System.out.println("Percentage marks: "+percentage+"%");
		
		/* Task 4
		 * Given two numbers, return their sum in the following format:
		 * Int t representing number of test cases
		 * T lines of Two integers representing the numbers to be added
		 */
		System.out.println("Enter the number of test cases: ");
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		for(int i =1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		/* Task 5
		 * Given few lines of input(number of lines unknown) where each line has two
		 * strings, concatenate the strings.
		 */
		System.out.println("Please enter strings");
		while(sc.hasNextLine()) {
			String str1 =sc.next();
			String str2 =sc.next();
			System.out.println(str1+str2);
		}
	

		
		sc.close();		
		
	}
}

