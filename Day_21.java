/* 30_Days_Code_Challenge
   Day_21
   Java Program For Finding Substring of Polindrome
*/

import java.io.*;
import java.util.*;

public class Day_21 {

	public static void solution(String str){
		for(int i = 0 ; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
			
				if(isPalindrome(str.substring(i, j))){
					System.out.println(str.substring(i,j));
				}
			}
		}
	}

	public static boolean isPalindrome(String str){
		int i = 0, j = str.length() - 1;
		while(i < j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
  
