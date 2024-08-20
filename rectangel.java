import java.util.Scanner;
public class Main{
public static void main(String [] args){
int i,j,a,b;
String n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:- ");
a=sc.nextInt();
System.out.println("Enter number of columns:- ");
b=sc.nextInt();
System.out.println("Enter the symbol required:- ");
n=sc.nextLine();
for(i=1;i<=a;i++){
for(j=1;j<=b;j++){
System.out.println(" "+n);
}
System.out.print("\n");
}
}
}