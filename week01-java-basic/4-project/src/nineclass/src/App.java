public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                if(i>j){
                    System.out.print(i+"*"+j+"="+result+" ");
                }
                else if(i==j){
                    System.out.println(i+"*"+j+"="+result+" ");
                }
                else{
                    continue;
                }
            }
            System.out.println();               
        }
    }
}
