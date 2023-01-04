package Strings;

import java.util.Scanner;

public class SecondLargest {
	static int secondlargestnumber(int num1,int num2,int num3) {//50 100 150
		if((num1>num2 &&num1<num3)  || (num1>num3 && num1<num2)) {//50>100 false 50>150 false
			return num1;
			//System.out.println(num1+" "+"secondlargest num");
		}
		else if ((num2>num1 && num2<num3) || (num2>num3 &&num2<num1)) {//100>50 and 100<150 true
			return num2;//100
			//System.out.println(num2+" "+"secondlargest num");
		}
		else {
			return num3;
			//System.out.println(num3+" "+"secondlargest num");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter first number");//50
		int num1=scanObj.nextInt();
		System.out.println("enter second number");//100
		int num2=scanObj.nextInt();
		System.out.println("enter third number");//150
		int num3=scanObj.nextInt();
		int number =secondlargestnumber(num1,num2,num3);//call method
		System.out.println(number+" "+"Secondlargest number");//100
		
	


	}

}
