package general;

public class BubbleSort {
    static int[]bubbleSort(int[]arr){
        int len=arr.length-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={54,64,23,63,42,12};
        int[]sorted=BubbleSort.bubbleSort(arr);
        for (int i = 0; i <sorted.length ; i++) {
            System.out.print(sorted[i]+" ");
        }
    }
}
