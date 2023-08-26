// Assigment 1

public class Assignment1
{
	public static void main(String[] args){
		// Task 1: Take 2 integer values in two variables x and y and print their product.
		int x =2;
		int y =4;
		int product =x*y;
		System.out.println("product: "+product);
		
		// Task 2: Print the ASCII value of character ‘U’.
		char c = 'U';
                int asciiValue = (int)c;
		System.out.println("ASCII value: "+asciiValue);
		
		// Task 3: Write a Java program to take the length and breadth of a rectangle and print its area.
		int length =7;
		int breadth =4;
		int area = length*breadth;
		System.out.println("Area of rectangle: "+area);
		
		// Task 4: Write a Java program to calculate the cube of a number.
		int number = 4;
		int cube = number*number*number;
		System.out.println("Cube : "+cube);
				
		// Task 5: Write a Java program to swap two numbers with the help of a third variable.
		int a=2, b=3;
		System.out.println("Number before swap: "+a+""+b);
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println("Number after swap: "+a+""+b);
		
	}
}

  