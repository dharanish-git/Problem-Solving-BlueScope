package pattern_printing;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.print("Enter the value of N: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i <n ; i++) {
   for(int j=0;j<n;j++){
       System.out.print("* ");
   }
            System.out.println();
        }

    }
}
