package Strings;

import java.util.Scanner;

public class GreatestNumber {
	static int greatestnumber(int num1,int num2,int num3) {
		
	
		if(num1>num2 && num1>num3) {
			return num1;
		
			//System.out.println(num1+" "+"larger number");
		}
	else if(num2>num3) {
		return num2;

		//System.out.println(num2+" "+"larger number");
	}
		
	else {
		return num3;
	
		//System.out.println(num3+" "+"larger number");
	}
	

	}
	public static void main(String[] args) {
		
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scanObj.nextInt();
		System.out.println("enter second number");
		int num2=scanObj.nextInt();
		System.out.println("enter third number");
		int num3=scanObj.nextInt();
		int largernum=greatestnumber(num1,num2,num3);
		System.out.println(largernum+" "+"largernumber");
	

		
		
	}
		
			}


