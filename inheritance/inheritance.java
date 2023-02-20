class college{
    String a,b;
    void clg(){
        a="PESITM";
        System.out.println(a);
    }
    void branch(){
        b="ISE";
        System.out.println(b);
    }
}
class inheritance extends college{
    void branch(){
        b="CSE";
        System.out.println(b);
    }
    public static void main(String[]args){
        inheritance n=new inheritance();
        n.clg();
        n.branch();
    }
}
