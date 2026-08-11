
public class Player {
    private String name;
    private int hp;
    private int attack;
    public Player(String name,int hp,int attack){
        this.name=name;
        this.hp=hp;
        this.attack=attack;

    }
    public String getName(){
        return name;

    }
    public int getHp(){
        return hp;

    }
    public int getAttack(){
        return attack;
    }
    public void takeDamage(int damage){
        this.hp-=damage;
        if(this.hp<0){
            this.hp=0;
        }

    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
    }

    void attack(Player target) {
        target.takeDamage(this.getAttack()  );

        
        
    }
}
