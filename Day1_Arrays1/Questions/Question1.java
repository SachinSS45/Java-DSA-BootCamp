//Given an array of marks of students,if the mark of any student is less than 35 marks print it's roll number(index)

public class Question1{

	public static void main(String[] args){
	
		int[] arr = new int[]{81,45,67,100,12,34,56,24};

		for(int i=0; i<arr.length; i++){
			if(arr[i] <35) System.out.print(i+" ");//4 5 7 
		}

	}
}
