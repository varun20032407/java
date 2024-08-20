import java.util.Scanner;
public class Main{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a,b,ch,add,sub;
System.out.println("Enter first number:- ");
a=sc.nextInt();
System.out.println("Enter second number:- ");
b=sc.nextInt();
System.out.println("Enter your choice");
System.out.println("ADD");
System.out.println("SUB");
ch=sc.nextInt();
switch(ch){
case 1:
{
add=a+b;
System.out.println("ADD:- "+add);
break;
}
case 2:
{
sub=a-b;
System.out.println("SUB:- "+sub);
break;
}
default:
System.out.println("Invalid");
}
}
}
