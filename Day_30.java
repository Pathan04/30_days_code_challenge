/* 30_Days_Code_Challenge
   Day_30
   Implementation of RSA Algorithm Using Java
*/


import java . util .*;

public class Day_30
{
    public static int Public_Key(int e,int n){
        Scanner s = new Scanner(System .in);
        System . out.println("Enter Message : ");
        int Message =s.nextInt();
        int c = (int)(Math.pow(Message,e))%n;
        return c;
    }
    public static int GCD(int n1 ,int n2){
        while(n1%n2!=0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
            
        }
        return n2;
    }
    public static int Private_key_Generation(int d,int n,int val){
        int p = (int)(Math .pow(val,d)) % n;
        return p;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Prime Numbers : ");
		int p =s.nextInt();
		int q = s.nextInt();
		int n = p*q;
		int Fi_n=(p-1)*(q-1);
		int e=0;
		for(int i =2;i<=Fi_n;i++){
		    if(GCD(i,Fi_n)==1){
		         e = i;
		        break;
		    }
		}
		System . out.println("The Value of e : "+e);
	   int Public_Key_Value =  Public_Key(e,n);
		int d =0;
		for(int i =1;i<=n;i++){
		    if(((i*e) % Fi_n)==1){
		        d = i;
		        break;
		    }
		}
		System . out.println("The Value of d : "+d);
		
		System. out.println("The Encrypted Message : "+Public_Key_Value);
		int Privat_Key=Private_key_Generation(d,n,Public_Key_Value);
		System. out.println("Decrypted Message : "+Privat_Key);
		
		
		
		
	}
}
