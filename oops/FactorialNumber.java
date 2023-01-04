package oops;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number to find factorial");//3
		int userNumber = scanObj.nextInt();
		int factorial = 1;
		
		for(int ctr = 1; ctr<=userNumber;ctr++) {
			factorial = factorial*ctr;//1 2 6
		}
			System.out.println(factorial);
		}
	}


