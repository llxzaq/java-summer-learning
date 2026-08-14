import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=scanner.nextInt();
        scanner.close();
        int a=1;
        
        for(int i=1;i<n;i++){
            a=2*a+1;


        }
        System.out.println("最少次数为："+a);
        System.out.println("具体步骤为：");
        theWayAC(n);
    }
    public static void theWayAC(int n){
        if(n>=2){
            theWayAB(n-1);
            System.out.println("A->C");
            theWayBC(n-1);
        }
        if(n==1){
            System.out.println("A->C");
        }
    }
    public static void theWayAB(int n){
        if(n>=2){
            theWayAC(n-1);
            System.out.println("A->B");
            theWayCB(n-1);
        }
        if(n==1){
            System.out.println("A->B");
        }
    }
    public static void theWayBC(int n){
        if(n>=2){
            theWayBA(n-1);
            System.out.println("B->C");
            theWayAC(n-1);
        }
        if(n==1){
            System.out.println("B->C");
        }

        
            
    }
    public static void theWayCA(int n){
        if(n>=2){

            theWayCB(n-1);
            System.out.println("C->A");
            theWayBA(n-1);
        }
        if(n==1){
            System.out.println("C->A");
        }

    }
    public static void theWayBA(int n){
        if(n>=2){

            theWayBC(n-1);
            System.out.println("B->A");
            theWayCA(n-1);
        }
        if(n==1){
            System.out.println("B->A");
        }

    }
    public static void theWayCB(int n){
        if(n>=2){

            theWayCA(n-1);
            System.out.println("C->B");
            theWayAB(n-1);
        }
        if(n==1){
            System.out.println("C->B");
        }

    
    }
}
