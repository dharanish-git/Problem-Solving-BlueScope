package general;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type something (Ctrl+D or Ctrl+Z to stop):");

        while (sc.hasNext()) {
            String word = sc.next();
            System.out.println("You typed: " + word);
        }

        System.out.println("No more input — loop ended!");
        sc.close();
    }
}
