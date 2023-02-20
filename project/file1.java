package project;
import java.util.*;
public class file1 {
    void Product(){
        String p1="Caluclator";
        String p2="laptop";
        String p3="Desktop";
        Scanner in=new Scanner(System.in);
        int pr1=301,pr2=30001,pr3=70001,tax;
        int s1,s2,s3,total,cost,finPrize;
        int n;
        int i;
        System.out.println("Enter 1 if you want to purchase any item\n");
        n=in.nextInt();
        if(n==1){
            System.out.println("Enter 1 if you want "+p1);
            i=in.nextInt();
            if(i==1){
                System.out.println("you selected the"+p1);
                s1=pr1;
            }
            else{
                s1=0;
            }
            System.out.println("Enter 1 if you want "+p2);
            i=in.nextInt();
            if(i==1){
                System.out.println("you selected the"+p2);
                s2=pr2;
            }
            else{
                s2=0;
            }
            System.out.println("Enter 1 if you want "+p3);
            i=in.nextInt();
            if(i==1){
                System.out.println("you selected the"+p3);
                s3=pr3;
            }
            else{
                s3=0;
            }
            total=s1+s2+s3;
            tax=total/10;
            cost=total+tax;
            System.out.println("the final prize of the selected after including all taxes are :"+cost);
            if(cost>0){
                System.out.println("Thanks for shopping with us\n");
            }
            else{
                System.out.println("Thanks for visiting our shop\n");
            }        }
        else{
           System.out.println("thanks for Visiting\n");
        }
    }
}