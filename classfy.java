import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int ch;
System.out.print("Enter the number(1/2/3/4):- ");
ch=sc.nextInt();
if(ch==1){
System.out.print("ROADWAYS");
}
else if(ch==2){
System.out.println("AIRWAYS");
}
else if(ch==3){
System.out.println("TWO WHEELERS");
}
else if(ch==4){
System.out.println("FOUR WHEELERS");
}
else{
System.out.println("INVALID");
}
}
}

