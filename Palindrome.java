package general;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("No");
        }
    }
}
