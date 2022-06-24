/*
30_Days_Code_Challenge
Java Program To Display Elements in Spiral Form

*/


import java . util .*;
public class Day_16
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System .out.print("Enter Number Of Rows And Columns : ");
		int row = s.nextInt();
		int column = s.nextInt();
		int [][] arr = new int[row][column];
		System .out.println("Enter Array Elements : ");
		for(int i =0;i<arr.length;i++){
		    for(int j =0;j<arr[0].length;j++){
		        arr[i][j] = s.nextInt();
		    }
		}
		int minr = 0;
		int minc = 0;
		int maxr = arr.length -1 ;
		int maxc = arr[0].length -1 ;
		int ne = row * column;
		int count =0;
		System . out.println("Displaying Array After Spiral : ");
		while(count<ne){
		    for(int i = minr ;i<=maxr && count<ne;i++){
		        System . out.print(arr[i][minc]+" ");
		        count++;
		    }
		    minc++;
		    for(int i=minc ;i<=maxc && count<ne;i++){
		        System. out.print(arr[maxr][i]+" ");
		        count++;
		    }
		    maxr--;
		    for(int i = maxr ;i>=minr && count<ne;i--){
		        System . out.print(arr[i][maxc]+" ");
		        count++;
		    }
		    maxc--;
		    for(int i = maxc ;i>=minc && count<ne;i--){
		        System . out.print(arr[minr][i]+" ");
		        count++;
		    }
		    minr++;
		}
	}
}
