/* 30_Days_Code_Challenge
   Day_28
   Java Program for Converting PlainText to CipherText
*/


public class Day_28{
    public static void main(String[] Imran){
        java.util.Scanner s = new java . util.Scanner(System.in);
        String PlainText;
        System.out.println("Enter Plain Text : ");
        PlainText=s.nextLine();
        char Alphabet;
        int key;
        System.out.println("Enter Key : ");
        key = s.nextInt();
        String CipherText="";
        for(int i=0;i<PlainText.length();i++){
            Alphabet = PlainText.charAt(i);
            if(Alphabet>='a' && Alphabet<='z'){
                Alphabet = (char)(Alphabet+key);
            
            if(Alphabet>'z'){
                Alphabet = (char)(Alphabet+'a'-'z'-1);
            }
            CipherText +=Alphabet;
        }
        else if(Alphabet>='A' && Alphabet<='Z'){
            Alphabet = (char)(Alphabet+key);
            if(Alphabet>'Z'){
                Alphabet =(char)(Alphabet +'A'-'Z'-1);
            }
           CipherText +=Alphabet;
        }
        }
        System.out.println("The CipherText : "+CipherText);
    }
}
