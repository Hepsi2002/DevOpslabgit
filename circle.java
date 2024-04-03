//To find area and circumference of a circle
import java.util.*;
class circle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r;
		double p=3.14;
		System.out.println("Enter radius of the circle");
		
		r=sc.nextInt();
		System.out.print("Area of the circle: " +(p*r*r));
		System.out.print("\nCircumference of the circle: "+(2*p*r));
	}
}

		
