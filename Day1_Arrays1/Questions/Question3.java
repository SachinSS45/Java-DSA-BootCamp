package Questions;

import java.util.Scanner;

//Linear Search
public class Question3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");

		int size = sc.nextInt();

		int[] arr = new int[size];
		
		System.out.println("Enter the elements for array : ");
		
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search : ");
		int searchEle = sc.nextInt();


		boolean flag = false;

		for(int i=0; i<arr.length; i++){

			if(searchEle == arr[i]){
				
				flag = true;
				break;
			}
		}

		if(flag) System.out.println("found");
		else System.out.println("Not Found");
	}
}
