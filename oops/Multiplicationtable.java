package oops;
import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		Scanner scanobj= new Scanner(System.in);
		System.out.println("enter Multiplier");
		int Multiplier =scanobj.nextInt();
		System.out.println("enter the limit of table..");
		int limit=scanobj.nextInt();
		int ctr=1;	
		while(ctr<=limit)//
				
		//for(int ctr=1;ctr<=limit;ctr++)			
			
		{
			System.out.println(Multiplier+ "*" +ctr +" = "+(Multiplier*ctr));
			ctr++;
		
		
		
		
		}

		
		
	}
}