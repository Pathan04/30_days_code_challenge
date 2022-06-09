/* 
                                                                     30_Day_Coding_Challenge : Day_2
                                                                  #Java Program to Reverse a String
*/

import java . util . *;
public class Day_2
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System . out.print("\nEnter a String / Paragraph : ");
		String Old_String = s.nextLine();
		char c;
		String Rev_String ="";
		for(int i=Old_String.length()-1;i>=0;i--){
		    c = Old_String.charAt(i);
		    Rev_String = Rev_String + c;
		}
		System.out.print("\nThe Reverse Of String "+" ' "+Old_String+" '"+ " : "+Rev_String);
	}
}
