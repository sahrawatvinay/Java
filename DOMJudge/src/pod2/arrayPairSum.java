package pod2;
import java.util.*;
public class arrayPairSum {
    static int getPairSumResult(int[] arr){
        int nSum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i += 2 ){
            nSum += Math.min(arr[i], arr[i+1]);
        }
        return nSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nSize = sc.nextInt();
        int[] nArr = new int[nSize];
        for(int i=0; i<nSize; i++){
            nArr[i] = sc.nextInt();
        }
        int nResult = getPairSumResult(nArr);
        System.out.println("max_sum: " + nResult);
        sc.close();
    }
}