/* 30_Days_code_Challenge
   Day 20
   Java Program For Binary Search for 1D Array


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<arr.length;i++){
		    arr[i] = s.nextInt();
		}
		int ele = s.nextInt();
		int begin = 0,end = arr.length-1,mid;
		while(begin<end){
		    mid = (begin +end)/2;
		    if(ele > arr[mid]){
		        begin  = mid +1;
		    }
		    else if(ele < arr[mid]){
		        end = mid -1;
		    }
		    else{
		        System . out.println("Element Found At Index : "+mid);
		        return;
		    }
		}
		System . out.println("Element Not Found");
	}
}

*/

/* Java Program For Binary Search for 2d Array
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int x = s.nextInt();
        int i=0;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){
            if(x==arr[i][j]){
                System . out.println(i);
                System . out.println(j);
                return;
            }
            else if(x>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System . out.println("Not Found");
    }

}
*/
