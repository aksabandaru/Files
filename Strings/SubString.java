package Strings;
import java.util.Scanner;

public class SubString {
	static String toprintsubString(String text,int number1,int number2) {//bandaru 2 4
		String subString="";
		while(number1<number2) { // n,d
			subString+=text.charAt(number1++);//nd		
	}
		return subString;
	}	
	static void tocreatesubString(String text,int number) {
		int ctr=number;
		while(ctr<text.length()) {
		System.out.print(text.charAt(ctr));
		ctr++;
	}
	}
	
	

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a snetence");//bandaru
		String sentence = obj.nextLine();
		System.out.println("enter starting index value");//2
		int startIndex=obj.nextInt();
		System.out.println("press any userkey");//S
		char userKey = obj.next().charAt(0);
		try {
		if(userKey=='S' ||userKey=='s') {
			System.out.println("enter ending index value");//4
			int endIndex=obj.nextInt();
			String newString=toprintsubString(sentence,startIndex,endIndex);//call method
		
			System.out.println(newString);//nd
		}
		else {
	
		tocreatesubString(sentence,startIndex);
		}
		}
		catch(Exception e) {
			System.out.println("enter proper ending index");
			
	
		
	}		
	}
}