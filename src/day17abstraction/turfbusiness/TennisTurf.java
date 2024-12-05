package day17abstraction.turfbusiness;

public class TennisTurf implements Turf
{

	@Override
	public double getTurfPrice() {
		return 2000;
	}

	@Override
	public String getTurfName() {
		return "Tennis Turf";
	}

}
