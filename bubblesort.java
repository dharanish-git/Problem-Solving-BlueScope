import java.util.Arrays;
class bubblesort{
public static void main(String args[]){
int[]arr={97,56,34,76,39,67,98,30,67,11};
System.out.println(Arrays.toString(arr));
System.out.println("Sorted Array");
for(int i=0;i<arr.length-1;i++){
    for (int j=0;j<arr.length-1-i;j++){

    if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
}
}
System.out.println(Arrays.toString(arr));
}
}
