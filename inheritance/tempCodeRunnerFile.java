import java.util.*;

class collage{
    String College;
    String Branch;
    String Section;
    void col(){
        College="PES-ITM";
        System.out.println(College);
    }
    void branch(){
        Branch="ISE";
        Section="1stA";
        System.out.println("hi lets know our branch\n");
    }
}
class branch extends collage{
    void branch(){
        Branch="CSE";
        Section="3rdB";
        System.out.println(Branch);
    }
}
class inheritence extends  collage {
    public static void main(String[]args){
        inheritence n=new inheritence();
        n.col();
        n.branch();
    }
}
