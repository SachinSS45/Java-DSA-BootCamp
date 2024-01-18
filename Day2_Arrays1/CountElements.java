import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/* Count Total Number of Elements with Digit 9*/
public class CountElements{
    public static int check(List<Integer> A){
        int count = 0;
        for(int i=0;i<A.size();i++){
            String str=""+A.get(i);
            if(str.contains("9")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());
        List<Integer> A = new ArrayList<>(N);

        for(int j=0;j<N;j++){
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }
        int result = check(A);
        System.out.println(result);
    }
}
