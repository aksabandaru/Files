package oops;
import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number");
		int userNumber = scanObj.nextInt();
		if(FunctionPerfectSquare.PefectSquare( userNumber+1)==false) {
			System.out.println(userNumber+" "+"number is sunny number");
		}
		else
			
		{
			System.out.println(userNumber+" "+ "is not a sunny number");
		}
		
	}

}
