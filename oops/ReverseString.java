package oops;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter a sentence");//how are you today
		String usersentence = scanObj.nextLine();
		System.out.println(usersentence.length());//17
		for(int ctr = usersentence.length()-1;ctr>=0;ctr--) {//yadot uoy era woh
			System.out.print(usersentence.charAt(ctr));
		}
	}

}
