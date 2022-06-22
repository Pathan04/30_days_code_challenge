/*
30_Days_Code_Challenge
Implementing Rock Paper Scissor Game Using Java. 

*/



import java.util.*;

public class Day_14
{
	public static void main(String[] args) {
	    Random r=new Random();
	    Scanner s1 = new Scanner(System.in);
	    int rand = r.nextInt(3);
	    
	    char comp;
	    char i;
	    System.out.println("Enter \nRock--->'r'\nPaper--->'p'\nSicssor--->'s'    : ");
	    i = s1.next().charAt(0);
	    if(rand==0){
	        comp = 'r';
	        
	    }
	    else if(rand==1){
	        comp = 'p';
	    }
	    else{
	        comp = 's';
	    }
	    if(i == comp){
	        System.out.println("Match Tie !..");
	    }
	    else if(comp =='p'){
	       if(i=='r'){
	           System.out.println("Computer Won !..");
	       }
	       
	       else{
	           System.out.println("You Won !...");
	       }
	        
	    }
	   else if(comp =='r'){
	       if(i=='s'){
	           System.out.println("Computer Won !..");
	       }
	       
	       else{
	           System.out.println("You Won !...");
	       }
	        
	    }
	    else if(comp=='s'){
	         if(i=='p'){
	           System.out.println("Computer Won !..");
	       }
	       
	       else{
	           System.out.println("You Won !...");
	       }
	        
	        
	    }
	    
	    
	    
	}
}


