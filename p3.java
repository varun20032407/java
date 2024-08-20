import java.util.Scanner;
public class Main{
public static  void main(String[] args){
int i,j,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows:- ");
r=sc.nextInt();
for(i=0;i<r;i++){
for(j=r-i;j>1;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}}}