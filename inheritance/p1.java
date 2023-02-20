class a{
    String name , cls;
    void student(){
        name="Prajwal";
        System.out.println(name);
    }
    void classroom(){
        cls="b section";
        System.out.println(cls);
    }
}
public class p1  extends a{
    void student(){
        name="Sanath";
        System.out.println(name);
    }
    public static void main(String[] args){
        p1 o=new p1();
        o.student();
        o.classroom();
    }
    
}
