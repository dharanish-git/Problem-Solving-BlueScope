package pattern_printing;

import java.util.Scanner;

public class right_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the value of N: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
