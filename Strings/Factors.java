package Strings;
import java.util.Scanner;

public class Factors {
	static void toprintfactors(int number) {//6
		for(int ctr=1;ctr<number;ctr++) {//1 2 3 4 5 6
			if(number%ctr==0) {//1 2 3
			System.out.print(ctr+" ");//1 2 3 
			}
		}	
			}
	

	public static void main(String[] args) {


		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number");//6
		int userNumber = scanObj.nextInt();
		toprintfactors(userNumber);//call method
		
		

	}
}