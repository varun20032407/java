import java.util.Scanner;
public class skip{
    public static void main (String [] args)
    {
        int sr,er,k,i,j,p[100]=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        sr=sc.nextInt();
        System.out.println("Enter the ending range: ");
        er = sc.nextInt();
        System.out.println("Enter the no. to skip: ");
        k = sc.nextInt();
        for(i=sr;i<=er;i++)
        {
            p[i]= sr+7;
        }
    System.out.print("\nThe no.s are: { ");
        for(i=sr;i<=er;i++)
        {
            System.out.print(" "+ p[i]);
        }
    }
}