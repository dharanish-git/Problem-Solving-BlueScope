package general;

import java.util.Arrays;
import java.util.Scanner;

public class Char {

    public static void main(String[] args) {

        System.out.print("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       String[]ss=str.split(" ");
        System.out.println(Arrays.toString(ss));
    }

}
