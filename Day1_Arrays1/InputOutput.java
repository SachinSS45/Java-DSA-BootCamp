import java.util.Scanner;
public class InputOutput{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		//Creating array
		int[] arr = new int[5];

		System.out.println("Enter the elements of Array : ");
		
		//Talking input from User
		for(int i = 0; i< arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println();//for new Line 
		//Printing the element by using for loop
		
		System.out.println("Elements in array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		//We can Array size as a Input also
		
		int size = sc.nextInt();
		int[] arr2 = new int[size];
	}
}
