import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {








        ArrayList<Player> list = new ArrayList<>();
        Player p1 = new Player();
        p1.name = "Alice";
        p1.hp = 100;
        

        Player p2 = new Player();
        p2.name = "Bob";
        p2.hp = 80;
       
        Player p3 = new Player();
        p3.name = "Tom";
        p3.hp = 120;
        
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Map<String,Player> idmatch = new HashMap<>(); 
        idmatch.put("10001", p1);
        idmatch.put("10002", p2);  
        idmatch.put("10003", p3);  
        Player a=idmatch.get("10002") ; 
        a.hp-=20;
        a.showInfo();
        idmatch.remove("10003");
        
        
 
    }
}
