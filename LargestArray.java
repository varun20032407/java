import java.util.*;
import java.io.*;

class LargestArray{
	public static void main(String args[]){
		int arr[] = {14,67,48,23,5,62};
		Scanner sc =  new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}System.out.println("Enter the Nth: ");
		int s = sc.nextInt();
		System.out.println("Largest Array: " + arr[arr.length-s]);
	}
}