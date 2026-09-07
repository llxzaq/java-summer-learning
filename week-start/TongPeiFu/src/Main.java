import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void priList(List<?> a){
        System.out.println(a);

    }
    public static double sum(List<? extends Number> list) {
        double total = 0;


        for (int i=0;i<list.size();i++) {
            total += list.get(i).doubleValue();
        }

        return total;
    }
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        priList(list);
    }
    public static void main(String[] args){
        List<Integer> A=new ArrayList<>();
        addIntegers(A);
        double a=sum(A);
        System.out.println(a);
        List<Number> B=new ArrayList<>();
        addIntegers(B);
        double b =sum(B);
        System.out.println(b);
        List<Double> C=new ArrayList<>();
        C.add(1.0);
        C.add(2.0);
        C.add(3.0);
        double c =sum(C);
        System.out.println(c);


    }

}
