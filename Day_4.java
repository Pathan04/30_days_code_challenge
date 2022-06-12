/*   
     30_Days_Code_Challenge
     Java Program to Reverse Array

*/

import java . util .*;
public class Day_4{
    public static void main(String [] args){
        Scanner s = new Scanner(System .in);
        System . out.print("Enter Size of Array : ");
        int n = s.nextInt();
        
        int [] arr = new int[n];
        System . out.print("Enter Array Elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System . out.print("The Reverse Of Array : ");
        for(int i = arr.length-1;i>=0;i--){
            System . out.print(arr[i]+" ");
        }
    }
}
