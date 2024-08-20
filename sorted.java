import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int n,i,j;
        String arr[]=new String[100];
        Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
try{
        System.out.println("ENTER NO OF STRING----> ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("ENTER THE STRING---> ");
            arr[i]=s.nextLine();
        }
        System.out.println("\t\t---BEFORE SORTING---");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int c,a;
        String temp;
        System.out.println("ORDER (A-0/D-1)---> ");
        c=sc.nextInt();
        if(c==0){
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(arr[i].compareTo(arr[j])>0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println("\t\t---ASCENDING ORDER---\n");
            System.out.println("\t\t---AFTER SWAPING--\n");
            for(i=0;i<n;i++){
                System.out.println(arr[i]);
            }
            int x;
            System.out.println("VALUE OF N---> ");
            x=sc.nextInt();
            System.out.println(x+" WORD IN ASCENDING ORDER---> "+arr[x-1]);
        }
        else if(c==1){
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(arr[j].compareTo(arr[i])>0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println("\t\t---DESCENDING ORDER---\n");
            System.out.println("\t\t---AFTER SWAPING--\n");
            for(i=0;i<n;i++){
                System.out.println(arr[i]);
            }
            int y;
            System.out.println("VALUE OF N---> ");
            y=sc.nextInt();
            System.out.println(y+" WORD IN ASCENDING ORDER---> "+arr[y-1]);
        }
}
catch(Exception e){
System.out.println("ERROR");
}
    }
}