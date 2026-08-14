public class Main {
    public static void main(String[] args){
        int n=9;
        int a=1;
        int b=2;
        for(int i=1;i<n;i++){
            
            b=a+b;
            a=b-a;

        }
        System.out.println(a);

    }
}
