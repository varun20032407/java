import java.util.Scanner;
public class Main{
public static void main(String [] args){
int a[]=new int[30];
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the range:- ");
n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println("Enter the element:- ");
a[i]=sc.nextInt();
}
int t;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
int b[]=new int[30];
int c=0,z=0;
for(int i=0;i<n;i++){
if(a[i]!=a[i+1]){
b[c]=a[i];
c++;
z++;
}}
System.out.println("\n");
System.out.print("{");
for(int i=0;i<z;i++){

System.out.print("  "+  b[i]  );}
System.out.print("}");
}
}