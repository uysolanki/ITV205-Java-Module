package day12;

public class DriverApp {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.displayEmployee();
		System.out.println("-------------------");
		Employee e2=new Employee(444455556666L,"Ben",8089808990L,"Delhi",102,"Clerk",200);
		e2.displayEmployee();
	}

}
