import java.util.Scanner;
public class main{
public static void main(String[] args){
int n;
float num;
Scanner sc= new Scanner(System.in);
try{
System.out.print("Enter the starting range---> ");
num=sc.nextFloat();
System.out.print("Enter the max lines to be printed----> ");
n=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
System.out.print(String.format("%.1f",num));
num+=0.1;
}
System.out.print("\n");
}
for(int i=n;i>0;i--){
for(int j=i;j>0;j--){
System.out.print(String.format("%.1f",num));
num+=0.1;
}
System.out.print("\n");
}
}
catch(Exception e){
System.out.print("\nINVALID");
}
}
}
