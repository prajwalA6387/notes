package ENCAPSULATION;
public class p1{
    private String name;
    private int age;
    void setData(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[]args){
        p1 n=new p1();
        n.name="tommy";
        n.setData("Tommy",5);
        n.display();
     }    
  }



