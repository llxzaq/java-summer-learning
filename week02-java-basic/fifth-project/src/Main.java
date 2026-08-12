import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
    ArrayList<Character> characters = new ArrayList<>();
    Player player1=new Player("Alice",100,20);
    Monster monster1=new Monster("asl",50,3);
    Player player2=new Player("Bob",120,30);
    Monster monster2=new Monster("viki",80,5);
    characters.add(player1);
    characters.add(monster1);
    characters.add(player2);
    characters.add(monster2);
    for(Character character:characters){
        character.attack();
    }










        
        
 
    }
}
