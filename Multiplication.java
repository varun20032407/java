import java.util.*;
import java.io.*;

class Multiplication{
	public static void main(String[] args){
		int m , n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value: ");
		m = sc.nextInt();
		System.out.println("Enter the N Value: ");
		n = sc.nextInt();
		for(int i = 1;i <= n;i++){
			System.out.println(m + " * " + i + " = " + (m*i));}
		}
}