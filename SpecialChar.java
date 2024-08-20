import java.util.*;
import java.io.*;

class SpecialChar{
	public static void main(String[] args){
		String word = "Ashik@Sabu.com";
		int k=0;
		for(int i=0;i<word.length();i++){
			if((word.charAt(i)>=65 &&  word.charAt(i)<=90) || (word.charAt(i)>=97 && word.charAt(i)<=122) || (word.charAt(i)>=30 && word.charAt(i)<=39)){
				continue;}
			else{
				int s = word.charAt(i);
				System.out.println("\nChar: " + word.charAt(i)+ " " + s);
				k++;}  
		}System.out.println("Count: " + k);
}}