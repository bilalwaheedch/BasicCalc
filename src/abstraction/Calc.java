package abstraction;

public abstract class Calc implements Abacus{

	public void addNumbers(int x,int y){
		System.out.println(x+y);
		
	}
	
	public void subNumbers(int x,int y){
		System.out.println(x-y);
	}
	
	public void multNumbers(int x,int y){
		System.out.println(x*y);
	}

	public void divNumbers(int x,int y){
		System.out.println(x/y);
	}

}
