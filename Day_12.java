/*
   30_Days_Code_Challenge
   Java Program for Strassens Matrix Multiplication

*/

import java . util. *;
public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System . in);
        System.out.println("Enter First Matrix Row And Column : ");
        int n = s.nextInt();
        int n1 = s.nextInt();
        int [][] arr = new int[n][n1];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Ente Second Matrix Row And Column : ");
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int [][] arr1 = new int[n2][n3];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr1[i][j] = s.nextInt();
            }
        }
        int [][] arr2 = new int[n][n3];
        
        for(int i =0;i<n;i++){
            for(int j =0;j<n3;j++){
                for(int k =0;k<n1;k++){
                    arr2[i][j] +=arr[i][k] * arr1[k][j];
                }
            }
        }
        System.out.println("Strassens Mattrix Multiplication : ");
        for(int i =0;i<arr2.length;i++){
            for(int j =0;j<arr2[0].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System . out.println();
        }
        
    }
}
