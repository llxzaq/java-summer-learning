import java.util.ArrayList;



public class Contact {
    private int id;
    private int phone;
    private int age;
    private String name;
    public Contact(int id,int phone,int age,String name){
        this.id=id;
        this.phone=phone;
        this.age=age;
        this.name=name;
    }
    @Override 
    public String toString(){
        return "name:"+name+"id:"+id+"phone:"+phone+"age:"+age;
    }
    public int getId() {
        return id;
    }
    public int getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    


























}
