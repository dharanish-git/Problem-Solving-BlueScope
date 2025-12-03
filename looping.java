package general;

public class looping {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while(i <= 5);
        System.out.println();
        for(int j = 1; j <= 5; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
        int k = 1;
        while(k <= 5) {
            System.out.print(k+" ");
            k++;
        }


    }
}
