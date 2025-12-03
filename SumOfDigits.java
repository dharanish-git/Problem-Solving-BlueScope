package general;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
return n*(n+1)/2;
    }
    public static void main(String[] args) {
        System.out.print("Enter the N: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nn=sum(n);
        System.out.println(nn);
    }
}
