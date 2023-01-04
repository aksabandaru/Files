package oops;
import java.util.Scanner;

public class FunctionReverseString {
	void toFunctionReverseString(String Sentence) {
	for(int ctr=Sentence.length()-1;ctr>=0;ctr--) {//eman ruoy si tahw
		System.out.print(Sentence.charAt(ctr));
	}
	
	}
	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a string");
		//what is your name
		String userSentence=scanObj.nextLine();
		System.out.println(userSentence.length());//16
		FunctionReverseString obj1=new FunctionReverseString();
		obj1.toFunctionReverseString(userSentence);
		
	}

}
