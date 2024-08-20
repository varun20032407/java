import java.util.Scanner;
public class Main{
public static void main(String [] args){
int age,vote;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:- ");
age=sc.nextInt();
if(age>0){
if(age>=18){
System.out.println("You are eliglble to vote");
}
else if(age<18)
{
vote=18-age;
System.out.println("You are eligible to vote after " +vote+ " years");
}
}
else if(age<0){
System.out.println("Age can't be in negative");
}
else{
System.out.println("Invalid");
}
}
}

