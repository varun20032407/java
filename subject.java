import java.util.Scanner;
public class Main{
public static void main(String[] args){
int n;
float m1,m2,m3,m4,m5,tot,ag;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of subjects:- ");
n=sc.nextInt();
if(n==3){
System.out.print("ENTER MARK OF SUBJECT 1---> ");
m1=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 2---> ");
m2=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 3---> ");
m3=sc.nextFloat();
if(m1>0&&m2>0&&m3>0&&m1<=100&&m2<100&&m3<=100){
tot=m1+m2+m3;
ag=tot/3;
System.out.print("TOTAL----> "+tot);
System.out.print("\nAGGREGATE----> "+ag);
if(ag>75){
System.out.print("\nDISTINCTION");
}
else if(ag>=60&&ag<75){
System.out.print("\nFIRST DIVISION");
}
else if(ag>=50&&ag<60){
System.out.print("\nSECOND DIVISION");
}
else if(ag>=40&&ag<50){
System.out.print("\nTHIRD DIVISION");
}
else {
System.out.print("\nFAIL");
}
if(m1>=50&&m2>=50&&m3>=50){
System.out.print("\nDISTINCTION WITH ALL PASS");
}
else if(m1>=40&&m2>=40&&m3>=40){
System.out.print("\nFIRST CLASS WITH ALL PASS");
}
else if(m1>=35&&m2>=35&&m3>=35){
System.out.print("\nSECOND CLASS WITH ALL PASS");
}
else{
System.out.print("\nINVALID");
}
}
}
else if(n==4){
System.out.print("ENTER MARK OF SUBJECT 1---> ");
m1=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 2---> ");
m2=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 3---> ");
m3=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 4---> ");
m4=sc.nextFloat();
if(m1>0&&m2>0&&m3>0&&m4>0&&m1<=100&&m2<100&&m3<=100&&m4<=100){
tot=m1+m2+m3+m4;
ag=tot/4;
System.out.print("TOTAL----> "+tot);
System.out.print("\nAGGREGATE----> "+ag);
if(ag>75){
System.out.print("\nDISTINCTION");
}
else if(ag>=60&&ag<75){
System.out.print("\nFIRST DIVISION");
}
else if(ag>=50&&ag<60){
System.out.print("\nSECOND DIVISION");
}
else if(ag>=40&&ag<50){
System.out.print("\nTHIRD DIVISION");
}
else {
System.out.print("\nFAIL");
}
if(m1>=50&&m2>=50&&m3>=50){
System.out.print("\nDISTINCTION WITH ALL PASS");
}
else if(m1>=40&&m2>=40&&m3>=40){
System.out.print("\nFIRST CLASS WITH ALL PASS");
}
else if(m1>=35&&m2>=35&&m3>=35){
System.out.print("\nSECOND CLASS WITH ALL PASS");
}
}
else{
System.out.print("\nINVALID");
}
}
else if(n==5){
System.out.print("ENTER MARK OF SUBJECT 1---> ");
m1=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 2---> ");
m2=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 3---> ");
m3=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 4---> ");
m4=sc.nextFloat();
System.out.print("ENTER MARK OF SUBJECT 5---> ");
m5=sc.nextFloat();
if(m1>0&&m2>0&&m3>0&&m4>0&&m1<=100&&m2<100&&m3<=100&&m4<=100){
tot=m1+m2+m3+m4+m5;
ag=tot/5;
System.out.print("TOTAL----> "+tot);
System.out.print("\nAGGREGATE----> "+ag);
if(ag>75){
System.out.print("\nDISTINCTION");
}
else if(ag>=60&&ag<75){
System.out.print("\nFIRST DIVISION");
}
else if(ag>=50&&ag<60){
System.out.print("\nSECOND DIVISION");
}
else if(ag>=40&&ag<50){
System.out.print("\nTHIRD DIVISION");
}
else {
System.out.print("\nFAIL");
}
if(m1>=50&&m2>=50&&m3>=50){
System.out.print("\nDISTINCTION WITH ALL PASS");
}
else if(m1>=40&&m2>=40&&m3>=40){
System.out.print("\nFIRST CLASS WITH ALL PASS");
}
else if(m1>=35&&m2>=35&&m3>=35){
System.out.print("\nSECOND CLASS WITH ALL PASS");
}
}
else{
System.out.print("\nINVALID");
}
}
}
}
