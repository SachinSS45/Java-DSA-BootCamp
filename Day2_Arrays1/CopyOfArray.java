//How to copy array

import java.util.Arrays;
public class CopyOfArray{

	public static void main(String[] args){

		int[] arr = {30, 10, 40, 23, 89, 34};

		for(int ele : arr){
			System.out.print(ele + " ");
		}
		System.out.println();
		
		//Now we will create copy of arr
		int[] nums = arr; //it is not copy it is only reference which is looking at original array(shallow copy) means nums[0] = 70 then arr[0] also be 70

		//Now Deep Copy (We will create new Array)

		int[] arr2 = Arrays.copyOf(arr,arr.length);

		for(int ele : arr2){
			System.out.print(ele + " ");
		}

		arr2[0] = 50;

		System.out.println();
		System.out.println(arr2[0]);//50 
		System.out.println(arr[0]);//30 because arr2 it completly new array
					  
		//2nd way
		//By for loop
		int[] arr3 = new int[arr.length];

		for(int i=0;i<arr.length;i++) arr3[i] = arr[i];


	}
}
