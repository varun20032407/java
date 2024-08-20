import java.util.Scanner;
public class Main{
public static void main(String[] args){
int n1,n2,n3,n4,no1,no2,no3,no4,tot;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st Denomination:- ");
n1=sc.nextInt();
System.out.println("Enter 1st Denomination number of notes:- ");
no1=sc.nextInt();
System.out.println("Enter the 2nd Denomination:- ");
n2=sc.nextInt();
System.out.println("Enter 2nd Denomintaion number of notes:- ");
no2=sc.nextInt();
System.out.println("Enter 3rd Denomination:- ");
n3=sc.nextInt();
System.out.println("Enter 3rd Denomination number of notes:- ");
no3=sc.nextInt();
System.out.println("Enter the 4th Denomination:- ");
n4=sc.nextInt();
System.out.println("Enter 4th Denomination number of notes:- ");
no4=sc.nextInt();
if(n1>=0&&n2>=0&&n3>=0&&n4>=0){
tot=n1*no1+n2*no2+n3*no3+n4*no4;
System.out.println("Total Avaliable Balance in ATM:- " +tot); 
}
else{
System.out.println("Invalid");
}
}}
