//Maximum value of all the elements in the array
public class Program3{

	public static void main(String[] args){
	
		int[] arr = {1,2,3,4,5};

		int max = Integer.MIN_VALUE;

		for(int ele:arr){

			if(max<ele) max = ele;
			//max1 = Math.max(max1,arr[i]);
		}

		System.out.println("Max : "+ max);
	}
}
