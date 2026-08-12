
public class Main {
    public static void main(String[] args) {
        Player player=new Player("Knight",120, 30);
        Monster monster=new Monster("Goblin", 80,  2);
        player.showInfo();
        monster.showInfo();
        player.attack(monster);
        monster.roar();
        System.out.println(monster.hp);











        
        
 
    }
}
