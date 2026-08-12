import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        
    
        
        
        
        int[] newArr=new int[arr.length];
        int[] remaining=arr;
        for(int i=0;i<arr.length;i++){
           
            
            
            
            int a=mintake(remaining);
            remaining=delete(remaining, a);
            newArr[i]=a;
            



        }
        System.out.println(Arrays.toString(newArr));
    
    }

    public static int mintake(int[] x){
            int a=x[0];
            for(int i:x){
            
                if(i<=a){
                    a=i;
                }

            }

            return a;
        }
        public static int[] delete(int[]arr,int a){
            int[] m=new int[arr.length-1];
            int tag=0;
            for(int i=0;i<m.length;i++){
                
                if(arr[i]==a){
                    tag=1;
                }
                if(tag==0){
                    m[i]=arr[i];
                }
                if(tag==1){
                    m[i]=arr[i+1];
                }                
                
            }

            return m;



        }
}