import java.util.Scanner;
public class Varun{
public static void main(String [] args){
int n;
float ag,tot=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of subjects:- ");
n=sc.nextInt();
float m[]=new float[n];
System.out.print("Enter the marks:- ");
for(int i=0;i<n;i++){
m[i]=sc.nextFloat();
tot=tot+m[i];
}
System.out.print("Total Marks: - "+tot);
ag=tot/4;
System.out.print("\nAggregate:- "+ag);
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
if(m>=50){
System.out.print("Distinction with all pass");
}
}
}
