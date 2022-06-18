/*
  30_Days_code_challenge
  Java Program to find the Maximum Sum of SubArray Using Kadane's Algorithm

*/


import java . util.*;
public class Day_10{
    public static int MaxSubArraySum(int [] arr){
        int Current_sum = 0,MaxSum =0;
        for(int i =0;i<arr.length;i++){
            Current_sum = Current_sum + arr[i];
            if(Current_sum > MaxSum){
                MaxSum = Current_sum;
            }
            if(Current_sum < 0){
                Current_sum = 0;
            }
        }
        return MaxSum;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System .in);
        System . out.print("Enter the Size Of Array : ");
        int n = s.nextInt();
        System . out.println("Enter The Array Elements : ");
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int MaxSumVal = MaxSubArraySum(arr);
        System . out.println("The maximum Sum Of SubArray : "+MaxSumVal);
    }
}
