import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Player alice = new Player("Alice", 100, 30);
        Player bob = new Player("Bob", 80, 20);

        alice.attack(bob);

        System.out.println(bob.getHp());








       
        
 
    }
}
