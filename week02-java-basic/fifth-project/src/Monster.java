public class Monster extends Character{
    private int level;
    public Monster(String name,int hp,int level){
        super(name, hp);
        this.level=level;
    

    }
    public void roar(){
        System.out.println(this.name+" 发出怒吼！");
    }

    public void showInfo(){
         System.out.println(this.name+" hp"+this.hp+" level"+this.level);
    }
    @Override
    public void attack() {
        System.out.println("怪物发动攻击");
        
    }




}
