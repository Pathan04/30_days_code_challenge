/*    30_Days_code_challenge
      String Polindrome Program in Java

*/

import java . util . *;
public class Day_3
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
		if(Old_String.equals(Rev_String)){
		    System . out.println("Yes It's Polindrome");
		}
		else{
		    System . out.println("Oops !..It's Not Polindrome");
		}
	}
}
