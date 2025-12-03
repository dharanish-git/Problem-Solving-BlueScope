package Array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,11,22,33,44};
        Set<Integer>set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i:set){
            System.out.print(i+" ");
        }

    }
}
