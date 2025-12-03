package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        System.out.print("Enter the numbers separated by spaces: " );
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<Integer>arr=new ArrayList<>();
        String[]parts=str.split(" ");
        for(String part: parts){
            arr.add(Integer.parseInt(part));
        }
        int len=arr.size()+1;
        int sum=0;
        int max= Collections.max(arr);
        int expSum=max*(max+1)/2;
        for(int i: arr){
        sum+=i;
        }
        int missing=expSum-sum;
        System.out.println("Missing Number is: "+missing);


    }
}

