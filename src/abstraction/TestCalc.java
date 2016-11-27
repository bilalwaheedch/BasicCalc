package abstraction;
import java.util.*;
public class TestCalc {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		System.out.print("Enter First Number: ");
		int x = new Scanner(System.in).nextInt();
		System.out.print("Enter Second Number: ");
		int y = new Scanner(System.in).nextInt();
		
		Abacus abacus = new DeskComp();
		System.out.print(x + "+" + y + "=");
		abacus.addNumbers(x,y);
		System.out.print(x + "-" + y + "=");
		abacus.subNumbers(x,y);
		
		Calc calc = new DeskComp();
		System.out.print(x + "x" + y + "=");
		calc.multNumbers(x,y);
		System.out.print(x + "/" + y + "=");
		calc.divNumbers(x,y);
		
		DeskComp deskcomp = new DeskComp();
		deskcomp.sqRoot();
		deskcomp.exponen();
	}
	
}
