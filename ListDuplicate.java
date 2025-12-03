package general;

import java.util.*;

public class ListDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);// [1, 2, 3, 4, 5]
    }
}
