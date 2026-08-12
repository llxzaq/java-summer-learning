public class Character {

    protected String name;
    protected int hp;
    protected int attack;
    public Character(String name,int hp,int attack){
        this.name=name;
        this.hp=hp;
        this.attack=attack;
    }
    public void showInfo(){
        System.out.println(this.name+" hp"+this.hp+" attack"+this.attack);
    }

    
}