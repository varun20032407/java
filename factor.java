import java.util.Scanner;
import java.io.*;
public class nthfactor 
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int i,num,nth,count=0;
		System.out.println("ENTER THE NUMBER => ");
		num=sc.nextInt();
		System.out.println("ENTER THE Nth ELEMENT => ");
		nth=sc.nextInt();
if(num>0&&nth>0){

		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				if(count==nth)
					System.out.println("nth factor is => "+i);
			}
		}
		System.out.println("total number of factors => "+count);
		}
        else{
            System.out.println("Invalid");
        }
		
}
}
