import java.util.Scanner;
public class Main{
public static void main(String[] args){
float sal;
float tax;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the income:- ");
sal=sc.nextInt();
if(sal<=150000){
tax=0;
System.out.println("Tax= "+tax);
}
else if(sal>150000&&sal<=300000){
tax=sal*10/100;
System.out.println("Tax= "+tax);
}
else if(sal>300000&&sal<=500000){
tax=sal*20/100;
System.out.println("Tax= "+tax);
}
else if(sal>500000){
tax=sal*30/100;
System.out.println("Tax= "+tax);
}
}
}