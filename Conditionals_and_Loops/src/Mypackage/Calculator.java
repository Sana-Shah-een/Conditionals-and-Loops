package Mypackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			//Take input from user until user does not press x or X
			int result;
			while(true) {
				
				//Take the operator as input
			System.out.print("Enter the operator: +,-,*,/,% ");
			char op=input.next().trim().charAt(0);
			
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				
				System.out.print("Enter first number: ");
				int num1=input.nextInt();
				System.out.print("Enter second number: ");
				int num2=input.nextInt();
				
				if(op=='+') {
					result=num1+num2;
					System.out.println(num1 + " + " + num2 + " = " + result);
				}
				else if(op=='-') {
					result=num1-num2;
					System.out.println(num1 + " - " + num2 + " = " + result);
				}
				else if(op=='*') {
					result=num1*num2;
					System.out.println(num1 + " * " + num2 + " = " + result);
				}
				else if(op=='/') {
					if(num2!=0) {
					result=num1/num2;
					System.out.println(num1 + " / " + num2 + " = " + result);

				}}
				if(op=='%') {
					result=num1%num2;
					System.out.println(num1 + " % " + num2 + " = " + result);

				}		
			}
			else if(op == 'x' || op == 'X') {
				System.out.println("Program finished!!");
				break;
			}
			else {
				System.out.println("Invalid Operator!!");
			}
			
}
		

	}

}
