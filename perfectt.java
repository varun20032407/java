import java.util.Scanner;
public class Main
{
public static void  main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,st,en,sum,c=0;
System.out.println("Enter the starting value:- ");
st=sc.nextInt();
System.out.println("Enter the ending value:- ");
en=sc.nextInt();
try{
System.out.println("Enter the nth value:- ");
n=sc.nextInt();
if(n<=0)
{
System.out.println("INVALID");
System.exit(0);
}
else
{
for(int i=st;i<=en;i++)
{
sum=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
{
sum+=j;
}
}
if(sum==i)
{
System.out.println(i);
}
}

}
}
catch(Exception e)
{
System.out.println("INVALID");
System.exit(0);
}
}}