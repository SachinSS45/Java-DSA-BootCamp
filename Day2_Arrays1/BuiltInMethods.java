//Built In methods in java
import java.util.Arrays;
class Demo2{

	public static void main(String[] args){
		
		int[] arr = {30,10,40,23,89,34};

		//printing the array

		System.out.println(Arrays.toString(arr));//[30, 10, 40, 23, 89, 34]

		//Sort the array

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[10, 23, 30, 34, 40, 89]

		//for each loop
		for(int ele : arr){ // for ele in array 
			System.out.print(ele + " ");
		}
		
	}
}
