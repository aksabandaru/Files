package oops;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

Scanner scanObj = new Scanner(System.in);
System.out.println("enter a number");//4582
int userNumber = scanObj.nextInt();
while(userNumber!=0) {
	int rem = userNumber%10;//2 8 5 4
	System.out.print(rem);
	userNumber/=10;//458 45 4 0
}
	}

}
