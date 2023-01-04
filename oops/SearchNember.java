package oops;
import java.util.Scanner;


public class SearchNember {

	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter how many numbers do you want to store");//6
		int size=scanobj.nextInt();
		int arry[] = new int[size];
		for(int ctr=0;ctr<size;ctr++)
		{
			arry[ctr]=scanobj.nextInt();//40,34,23,45,67,89
		}
			System.out.println("enter the number do you want to search");
				int searchnumber=scanobj.nextInt();
				boolean flag=false;
				for(int ctr1=0;ctr1<size;ctr1++) {
					if(arry[ctr1]==searchnumber) {
					
						flag=true;
						System.out.println("number is fountd at"+ctr1);
			
						break;
						
					}
				}
	
						if(flag==false){
							System.out.println("number is not found");
					
				
						}	

	}

}
