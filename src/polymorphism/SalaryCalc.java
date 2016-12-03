package polymorphism;
import java.util.*;
public class SalaryCalc {

	public static void main(String[] args) {

		
		System.out.print("Enter Hourly Salary: ");
		int x = new Scanner(System.in).nextInt();
		Salary salary = new Salary();
		int hSalary = salary.calcSalary(x);
		int wSalary = salary.calcSalary(hSalary, 40);
		
		Salary yearly = new YearSalary();
		int ySalary = yearly.calcSalary(hSalary,40);
		
		System.out.println("Hourly: " + hSalary);
		System.out.println("Weekly: " + wSalary);
		System.out.println("Yearly: " + ySalary);
		
	}

}
