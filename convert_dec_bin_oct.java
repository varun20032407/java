import java.util.*;
import java.lang.Math;
class conversion_model
{
	public static void main(String[] args)
	{
		try{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE BINARY NUMBER --> ");
		int bin=sc.nextInt();
		int dec=0;
		int i=0, f=0, flag=0;
		
			while (bin!=0)
		{
			f=bin%10;
			if (f!=0 && f!=1)
			{
				System.out.println("INVALID BINARY NUMBER!");
				flag=1;
				break;
			}
			else
			{
				dec+=(bin%10)*(Math.pow(2,i));
				bin/=10;
				i++;
			}
		}
		if (flag!=1)
		{
			String octal_chars[]={"0","1","2","3","4","5","6","7"};
			int a=dec;
			String oct="";
			while (a!=0)
			{
				oct=octal_chars[a%8]+oct;
				a/=8;
			}
			System.out.print("DECIMAL --> "+dec+ "\n");
			System.out.print("OCTAL --> "+oct);
		}
		}
		catch(Exception e){
			System.out.println("Invalid");
			System.exit(0);
		}		
	}}
