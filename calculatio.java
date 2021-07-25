import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		char choose;
		double num1 , num2 , total;
		
		while(true){
		System.out.println("Choose the type of operation: ");
		System.out.println("1- Multiply * ");
		System.out.println("2- Dividing / ");
		System.out.println("3- positive + ");
		System.out.println("4- negative - ");
		System.out.print("Enter number from the list: ");
		choose=keyboard.next().charAt(0);
		
		
		if (choose == '1'){
		    System.out.print("First Number: ");
		    num1=keyboard.nextDouble();
		    System.out.print("Second Number: ");
		    num2=keyboard.nextDouble();
		    total = num1 * num2;
		    System.out.println("Total:" +total);
		    System.out.print(num1 +" * " + num2 + " = " + total);
		    System.out.println("\n");
		}
		if (choose == '2'){
		    System.out.print("First Number: ");
		    num1=keyboard.nextDouble();
		    System.out.print("Second Number: ");
		    num2=keyboard.nextDouble();
		    total = num1 / num2;
		    System.out.println("Total:" +total);
		    System.out.print(num1 +" / " + num2 + " = " + total);
		    System.out.println("\n");
		}
		if (choose == '3'){
		    System.out.print("First Number: ");
		    num1=keyboard.nextDouble();
		    System.out.print("Second Number: ");
		    num2=keyboard.nextDouble();
		    total = num1 + num2;
		    System.out.println("Total:" +total);
		    System.out.print(num1 +" + " + num2 + " = " + total);
		    System.out.println("\n");
		}
		if (choose == '4'){
		    System.out.print("First Number: ");
		    num1=keyboard.nextDouble();
		    System.out.print("Second Number: ");
		    num2=keyboard.nextDouble();
		    total = num1 - num2;
		    System.out.println("Total: " +total);
		    System.out.print(num1 +" - " + num2 + " = " + total);
		    System.out.println("\n");
		}
		}
		
	}
}
