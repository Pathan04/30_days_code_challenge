/*
  30_Days_Code_Challenge
  Java Program to Rotate Array 90 Degree
*/


import java.io.*;
import java.util.*;

public class Day_18 {

    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System .in );
        System . out.println("Enter Size Of the Array  : ");
		int n = s.nextInt();
		
		int [][] arr = new int[n][n];
		System. out.println("Note : This is An "+n+" X "+n+" Matrix ");
		System . out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++){
		    for(int j =0;j<arr[0].length;j++){
		        arr[i][j] = s.nextInt();
		    }
		}
		int countRow = 0,countColumn = 0;
		int [][] arr1 = new int[n][n];
		for(int i=n-1;i>=0;i--){
		    for(int j = n-1;j>=0;j--){
		        arr1[countRow][countColumn] = arr[i][j];
		        countColumn++;
		    }
		    countColumn =0;
		    countRow++;
		}
		for(int i=0;i<arr.length;i++){
		    int start = 0;
		    int end = n-1;
		    while(start<end){
		        int temp = arr1[i][start];
		        arr1[i][start] = arr1[i][end];
		        arr1[i][end] = temp;
		        start++;
		        end--;
		    }
		}
		 int start = 0;
		    int end =1;
		for(int i =0;i<arr.length ;i++){
		   
		    while(start < end){
		        int temp = arr1[start][end];
		        arr1[start][end] = arr1[end][start];
		        arr1[end][start] = temp;
		        if(end==n-1){
		            end=1;
		            break;
		        }
		        else{
		        end++;
		        }
		    }
		    start++;
		    end++;
		    
		}
		System . out.println("Displaying Array After 90 Degree : ");
		display(arr1);
    }

    public static void display(int[][] arr1){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
