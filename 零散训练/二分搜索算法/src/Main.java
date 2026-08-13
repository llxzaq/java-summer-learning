import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target);
            }
        }
        
    }
}
