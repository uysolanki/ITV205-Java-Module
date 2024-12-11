package day17abstraction.turfbusiness;

//@FunctionalInterface
public interface Turf {
	
	double getTurfPrice();
	String getTurfType();
	
	default String getTurfAcademy()
	{
		return "Hotfut";
	}
	
	default String getTurfAcademyLocation()
	{
		return "Baner, Pune";
	}
	
	static void display()
	{
		System.out.println("Test");
	}
	
}
