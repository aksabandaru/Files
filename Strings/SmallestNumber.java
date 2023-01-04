package Strings;

import java.util.Scanner;

public class SmallestNumber {

	static int smallestnumber(int num1,int num2,int num3) {
int smallestnum;

		if(num1<num2 && num1<num3) {
			//return num1;
			smallestnum =num1;

					}
		else if(num2<num3) {
			//return num2;
			smallestnum =num2;
		}

					else {
						smallestnum = num3;
			//return num3;
		
		}
		return smallestnum;


	}
	public static void main(String[] args) {

		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scanObj.nextInt();
		System.out.println("enter second number");
		int num2=scanObj.nextInt();
		System.out.println("enter third number");
		int num3=scanObj.nextInt();
		int smallernum=smallestnumber(num1,num2,num3);
		System.out.println(smallernum+" "+"smallestnumber");




	}

}
