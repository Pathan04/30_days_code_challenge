/* 30_Days_Code_Challenge
   Day_22
   Java Program to Compress a String
*/


import java.io.*;
import java.util.*;

public class Day_22 {

	public static String compression1(String str){
		String s = str.charAt(0)+"";
		for(int i =1;i<str.length();i++){
		    char  Curr = str .charAt(i);
		    char Pre = str. charAt(i-1);
		    if(Curr!=Pre){
		        s +=Curr;
		    }
		   }

		return s;
	}

	public static String compression2(String str){
		String s = str.charAt(0)+"";
		int count = 1;
		for(int i =1;i<str.length();i++){
		    char Curr = str .charAt(i);
		    char Pre = str. charAt(i-1);
		    if(Curr==Pre){
		        count++;
		    }
		    else{
		        if(count>1){
		            s+=count;
		            count=1;
		        }
		        s+=Curr;
		    }
		   }
		   if(count>1){
		       s+=count;
		   }

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System . out.println("Enter Repeated Char In String : ");
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
