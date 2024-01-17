/*
 * (1) Find the number of pairs have sum as Target
 * (2) Count the number of triplets whose sum is equal to the given value x
 *
 */
import java.util.Scanner;
import java.util.Arrays;
public class Questions{
	
	static int pairSum(int[] arr,int target){
		int count = 0;
		for(int i=0;i<arr.length-1;i++){

			for(int j=i+1;j<arr.length;j++){

				if(arr[i]+arr[j]==target)count++;
			}
		}
		return count;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		//Creation of Array 
		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements of array : ");
		for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();

		//Printing the Array 
		System.out.println(Arrays.toString(arr));

		System.out.println("Enter the target : ");
		int target = sc.nextInt();

		System.out.println("Number of pairs with target sum " + target + " : " + pairSum(arr,target));

	}
}
