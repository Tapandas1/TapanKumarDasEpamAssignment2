package Tapan;
import java.util.Scanner;

 class Calculation {

	double a;
	double b;
	Calculation(){
		this.a=0;
		this.b=0;
	}
	Calculation(double a,double b)
	{
	    this.a=a;
		this.b=b;
	}
	void Addition(double a,double b)
	{
		double sum=a+b;
		System.out.println("The sum of two numbers is"+sum);
	}
	void Subtraction(double a,double b)
	{
		double sub=a-b;
		System.out.println("The difference of two numbers is"+sub);
	}
	void Multiplication(double a,double b)
	{
		double pro=a*b;
		System.out.println("The product of two numbers is"+pro);
	}
	void Division(double a,double b)
	{
		if(b!=0)
		{
		double quo=a/b;
		System.out.println("The  quotient is"+quo);
		}
		else
			System.out.println("Division not possible");
	}
}
public class Calculator{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choice;
		char ch;
		double num1,num2,num3,num4,num5,num6,num7,num8;
		Calculation ca=new Calculation(2,5);
		do {
			System.out.println("**********EPAM ASSIGNMENT 2*********");
			System.out.println("1. Press 1 for Addition");
			System.out.println("2. Press 2 for Subtraction");
			System.out.println("3. Press 3 for Multiplication");
			System.out.println("4. Press 4 for Division");
			System.out.println(" Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter the first number");
			       num1=sc.nextDouble();
			       System.out.println("Enter the second number");
			       num2=sc.nextDouble();
			       ca.Addition(num1,num2);
			       break;
			case 2:System.out.println("Enter the first number");
		           num3=sc.nextDouble();
		           System.out.println("Enter the second number");
		           num4=sc.nextDouble();
		           ca.Subtraction(num3,num4);
		           break;
			case 3:System.out.println("Enter the first number");
	               num5=sc.nextDouble();
	               System.out.println("Enter the second number");
	               num6=sc.nextDouble();
	               ca.Multiplication(num5,num6);
	               break;
			case 4:System.out.println("Enter the first number");
	               num7=sc.nextDouble();
	               System.out.println("Enter the second number");
	               num8=sc.nextDouble();
	               ca.Division(num7,num8);
	               break;
	         default: System.out.println("Wrong choice");
			}System.out.println("Do you want to continue (y/n)");
			ch=sc.next().charAt(0);
		}while(ch!='n');
		sc.close();
	}
}

