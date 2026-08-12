import java.util.Arrays;

public class Maopao {
    public static void main(String[] args){
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        for(int i=0;i<arr.length;i++){
            for(int t=0;t<arr.length-1;t++){
                if(arr[t]>arr[t+1]){
                    int temp=arr[t+1];
                    arr[t+1]=arr[t];
                    arr[t]=temp;


                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    
}
