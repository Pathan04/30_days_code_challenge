/* 30_Days_Code_Challenge
   Day_24
   Java Program to Implement Toggle Case Using StringBuilder
*/

import java . util . *;
public class Main
{
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append((char)(ch+'A'-'a'));
            }
            else{
                sb.append((char)(ch-'A'+'a'));
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in );
		String str = s.nextLine();
		System.out.println(toggleCase(str));
	}
}

