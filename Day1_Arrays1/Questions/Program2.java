//Sum of all elements of array

class Program2{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5};

		int sum = 0;
		for(int i:arr) sum+=i;
		System.out.println("Sum = " + sum);//15
	}
}
