package oops;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a String");//NOON
		String userInput= scanObj.nextLine();
		System.out.println(userInput.length());//4
		String reversestr="";
		for(int ctr = userInput.length()-1;ctr>=0;ctr--) {//NOON
			reversestr=reversestr+userInput.charAt(ctr);
		}
		if(userInput.equalsIgnoreCase(reversestr)){
			System.out.println("is palindrome");
		}
			else {
				System.out.println("is not palindrome");
			}
		}
	}


