public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        
    }
    public int mintake(int[] x){
        int a=x[0];
        for(int i:x){
            
            if(i<=a){
                a=i;
            }

        }

        return a;
    }
    public int[] delete(int[]arr,final int a){
        int[] m=new int[arr.length-1];
        for(int n:arr){
            switch (n) {
                case a:
                    
                    break;
            
                default:
                    break;
            }

        }

        return m;
    }
    int[] newArr=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        
        int[] i=new int[arr.length-i];
        int a=mintake(i);
        newArr[i]=a;




    }
}
