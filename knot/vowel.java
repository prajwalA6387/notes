package knot;
import java.util.*;

public class vowel {
    public static void main(String[]args){
        char vel='b';
        System.out.println("Enter the charecter to check its vowel or not");
        Scanner n=new Scanner(System.in);
        if(vel=='a'||vel=='e'||vel=='i'||vel=='o'||vel=='u'){
            System.out.println("Its a vowel");
        }
        else{
            System.out.println("its not a vowel");
        }
    }
}
