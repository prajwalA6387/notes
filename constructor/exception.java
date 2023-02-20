import java.util.*;
class exception{
    void div(int a,int b){
        int c;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("cannot be dividable\n");
        }
        if(b!=0){
            c=a/b;
            System.out.println("Can be Dividable");
            System.out.println(c);
        }
    }
    public static void main(String[]args)
    {
        int a,b;
        Scanner n=new Scanner(System.in);
        System.out.println("enter any two numbers");
        a=n.nextInt();
        b=n.nextInt();
        exception s=new exception();
        s.div(a,b);
    }
}