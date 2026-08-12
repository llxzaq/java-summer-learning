public class Character {

    protected String name;
    protected int hp;
    
    public Character(String name,int hp){
        this.name=name;
        this.hp=hp;
        
    }
    public void showInfo(){
        System.out.println(this.name+" hp"+this.hp+" attack"+this.attack);
    }
    protected void takeDamage(int  damage){
        this.hp-=damage;
        if(this.hp<=0){
            this.hp=0;
        }

    }
    
}