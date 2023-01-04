package Strings;
import java.util.Scanner;

public class Digits {
	static int tocountdigits(int number) {
	int digits=0;
	while(number!=0) {
		digits++;
		
		number/=10;
	}
	return digits;
	
	}
	public static void main (String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number ");
		int number = scanObj.nextInt();
		int totaldigits=tocountdigits(number);
		System.out.println(totaldigits);
		
		}

}
