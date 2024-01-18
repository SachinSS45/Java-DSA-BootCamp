import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MaxDiffBetMaxAndSecMax {
    public static int maxDiffrence(int N, List<Integer> A) {
        if(A.size()==1) return -1;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        boolean flag = true;
        for (int i = 0; i < N-1 ; i++) {
            if(!Objects.equals(A.get(i), A.get(i + 1))){
                flag = false;break;
            }
        }
        if(flag) return 0;
        for(int i=0;i<N;i++){
            if(A.get(i) > max1){
                max1 = A.get(i);
            }
            if(A.get(i) < max1 && A.get(i)>max2){
                max2 = A.get(i);
            }
        }
        if(max1==max2) return 0;

        return max1-max2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());
        List<Integer> A = new ArrayList<>(N);

        for(int j=0;j<N;j++){
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }
        int result = maxDiffrence(N,A);
        System.out.println(result);
    }


}
