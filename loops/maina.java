import java.util.Scanner;
abstract class shapes{
	float area;
	abstract void collect();
	abstract void caluculate();
	void display(){
		System.out.println("Area is :"+area);
	}
}
class square extends shapes{
	float side;
	@Override
	void collect() {
		System.out.println("Enter the value of sides of Square");
		Scanner n=new Scanner(System.in);
		side=n.nextFloat();
	}

	@Override
	void caluculate() {
		area=side*side;
	}
	
}
class rectangle extends shapes{
	float length;
	float bridth;
	@Override
	void collect() {
		System.out.println("enter the value of length and bridth of a rectangle");
		Scanner n=new Scanner(System.in);
		length=n.nextFloat();
		bridth=n.nextFloat();
	}

	@Override
	void caluculate() {
		area=length*bridth;
	}
	
}
class circle extends shapes{
    double r;
    @Override
    void collect() {
        System.out.println("enter the value of r for circle");
        Scanner s=new Scanner(System.in);
        r=s.nextDouble();
    }

    @Override
    void caluculate() {
        area=(float) (3.142*(r*r));
    }
    
}
class geometry{
	void permit(shapes s) {
		s.collect();
		s.caluculate();
		s.display();
	}
}
public class maina {
	public static void main(String[]args) {
		square s=new square();
		rectangle r=new rectangle();
        circle c=new circle();
		geometry g=new geometry();
		g.permit(s);
		g.permit(r);
        g.permit(c);
	}
}
