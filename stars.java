import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
char input='A';
int caps=0,small=0,num=0;
while(input!='*'){
System.out.println("ENTER THE CHARECTER => ");
input=sc.next().charAt(0);
if(input>=65 && input<=90)
caps++;
if(input>=97 && input<=122)
small++;
if(input>=48 && input<=57)
num++;
}
System.out.println("THE NUMBER OF CAPS => "+caps);
System.out.println("THE NUMBER OF SMALL => "+small);
System.out.println("THE NUMBER OF NUMBERS => "+num);
}
}




