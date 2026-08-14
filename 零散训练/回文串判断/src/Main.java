import java.util.Scanner; 


public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一串字母 ");
        String huiwen=input.nextLine();
        int tag=1;
        for(int i=0;i<huiwen.length();i++){
            String lf=huiwen.substring(i, i+1);
            String ri=huiwen.substring(huiwen.length()-1-i, huiwen.length()-i);
            if(!lf.equals(ri)){
                tag=0;

            }

        }
        if (tag==0){
            System.out.println(huiwen+"不是回文串");
        }
        if (tag==1){
            System.out.println(huiwen+"是回文串");
        }

    }
}
