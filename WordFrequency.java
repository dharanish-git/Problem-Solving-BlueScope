package string_manipulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().toLowerCase();
        s.close();
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String st: str.split(" ")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            System.out.println("The word \""+entry.getKey()+"\" occurs "+entry.getValue()+" time");
        }
    }
}
