
public class Square extends Shape implements TwoDimensionalShapeInterface {

    public Square(int choice) {
		super();
		// TODO Auto-generated constructor stub
	}

	private int side;
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
	double ar = side*side;
		return 0;
	}

	@Override
	public void printInfo() {
		System.out.println("area of square");
		// TODO Auto-generated method stub
		
	}

}
