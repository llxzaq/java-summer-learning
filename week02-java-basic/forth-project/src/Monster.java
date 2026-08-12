public class Monster extends Character{
    protected int level;
    public Monster(String name,int hp,int attack,int level){
        super(name, hp, attack);
        this.level=level;
    

    }
    public void roar(){
        System.out.println(this.name+"发出怒吼");
    }

    public void showInfo(){
         System.out.println(this.name+" hp"+this.hp+" attack"+this.attack+" level"+this.level);
    }





}
