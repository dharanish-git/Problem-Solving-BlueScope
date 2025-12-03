package Array;
import java.util.*;
public class TwoSumArray {
    public static void main(String[] args) {
        System.out.print("How many numbers do you want in array?: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter numbers 1 by 1: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.print("Enter a Target: ");
        int target=s.nextInt();
        Map<Integer,Integer>map=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("index "+map.get(complement)+" and "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
