/* 

  30_Days_Code_Challenge
  Java Program To Find Duplicate Elements In Array

*/


import java .util.*;
public class Day_11{
    public static void FindDuplicateElement(int [] arr){
        int count=0,i =0;
        for(i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println("Duplicate Element Found & The Element : "+arr[j]);
                    
                    break;
                }
                
                
            }
        }
        if(count==0){
             System . out.println("Duplicate Element Not Found ");
            
        }
        else{
            
           System . out.println("End Of The Program & Thanks For using This Code ");
           System . out.println("Done By Imran");
        }
        
        
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System . in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        FindDuplicateElement(arr);
    }
    
}
