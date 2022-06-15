/*   30_Days_Code_Challenge
     Java Program to Move all negative numbers to beginning and positive to end

*/ 

import java . util . *;

public class Day_7
{
    public static void negative_elements(int [] arr, int n){
        int j =0,temp =0;
        for(int i=1;i<n;i++){
            if(arr[j]<=0){
                temp = arr[j];
                arr[j] =arr[i];
                arr[i] = temp;
            }
            j++;
        }
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System .in);
	    System . out.print("Enter The Size Of Array : ");
		int n = s.nextInt();
		int [] arr = new int[n];
		System . out.println("Enter Array Elemets : ");
		for(int i =0;i<n;i++){
		    arr[i]= s.nextInt();
		}
		 negative_elements(arr,n);
		 System . out.print("Here It's Printing All neagtive Elements a Side : ");
		for(int i =arr.length-1 ;i>=0;i--){
		    System . out.print(arr[i]+" ");
		}
		
	}
}
