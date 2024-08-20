import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
int a,day,week,yr;
System.out.print("ENTER NO.OF DAYS---> ");
a=sc.nextInt();
if(a>0){
yr=a/365;
a=a%365;
System.out.print("NO. OF YEARS---> "+yr);
week=a/7;
a=a%7;
System.out.print("\nNO. OF WEEKS---> "+week);
day=a;
System.out.print("\nNO. OF DAYS---> "+day);
}
else{
System.out.print("NEGATIVE OR ZERO");
}
}
catch(Exception e){
System.out.print("ERROR");
}
}
}