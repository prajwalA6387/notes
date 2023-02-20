package constructor;
import java.util.*;

public class p1 {
    String name;
    String branch;
    String usn;
    String phone;
    void read(){
        int n;
        System.out.println("Enter the total number of students");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Entering the data of a new Student :");
            System.out.print("Name :");
            name=in.next();
            System.out.print("\nBranch:");
            branch=in.next();
            System.out.print("\nUSN :");
            usn=in.next();
            System.out.print("\nPhone :");
            phone=in.next();
            System.out.println("Student data inserted\n");
        }
        System.out.println("The Number of Students are :-");
        for(int i=0;i<n;i++){
            System.out.println("Student No "+i);
            System.out.println();
            System.out.println("Name : "+name+"\nBranch : "+branch+"\nUSN : "+usn+"\nPhone : "+phone);
            System.out.println();

        }
    }
    public static void main(String[]args){
        p1 n=new p1();
        n.read();
    }  
}
