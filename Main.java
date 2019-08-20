//AMRITHA SUSAN JACOB C0753813
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		ArrayList<Shape> list=new ArrayList<Shape>();
		Square obj1= new Square();
		Triangle obj2 = new Triangle();
		while (choice != 3) {
			// 1. show the menu
			showMenu();
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			// 3. DEBUG: Output what the user typed in 
			System.out.println("You entered: " + choice);
			System.out.println();
			if(choice==1)
			{
				obj1.getdimension();
			}
			else if(choice==2)
			{
				obj2.getdimension();
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

}
