import java.util.Arrays;
public class Program1{

	public static void main(String[] args){
		
		//Basic Syntax of Array
		//DataType[] arrayName = new DataType[size];

		int[] arr = new int[6];

		//intialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;

		//Printing the element of array
		System.out.println(arr[0]);//10

		//Updating value of array
		arr[0] = 70;
		System.out.println(arr[0]);//70
		
		
		//Declare + Intialize At a time
		int[] arr2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5]
	}
}

