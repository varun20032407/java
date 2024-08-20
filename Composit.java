import java.util.*;

class Composit{
	public static void main(String[] args){
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start range: ");
		a = sc.nextInt();
		System.out.println("Enter the End range: ");
		b = sc.nextInt();
		int count;
		for(int i = a ;i<b;i++){
			count = 0;
			for(int j = 1 ;j<i;j++){
				if(i%j==0){
					count++;}}
			if(count>1){
				System.out.println("Val: " + i);}
		}
	}
}
		