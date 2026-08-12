
public class Player extends Character{
    Player(String name,int hp,int attack){
        super(name, hp, attack);
    }
    

    void attack(Character target) {
        System.out.println(name + " 攻击 " + target.name);
        target.hp -= this.attack;
        System.out.println(target.name + " HP: " + target.hp);
    }
}
