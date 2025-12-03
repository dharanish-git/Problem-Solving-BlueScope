        package general;

        import java.util.*;

        public class second_largest
        {
            public static void main(String[] args) {

                Integer[]arr={2,3,5,3,54,3,54,6,45,46,87};
                Set<Integer>set=new TreeSet<>(Arrays.asList(arr));
                List<Integer>list=new ArrayList<>(set);
                System.out.println(list.get(list.size()-2));




            }
        }
