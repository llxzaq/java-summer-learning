import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<>();
        Player p1 = new Player();
        p1.name = "Alice";
        p1.hp = 100;
        p1.attack = 20;

        Player p2 = new Player();
        p2.name = "Bob";
        p2.hp = 90;
        p2.attack = 25;

        Player p3 = new Player();
        p3.name = "Tom";
        p3.hp = 120;
        p3.attack = 18;


        
        list.add(p1);
        list.add(p2);
        list.add(p3);

        
        for(Player one : list){
            one.showInfo();
        }
        for(int one=0; one<list.size(); one++){
            if(list.get(one).name.equals("Bob")){
                list.remove(list.get(one));
                break;
            }
        }
        System.out.println("最终角色信息：");
        for(Player one : list){
            one.showInfo();
        }
 
    }
}
