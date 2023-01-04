package oops;
import java.util.Scanner;

public class Whitespace {
	public static void main(String args[]) {
		Scanner scanobj =new Scanner(System.in);
		System.out.println("enter a sentence");
		//how are you today
		String userInput = scanobj.nextLine();
		int ctr=0;
		for (ctr=0;ctr<userInput.length();ctr++){
		if (userInput.charAt(ctr)==' ') {//h
			continue;
		}
			System.out.print(userInput.charAt(ctr));
		}

}

}
