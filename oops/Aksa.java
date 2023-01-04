package oops;
import java.util.Scanner;
public class Aksa {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanobj= new Scanner(System.in);
		int arrinput = scanobj.nextInt();
		int[] array = new int[10]; 
		System.out.println("Enter the elements of the array: ");  
	
		for(int  ctr=0; ctr<arrinput; ctr++)  
		{  		   
			array[ctr]=scanobj.nextInt();
		}
		
	
		for(int i=1;i<=arrinput;i++)
        {
             //declare inner loop for print the spaces
             for(int j=1;j<=arrinput-i;j++)
             {
                    System.out.print(" ");
             }
             //declare inner loop for print the number
             for(int j=i;j<=i*2-1;j++)
             {
                   //here we print i, here  print same number in a row
                    System.out.print(i+" ");
             }
             System.out.println();
	}
}
}




