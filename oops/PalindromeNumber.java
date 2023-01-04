package oops;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number");//444
		int userInput= scanObj.nextInt();
		int reversenumber=0;
		int number=userInput;
		while(userInput!=0) {
			int rem = userInput%10;//4 4 4
			reversenumber = reversenumber*10+rem;//4 44 444
			userInput/=10;	//44 4 0
		}
		System.out.println("reverse number is"+reversenumber);
		if(reversenumber==number) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
			
	}

}
