package polymorphism;

public class YearSalary extends Salary{
	
	public int calcSalary(int x, int y){
		int sal = x*y*52;
		return sal;
	}
	

}
