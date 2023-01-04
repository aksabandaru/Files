package oops;
import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
		Scanner scanObj=new Scanner(System.in);
		System.out.println("enter a number");//344
		int userNumber = scanObj.nextInt();
		int sum=0;
		int temp = userNumber;
		while(userNumber!=0) {
			int rem = userNumber%10;//4 4 3
			sum = sum+FunctionFactorialNumber.Factorial(rem);//24 48 54
			userNumber/=10;//34 3 0
		
	}
		if(sum==temp) {//54!=344
			System.out.println(temp+" "+" is peterson number");
			
		}
		else {
			System.out.println(temp+" "+" is not a peterson number");
		}

}
}
