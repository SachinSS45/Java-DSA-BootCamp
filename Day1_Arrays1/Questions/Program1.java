/*Q.1 Given an array of elements of marks of students ,if the mark of any student is less than 35 print it's roll  number.[roll number here refer to the index of the array]
 */

class Program1{

	public static void main(String[] args){

		int[] arr = {81,45,67,100,12,34,56,24};

		//for loop
		for(int i=0;i<arr.length;i++){

			if(arr[i]<35) System.out.println(i);//condition 
		}
		//Output : 4 5 7
	}
}
