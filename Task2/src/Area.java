import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		
		// Creating object
		var a = new Scanner(System.in);
		System.out.println("Enter length:");
		int length=a.nextInt();
		System.out.println("Enter Breadth:");
		var b = new Scanner(System.in);
		int breadth=b.nextInt();
	    System.out.println("Area:"+getArea(length,breadth));
	}
	
	//creating method to calculate Area of rectangle
	public static int getArea(int a , int b ) {
			       int area = a*b;
			       return area;
	}
	

}
