import java.util.Scanner;

public class Triangle extends Shape implements TwoDimensionalShapeInterface {

	public Triangle() {
		super("blue");
		// TODO Auto-generated constructor stub
	}

	private int base;
	private int height;
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	  public void getdimensions()
	    {Scanner keyboard = new Scanner(System.in);
	    	System.out.println(" Enter base of triangle");
	    	setBase(keyboard.nextInt());
	    	System.out.println(" Enter height of triangle");
	    	setHeight(keyboard.nextInt());
	    	double area= calculateArea();
	    	printInfo();
	    }
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		setAr(0.5*base*height);
		return 0;
	}

	@Override
	public void printInfo() {
		
		System.out.println("area of triangle "+getAr());
		// TODO Auto-generated method stub
		System.out.println("base of triangle "+getBase());
		System.out.println("height of triangle "+getHeight());
		System.out.println("color of triangle "+getColor());
		
	}

}
