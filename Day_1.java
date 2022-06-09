/* 
   Java Program to Reverse a Number

*/


import java.util.*;
public class Day_1
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num,digit;
		System . out.print("Enter a Number : ");
		num = s.nextInt();
		System . out.print("\nThe Reverse Of "+num + " : ");
		
		while(num>0){
		    digit = num % 10;
		    System .out.print(digit+"");
		    num = num / 10;
		}
	}
}
