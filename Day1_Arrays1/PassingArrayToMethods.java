//How we can pass array to method
//call by reference (int ,double are pass by value)
class Demo{

	public static void change(int[] arr){//here we are not creating new array it is also looking/referencing towards 100 address

		arr[0] = 5;
	}
	public static void main(String[] args){

		int[] arr = {10,20,30,40}; //  arr[100] ----------->[100,104,108,112};//addresses example
		System.out.println(arr[0]);//10

		change(arr);//we are passing reference of array
		System.out.println(arr[0]);//5

	}
}

