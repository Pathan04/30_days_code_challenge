/* 30_Days_Code_Challenge
   Day_29
   Java Program to know Maximum Number Of 1's in Matrix
*/

import java . util.*;
public class Day_29
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System . out.print("Enter Number Of Rows And Columns : ");
		int row = s.nextInt();
		int column = s.nextInt();
		int count=1;
		int [][] Mat = new int[row][column];
		System.out.println("Enter Matrix Elements Only 0's and 1's : ");
		for(int i =0;i<Mat.length;i++){
		    for(int j =0;j<Mat[0].length;j++){
		        Mat[i][j] = s.nextInt();
		    }
		}
		for(int i =0;i<Mat.length;i++){
		    count=0;
		    for(int j =0;j<Mat[0].length;j++){
		        if(Mat[i][j]==1){
		            count++;
		            if(count>=column){
		                System . out.println("At Index "+i+" We Get Max One's");
		                
		            }
		        }
		    }
		}
		
		
	}
}
