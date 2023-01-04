package oops;
import java.util.Scanner;

public class FunctionPalindromeNumber {
	
	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("eneter a number to check whether it is palindrome or not");//3456
		int usernumber=scanObj.nextInt();
	
	if(FunctionReverseNumber.reverseNumber(usernumber)==usernumber)
	{
		System.out.println(usernumber+" "+"is  palindrome Number");		
	}
	else {
		System.out.println(usernumber+" "+"is not a  palindrome Number");	
		
	}
	}

}
