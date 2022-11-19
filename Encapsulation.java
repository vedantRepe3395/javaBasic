// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
//To achieve this, you must:
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

public class Encapsulation {
    public static void main(String[] args) {
        person a = new person();
        a.setName("asd");
        System.out.println(a.getName());
    }
}
class person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
