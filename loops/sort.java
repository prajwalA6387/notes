package learning;
import java.util.*;
public class sort {
    ArrayList<String> ad=new ArrayList<String>();
    public void insert()
    {
        String element;
        Scanner in=new Scanner(System.in);
        System.out.println("Eneter the Number of element");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the new element\n");
            element=in.next();
            ad.add(element);
        }
        System.out.println(ad);  
    }
    public void insertatpos()
    {
        String element;
        int pos;
        Scanner in=new Scanner(System.in);
        System.out.println("eneter the position of the to be inserted\n");
        pos=in.nextInt();
        System.out.println("Enter that new element that u desiires to be insert\n");
        element=in.next();
        ad.add(pos,element);
        System.out.println(ad);        
    }
    public void search()
    {
        int pos;
        String element;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the element that you want to Search\n");
        element=in.next();
        pos=ad.indexOf(element);
        if(pos==-1)
        {
            System.out.println("element not found\n");
        }
        else{
            System.out.println("element found at");
            System.out.println(pos);
        }
    }
    public static void main(String[] args)
    {
        sort s=new sort();
        s.insert();
        s.insertatpos();
        s.search();
    }
}