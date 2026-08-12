
public class Player extends Character{
    private int attack;
    Player(String name,int hp,int attack){
        super(name, hp);
        this.attack=attack;
    }
    
    @Override
    public void attack() {
        System.out.println("玩家挥剑攻击");
        
    }
}
