public class Player {
    String name;
    int hp;
    int attack;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
    }

    void attack(Player target) {
        System.out.println(name + " 攻击 " + target.name);
        target.hp -= this.attack;
        System.out.println(target.name + " HP: " + target.hp);
    }
}
