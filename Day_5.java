/*   30_Days_Code_Challenge
     Java Program for Finding Min And Max Element in Array
*/
import java.util.*;
public class Day_5{
    public static void main(String [] args){
        Scanner s = new Scanner(System . in);
        System.out.print("Enter Size Of Array : ");
        int n = s.nextInt();
        int [] arr= new int[n];
        System . out.println("Enter Array Elements : ");
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System . out .println("The Minimum Element in Array : "+arr[0]);
        System . out.println("The maximum Element in Array : "+arr[n-1]);
        
    }
}
