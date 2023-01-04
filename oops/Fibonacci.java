package oops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter how many numbers do you want in series");//10
		int num = scanobj.nextInt();
		int num1=0,num2=1;
		System.out.print(num1+" "+num2);				
		for( int ctr=2;ctr<num;ctr++) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print(" "+num3);
			
		}

	}}