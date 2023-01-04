package oops;
import java.util.Scanner;

public class SearchChar {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a sentence ");// i love rose flowers
		String userInput = scanObj.nextLine();
		System.out.println("enter a character");//r z
		char ch = scanObj.nextLine().charAt(0);
		boolean flag=false;
		for(int ctr =0; ctr <userInput.length();ctr++) {
			if(userInput.charAt(ctr) == ch) {
				flag=true;
				System.out.println("character is found at "+ctr);//7
				break;
			}
		}
		if (flag == false) {
			System.out.println("character is not found");//not found
		}

	}

}
