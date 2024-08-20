import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        float tot=0,ag;
        System.out.println("ENTER NO OF SUBJECTS---> ");
        n=sc.nextInt();
        float m[]=new float[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE MARKS---> ");
            m[i]=sc.nextFloat();
            
            tot=m[i]+tot;
            ag=tot/m[i];
        }
        
        System.out.println("TOTAL MARKS---> "+tot);
        System.out.println("AGGREGATE---> "+ag);
    }
}