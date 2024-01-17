//How we can pass array to method
//call by reference (int ,double are pass by value)
class Demo{

	public static void change(int[] arr){

		arr[0] = 5;
	}
	public static void main(String[] args){

		int[] arr = {10,20,30,40};
		System.out.println(arr[0]);//10

		change(arr);
		System.out.println(arr[0]);//5

	}
}

