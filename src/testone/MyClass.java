package testone;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
	int num1=10;
	int num2=12;
	int sum=num1+num2;
	
	int mult=num1*num2;
	float div=(float) num1/num2;
	System.out.println("Addition"+ sum);
	System.out.println("Multiplication"+ mult);
	System.out.println("Division"+ div);
	
	
	Scanner scanner	=new Scanner(System.in);
	System.out.println("Enter the name of the User:");
	String name=scanner.next();
	System.out.println("Hello " + name);
    System.out.println("Lenght: " + name.length());
    System.out.println("Upper Case: " + name.toUpperCase());
	
    int myarray[]= {2,3,45,6,7};
    
    String Sushila[]=("a","b","c","d","e","f")
    System.out.println("Second Value in array:" + Sushila[0]);
	}
	

}
