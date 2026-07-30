public class App {
    public static void main(String[] args) throws Exception {
        int target=7;
        int i=1;
        int j=1;
        int count=1;
        for (;count<target;count++){
            int k=i+j;
            j=i;
            i=k;
        } 
        System.out.println(j);
    }
}
