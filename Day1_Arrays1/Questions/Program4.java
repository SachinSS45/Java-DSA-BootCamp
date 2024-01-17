//Find the second largest element in the array

public class Program4{

	public static void main(String[] args){

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		int[] arr = {0,3,2,5,5};

		for(int i=0;i<arr.length;i++){

			if(arr[i]>max1){
				max1 = arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max1) max2 = Math.max(max2,arr[i]);
		}
		System.out.println("Second Max : "+max2);
	}
}
