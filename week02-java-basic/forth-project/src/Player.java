
public class Player extends Character{
    private int attack;
    Player(String name,int hp,int attack){
        super(name, hp);
        this.attack=attack;
    }
    

    void attack(Character target) {
        System.out.println(name + " 攻击 " + target.name);
        target.takeDamage(this.attack);
        System.out.println(target.name + " HP: " + target.hp);
    }
}
