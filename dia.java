import java.util.Scanner;
public class Main{
public static void main(String[] args){
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:- ");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<i;j++)
System.out.println("*");
System.out.println("\n");
}
for(i=1;i<n;i++){
for(j=1;j<n;j++)
System.out.println("*");
System.out.println("\n");
}
}
}

