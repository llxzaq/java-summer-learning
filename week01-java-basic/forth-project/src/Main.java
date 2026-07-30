public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Alice";
        p1.hp = 100;
        p1.attack = 10;

        Player p2 = new Player();
        p2.name = "Bob";
        p2.hp = 100;
        p2.attack = 10;

        p1.attack(p2);
        p2.attack(p1);

        System.out.println("最终角色信息：");
        p1.showInfo();
        p2.showInfo();
    }
}
