package encapsulation;

public class TestStudentDB {

	public static void main(String[] args) {

		Student st1 = new Student();
			st1.setfName("John");
			st1.setlName("Doe");
			st1.setStudentID(101);
			st1.setEmail("jdoe@encapsulation.com");
			
		Student st2 = new Student();
			st2.setfName("Alex");
			st2.setlName("Wattson");
			st2.setStudentID(102);
			st2.setEmail("awattson@encapsulation.com");
			
		System.out.println("Student ID: "+ st1.getStudentID());
		System.out.println("Name: "+ st1.getfName() + " " + st1.getlName());
		System.out.println("Email: " + st1.getEmail());
		
		System.out.println();
		
		System.out.println("Student ID: "+ st2.getStudentID());
		System.out.println("Name: "+ st2.getfName() + " " + st2.getlName());
		System.out.println("Email: " + st2.getEmail());
		
	}

}
