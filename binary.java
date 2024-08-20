import java.util.Scanner;
public class Convert{
    Scanner
}
public class Main{
public static void main(String [[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the binary number:- ");
int b=sc.nextInt();
int dec=0;
int i=0;
while(b!=0){
    dec+=(b%10)*(Math.pow(2,i));
    b/=10;
    i++;
}
String octal_char[]={"0","1","2","3","4","5","6","7"};
int 