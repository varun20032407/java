import java.util.Scanner;
public class main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str1,str2;
System.out.println("ENTER THE USERNAME----> ");
str1=sc.nextLine();
System.out.println("RE-ENTER THE USERNAME----> ");
str2=sc.nextLine();
if(str1==str2){
System.out.print("VALID USERNAME");
}
else{
System.out.print("INVALID USERNAME");
}
}
}
