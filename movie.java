import java.util.Scanner;
public class Main{
public static void main(String[] args){
int pizza,puff,cooldrink,totalprice;
Scanner sc=new Scanner(System.in);
System.out.println("---------------------WAVE THEATRE------------------\n");
System.out.println("Enter the no.of pizza:- ");
pizza=sc.nextInt();
System.out.println("Enter the no.of puffs:- ");
puff=sc.nextInt();
System.out.println("Enter the no.of cooldrink:- ");
cooldrink=sc.nextInt();
System.out.println("-----------------------------BILL DETAILS-------------------------------\n");
System.out.println("\nNo of pizza: \n"+pizza);
System.out.println("\nNo of puffs: \n"+puff);
System.out.println("\nNo of cooldrink: \n"+cooldrink);
totalprice=pizza*100+puff*20+cooldrink*10;
System.out.println("\nTotal price: \n"+totalprice);
System.out.println("\n--------------ENJOY THE SHOW-------------");
}
}