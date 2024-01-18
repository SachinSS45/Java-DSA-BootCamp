//Learning Basics about ArrayList
/*
 * ArrayList : 
 *    1)why? - Because Array size is fixed size we can't change at runtime i.e why We use dynamic Arrays i.e ArrayList
 *    		for ex our array is full and you want to add one ele then it will make size double of new array and paste elements in this ArrayList
 *    2)ArrayList Doesn't give default value like Array
 *    3)ArrayList Can Grow Dynamically
 *   
 */
import java.util.ArrayList;
class Demo3{

	public static void main(String[] args){
		
		int[] arr = {1, 2, 3};
		ArrayList<Integer> list = new ArrayList<>(6);//We are intializing list with 6 size
		
		list.add(0,10);// arr[0] = 10
		list.add(1,20);//if I comment this line it will give me Exception i.e ArrayIndexOutOfBoundException 
		list.add(2,30);
		list.add(3,40);
		list.add(4,50);//initialise
		list.add(5,60);
		
		//For printing list

		System.out.println(list.get(0));//arr[0] //10
		for(int i=0;i<=5;i++){
			System.out.print(list.get(i)+" ");// arr[i]
		}

		System.out.println();
		list.set(2,300);//modify
		System.out.println(list);//[10, 20, 300, 40, 50, 60]
		
		//for finding the size of list
		System.out.println(list.size());//6

		list.add(90);//it will be added from last
		System.out.println(list.size());//7


	}
}
