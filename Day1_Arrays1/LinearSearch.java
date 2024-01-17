//LinearSearch
import java.util.Scanner;
public class LinearSearch{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter target element : ");

		int num = sc.nextInt();

		System.out.println("Enter array size : ");

		int n = sc.nextInt();

		System.out.println("Enter array elements : ");

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		//for Searching
		for(int i:arr){
			if(i==num){ flag =true; break;}
		}
		
		if(flag) System.out.println("Present");
		else System.out.println("Not Present");

	}
}
