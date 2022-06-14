/* #30_Days_Code_Challenge
   Java Program for Finding Kth Largest element in Array
*/
import java.util.*;
public class Day_6
{   public static int Sort(int arr[],int n ,int K){
    int temp = 0;
    for(int i =0;i<n;i++){
        for(int j = i+1;j<n;j++){
            if(arr[i]<=arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr[K];
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System . out.print("Enter The Size Of array : ");
		int n = s.nextInt();
		int [] arr = new int[n];
		System . out.println("Enter Array Elements : ");
		for(int i =0;i<arr.length;i++){
		    arr[i] = s.nextInt();
		}
		System . out.println("Enter the Index that to be Find Kth Largest Elememt in Array : ");
		int K = s.nextInt();
		int Greatest_value_At_nth_Index = Sort(arr,n,K);
		System . out.println("Note : Remember the Array Index Start From '0'");
		System . out.println("The Greatest_value_At "+K+" : "+Greatest_value_At_nth_Index);
		
	}
}
