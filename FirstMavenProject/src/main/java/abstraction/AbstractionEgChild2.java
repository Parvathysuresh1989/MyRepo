package abstraction;

public class AbstractionEgChild2 extends AbstractionEg2 {
	
	
	

	public static void main(String[] args) {
		
		AbstractionEgChild2 obj=new AbstractionEgChild2();
		obj.show();
		obj.disp();
	}

	@Override
	public void disp() {
		
		System.out.println("Abstraction method 2");
		
	}

}
