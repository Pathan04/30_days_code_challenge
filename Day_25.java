/* 30_Days_Code_Challenge
   Day_25
   Java Program to find Character Difference in a String Using StringBuilder.
   The Difference Will be in Ascci Value.
*/


import java . util . *;
public class Day_25
{
    public static String charDifferenceInAscii(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i =1 ;i<str.length();i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            int gap = curr - pre;
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in );
		String str = s.nextLine();
	   	System.out.println(charDifferenceInAscii(str));
	}
}

