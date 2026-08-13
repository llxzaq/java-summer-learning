public class Main {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        int lclick=0;
        int rclick=arr.length-1;
        int tag=-1;
        
        
        for(int i=1;i<arr.length;i*=2){
            
            if((lclick+rclick)%2==0){
                int t=(lclick+rclick)/2;
                if(arr[t]>target){
                    rclick=t;
                }
                if(arr[t]<target){
                    lclick=t;
                }
                if(arr[t]==target){
                    tag=t;
                    break;
                }
            }
            if((lclick+rclick)%2==1){
                int t=(lclick+rclick+1)/2;
                if(arr[t]>target){
                    rclick=t;
                }
                if(arr[t]<target){
                    lclick=t;
                }
                if(arr[t]==target){
                    tag=t;
                    break;
                }
            }
        }
        
        System.err.println(tag);
        
    }
}
