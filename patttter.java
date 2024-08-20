import java.util.*;
public class Main{
public static void main(String[] args){
int i,j,N,s;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number to be printed:- ");
s=sc.nextInt();
System.out.print("Enter number of rows:- ");
N=sc.nextInt();
for (i = 0; i < N; i++)
	{
		for (j = 0; j < i + 1; j++)
			System.out.print(s+" ");
		System.out.print("\n");
	}
	for (i = 1; i < N; i++)
	{
		for (j = i; j < N; j++)
			System.out.print(s+" ");
		System.out.print("\n");
	}
}
}
 

