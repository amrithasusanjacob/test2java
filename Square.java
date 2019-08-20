import java.util.Scanner;

public class Square extends Shape implements TwoDimensionalShapeInterface {
    
    public Square() {
		
		// TODO Auto-generated constructor stub
	}

	private int side;
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
    public void getdimension()
    {Scanner keyboard = new Scanner(System.in);
    	System.out.println(" Enter side of  square");
    	setSide(keyboard.nextInt());
    	double area=calculateArea();
    	printInfo();
    }
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
	setAr(side*side);
		return side*side;
	}

	@Override
	public void printInfo() {
		System.out.println("area of square "+getAr());
		// TODO Auto-generated method stub
		System.out.println("side of square "+getSide());
		
	}

}
