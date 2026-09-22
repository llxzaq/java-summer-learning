import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contact=new  ArrayList<>();
        newPerson(contact, 1, 1001, 17, "wb");
        newPerson(contact, 2, 1002, 22, "lwk");
        newPerson(contact, 3, 1003, 19, "smy");
        newPerson(contact, 4, 1004, 20, "zhm");
        newPerson(contact, 5, 1005, 25, "tzy");
        AgeComparator ageComparator=new AgeComparator();
        contact.sort(ageComparator);
        for(Contact x:contact){
            System.out.println(x.toString());
        }
        Contact first=idSeek(contact, 1);
        System.out.println(first.toString());
        Contact second=phoneChange(contact, 1, 1005);
        System.out.println(second.toString());
        idDelete(contact, 2);
        NameComparator nameComparator=new NameComparator();
        contact.sort(nameComparator);
        for(Contact x:contact){
            System.out.println(x.toString());
        }       
    }
    public static Contact idSeek(ArrayList<Contact> contacts, int id) {
        int num=0;
        int t=-1;
        if(contacts.size()==0){
            System.out.println("空列表");
            return null;
        }            
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getId()==id){
                num+=1;
                t=i;
            }                
        }
        if(num==1){
            return contacts.get(t);
        }
        if(num>=2){
            System.out.println("id重复");
            return null;
        }
        System.out.println("查询不到该id");
        return null;
    }
    public static Contact phoneChange(ArrayList<Contact> contacts, int id,int phone) {
        if(contacts.size()==0){
            System.out.println("空列表");
            return null;
        }
        int num=0;
        int t=-1;   
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getId()==id){
                num+=1;
                t=i;
            }                
        }
        if(num==1){
            Contact a=new Contact(contacts.get(t).getId(),phone,contacts.get(t).getAge(),contacts.get(t).getName());
            contacts.set(t, a);
            return a;
        }
        if(num>=2){
            System.out.println("id重复");
            return null;
        }   
        System.out.println("查询不到该id");
        return null;
    }
    public static void idDelete(ArrayList<Contact> contacts, int id) {
        if(contacts.size()==0){
            System.out.println("空列表");
            return;
        }    
        Iterator<Contact> iterator=contacts.iterator();
        while(iterator.hasNext()){
            Contact contact=iterator.next();
            if(contact.getId()==id){
                iterator.remove();
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("查询不到该id");         
    }
    public static class AgeComparator implements Comparator<Contact> {
        @Override
        public int compare(Contact c1, Contact c2) {
            return Integer.compare(c1.getAge(), c2.getAge());
        }
    }
    public static class NameComparator implements Comparator<Contact> {
        @Override
        public int compare(Contact c1, Contact c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }
    public static void newPerson(ArrayList<Contact> contacts,int id,int phone,int age,String name){
        int num=0;
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getId()==id){
                System.out.println("id重复");
                num+=1;
            }                
        }
        if(num==0){
            Contact a=new Contact(id, phone, age, name);
            contacts.add(a);
        }
    }
}
