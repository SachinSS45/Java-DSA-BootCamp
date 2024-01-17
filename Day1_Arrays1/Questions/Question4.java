//Find Maximum in Array

public class Question4{

	public static void main(String[] args){
	
		int[] arr = {10,20,30,70,12,45,67,-23,-232};

		int max1 = arr[0];

		int n = arr.length;

		for(int i=1;i<n;i++){
			if(arr[i]>max1) max1 = arr[i];
		}
		System.out.println("Max : "+max1);

		//2nd Way
		int max2 = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){

			if(arr[i]>max2) max2 = arr[i];// max2 = Math.max(max2,arr[i])
		}

		System.out.println(max2);
	}
}
