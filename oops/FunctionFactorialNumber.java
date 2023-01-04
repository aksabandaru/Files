package oops;
import java.util.Scanner;

public class FunctionFactorialNumber {
	static int Factorial(int userInput) {
		int factorial=1;
		
		for(int  ctr=1;ctr<=userInput;ctr++)//1 2 3 4 5
		{
		factorial=factorial*ctr;//1 2 6  24 120
		}
		
	
	return factorial;
	}
		

		
	

	public static void main(String[] args) {
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter a number");//5
		int userInput=scanObj.nextInt();
		//FunctionFactorialNumber obj = new FunctionFactorialNumber();
		//obj.Factorial(userinput);
		

		
	}
	}

