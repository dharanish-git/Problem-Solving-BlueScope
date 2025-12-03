package general;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,3,9,4,3,5,9,8,10,10};
        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        int secondlargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<largest){
                secondlargest=arr[i];
                break;
            }
        }
        System.out.println(secondlargest);
    }
}
