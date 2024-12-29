package abstraction;

public class AbstractionEgChild extends AbstractionEg {

	
	
	public static void main(String[] args) {
		
		AbstractionEgChild obj= new AbstractionEgChild();
		obj.display();
		obj.display2();

	}

	@Override
	public void display2() {
		
		System.out.println("Abstract method body");
		
	}

	@Override
	public void show() {
		System.out.println("Abstract method");
		
	}

}
