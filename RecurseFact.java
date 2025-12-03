package general;

public class RecurseFact {
    static int fact(int num){
        if(num==0||num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        int f=fact(5);
        System.out.println(f);
    }
}
