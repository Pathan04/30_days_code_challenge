/* 30_Days_Code_Challenge
   Day_23
   Java Program For Permutation a Word Using StringBuilder Class


import java.io.*;
import java.util.*;

public class Day_23 {

	public static void solution(String str){
		int n = str.length();
		int f = factorial(n);
		int rem =0;
		
		for(int i = 0;i<f;i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp = i;
		    for(int div = n;div>=1;div--){
		       int q = temp / div;
		       rem = temp%div;
		       System . out.print(sb.charAt(rem));
		       sb.deleteCharAt(rem);
		       temp = q;
		    }
		    System . out.println();
		}
		
	}
	public static int factorial(int n){
	    int fact = 1;
	    for(int i=2 ;i<=n;i++){
	        fact*=i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
*/




/*
Java Program For Permutation a Number Using StringBuilder Class



import java . util . *;
public class Day_23
{
    public static int Factorial(int n){
        int fact = 1;
        for(int i = 2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void permutation(String str){
        int n = str.length();
        int Permutate = Factorial(n);
        
        for(int i =0;i<Permutate;i++){
            StringBuilder sb  = new StringBuilder(str);
            int temp = i;
            for(int Div = n ;Div>=1;Div--){
                int qotient = temp / Div;
                int rem = temp % Div;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp = qotient;
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		Scanner s =new Scanner(System .in);
		String str = s.next();
		permutation(str);
	}
}

*/
