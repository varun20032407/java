import java.util.Scanner;
public class Main{
public static void main(String[] args){
int sal,tax;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the income:- ");
sal=sc.nextInt();
if(sal<=150000){
tax=0;
System.out.println("Tax= "+tax);
}
else if(sal>150000<=300000){
tax=sal*0.1;
System.out.println("Tax= "+tax);
}
else if(sal>300000<=500000){
tax=sal*0.2;
System.out.println("Tax= "+tax);
}
else if(sal>500000){
tax=sal*0.3;
System.out.println("Tax= "+tax);
}
}
}