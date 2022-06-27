/*
  30_Days_Code_Challenge
  Java Program For Simple Game
*/

import java . util. *;

class Day_19
{
    public static void coinFlip(){
        Scanner s = new Scanner(System .in);
        Random r = new Random();
        int f = r.nextInt(2);
        System . out.println("Enter '0' For Head\n '1'For Tail :");
        int p1 = s.nextInt();
        if(p1 == f){
            System . out.println("You Won !...");
        }
        else{
            System . out.println("Computer Won !...");
        }
    }
    public static void oddEvenGame(){
        Scanner s = new Scanner(System . in);
        System . out.println("Choose Player To Say Even Or Odd : ");
        int ch=s.nextInt();
        if(ch ==1){
            System . out.println("Enter \n'1'For Even \n'2'For Odd : ");
            int Move = s.nextInt();
            System . out.println("Enter Player 1 Fingers Count : ");
            int p1 = s.nextInt();
            System . out.println("Enter Player 2 Finger Count : ");
            int p2 = s.nextInt();
            if((p1+p2)%2==0){
                int Even = 1;
                if(Move==Even){
                    System . out.println("Player '1' Won !..");
                }
                else{
                    System . out.println("Player '2' Won !...");
                }
               
            }
            else{
                System . out.println("Player '1' Won!...");
            }
             
        }
        else{
        System . out.println("Enter \n'1'For Even \n'2'For Odd : ");
            int Move = s.nextInt();
            System . out.println("Enter Player 1 Fingers Count : ");
            int p1 = s.nextInt();
            System . out.println("Enter Player 2 Finger Count : ");
            int p2 = s.nextInt();
            if((p1+p2)%2!=0){
                int odd = 2;
                if(Move==odd){
                    System . out.println("Player '2' Won !..");
                }
                else{
                    System . out.println("Player '1' Won !...");
                }
                
            }
            else{
                    System . out.println("Player '2' Won !...");
                }
        }
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System .in);
       int ch;
       
       do{
        System . out.println("Which Game You Want To Play : ");
        System . out.println("'1'for Coin Flip \n'2'For Odd Or Even Game \n'3'For Exit : ");
        ch = s.nextInt();
        switch(ch){
            case 1 :{
                System . out.println("Welcome to Coin Flip Game");
                coinFlip();
                break ;
            }
            case 2 :{
                System . out.println("Welcome To Odd Even Game");
                oddEvenGame();
                break;
            }
            case 3:{
                System . out.println("Exit");
                break;
            }
            default : System . out.println("Invalid Input");
        }
           
       }while(ch!=3);
        
    }
}
