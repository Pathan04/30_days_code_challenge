/*   
     30_Days_Code_Challenge
     Java Program for Cyclically Rotate Array By One

*/

import java . util . *;
public class Day_9
{
    public static void rotate(int arr[], int n)
    {    int temp =0,count = arr.length-2;
        for(int i =arr.length-1;i>=0;i--){
            if(i==0){
                return;
            }
            temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count --;
            
        }
    }
	public static void main(String[] args) {
        Scanner s = new Scanner(System . in);
        System . out.print("Enter Array Size : ");
        int n = s.nextInt();
        System . out.println("Enter Array Elements : ");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        rotate(arr,n);
        System . out.println("Array After One Cycle Rotation : ");
        for(int i =0;i<arr.length;i++){
            System . out.print(arr[i]+" ");
        }
        
	}
}
