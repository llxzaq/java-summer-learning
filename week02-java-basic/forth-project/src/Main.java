
public class Main {
    public static void main(String[] args) {
        Player player=new Player("Knight",120, 30);
        Monster monster=new Monster("Goblin", 80, 0, 2);
        player.showInfo();
        monster.showInfo();
        player.attack(monster);
        System.out.println(monster.hp);











        
        
 
    }
}
