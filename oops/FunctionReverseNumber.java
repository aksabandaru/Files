package oops;
import java.util.Scanner;


public class FunctionReverseNumber{
static int reverseNumber(int number) {
		int reversenumber=0;
		int temp=number;
		while(number!=0) {
		 int rem = number%10;//7 6 5
		 reversenumber=reversenumber*10+rem;
		//System.out.print(rem);
		number/=10;	//56 5 0	
		}
		return reversenumber;
	}
	
	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number");//567
		int userNumber = scanObj.nextInt();
		//FunctionReverseNumber obj = new FunctionReverseNumber();
		//obj.ReverseNumber(userInput);
		int reverse=reverseNumber(userNumber);
		//System.out.println(reverse);
		
	}

}
