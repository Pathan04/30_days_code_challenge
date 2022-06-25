/*
  30_Days_Code_Challenge
  Java Program to Array Wave Traversal 
  
*/

import java . util . *;
public class Day_17
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System . out.print("Enter Number of Rows And Columns : ");
		int row = s.nextInt();
		int column = s.nextInt();
		System . out.println("Enter Array Elements : ");
		int [][] arr = new int[row][column];
		for(int i =0;i<arr.length;i++){
		    for(int j =0;j<arr[0].length; j++){
		        arr[i][j] = s.nextInt();
		    }
		}
		System. out.println("Displaying Array In Wave Traversal : ");
		
		    for(int j =0; j< arr[0].length;j++){
		        if(j%2 ==0){
		            for(int k =0;k<arr.length;k++){
		                System . out.print(arr[k][j]+" ");
		                
		            }
		        }
		        else{
		            for(int l =arr.length-1;l>=0;l--){
		                System . out.print(arr[l][j]+" ");
		            }
		        }
		    
		}
	}
}

