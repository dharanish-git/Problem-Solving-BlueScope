package general;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Anagram Checking");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1=s.nextLine();
        System.out.print("Enter String 2: ");
        String str2=s.nextLine();
        str1.replaceAll("\\s","").toLowerCase();
        str2.replaceAll("\\s","").toLowerCase();
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            System.out.println("It is not an Anagram the length of the string doesn't match");

        }
        else if(Arrays.equals(arr1,arr2)){
            System.out.println("It is an Anagram");

        }
        else {
            System.out.println("It is not an Anagram");
        }


    }
}
