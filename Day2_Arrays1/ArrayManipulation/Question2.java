package ArrayManipulation;

import java.util.Scanner;

public class Question2 {

    public static int maxEle(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static int findSecondMax(int[] arr){
        int max = maxEle(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) arr[i] = Integer.MIN_VALUE;
        }

        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondMax)secondMax = arr[i];
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Element : "+maxEle(arr));
        System.out.println("Max Element : "+findSecondMax(arr));
    }
}
