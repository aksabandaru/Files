package oops;
import java.util.Scanner;
public class FunctionPalindromeString {
	String reversestr ="";
	void FunctionPalindrome(String text) {
		for(int ctr=text.length()-1;ctr>=0;ctr--) {//MOM
			reversestr+=text.charAt(ctr);	
		}
		if(text.equalsIgnoreCase(reversestr)) {
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}

	}

	public static void main(String[] args) {
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter a String");
		String userInput = scanObj.nextLine();//MOM
		FunctionPalindromeString obj = new FunctionPalindromeString();
		obj.FunctionPalindrome(userInput);
		
			}
	

}
