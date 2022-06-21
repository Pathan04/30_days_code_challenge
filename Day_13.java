/*
  
  30_Days_Code_Challenge
  Java Program For Finding Max 1's In a Row

*/

import java . util . *;
public class Day_13{
    public static int CountNumberOfRowsContainsMaxOnes(int [][] arr){
        int count = -1,It =0,Row = 0;
        for(int i =0;i< arr.length;i++){
            count = 0;
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count ++;
                }
                if(count == arr[0].length){
                    It = count;
                    Row = i;
                break;
            }
            }
           
        }
        if(It == arr[0].length){
            return Row; 
        }
        
        return -1;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System . in);
        System . out.print("Enter Size Rows And Columns For matrix : ");
        int r = s.nextInt();
        int c = s.nextInt();
        int [][] arr = new int[r][c];
        System . out.println("Enter Array Elements Only 1's  &  0's : ");
        for(int i =0;i< arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int NumberCount = CountNumberOfRowsContainsMaxOnes(arr);
        
        if(NumberCount ==-1){
            System. out.println("Row Not Found");
        }
        
        else{
            System . out.println("The Whole Row With 1's : "+(NumberCount+1));
        }
    }
}
