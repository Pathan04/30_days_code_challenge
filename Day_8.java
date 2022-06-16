/*  30_Days_Code_Challenge
    Java Program To Find the Union & Intersection Of Two Sorted Arrays

*/

import java . util .*;
public class Day_8{
    public static void Union(int [] arr,int [] arr1,int n,int n1){
        if(n>=n1){
            for(int i =0;i<n1;i++){
                if(arr[i]==arr1[i]){
                    System . out.print(arr[i]+" ");
                }
                
        }
           for(int i = n1;i<arr.length;i++){
            System . out.print(arr[i]+" ");
        }
        
    }
    else if(n<=n1){
         for(int i =0;i<n;i++){
                if(arr[i]==arr1[i]){
                    System . out.print(arr1[i]+" ");
                }
                
        }
        for(int i = n;i<arr1.length;i++){
            System . out.print(arr1[i]+" ");
        }
           
        
    }
    }
    public static void Intersection(int [] arr, int[] arr1,int n,int n1){
             if(n>=n1){
            for(int i =0;i<n1;i++){
                if(arr[i]==arr1[i]){
                    System . out.print(arr[i]+" ");
                }
               
        }
        
    }
    else if(n<=n1){
         for(int i =0;i<n;i++){
                if(arr[i]==arr1[i]){
                    System . out.print(arr1[i]+" ");
                }
              
        }
        
    }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System . in);
        System . out.println("Enter The Size Of First Array : ");
        int n = s.nextInt();
        int [] arr = new int[n];
        System . out.println("Enter The Size Of Second Array : "); 
        int n1 = s.nextInt();
        int [] arr1 = new int[n1];
        System. out.println("Enter 1st Array Elements : ");
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System. out.println("Enter 2nd Array Elements : ");
        for(int i =0;i<n1;i++){
            arr1[i] = s.nextInt();
        }
        System . out.println("The Union Of Two Arrays : ");
        Union(arr,arr1,n,n1);
        System . out.println();
        System . out.println("The Intersection Of Two Arrays: ");
        Intersection(arr,arr1,n,n1);
        
        
    }
}
