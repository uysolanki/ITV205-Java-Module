package day17abstraction.turfbusiness;

public class CricketTurf implements Turf
{

	@Override
	public double getTurfPrice() {
		return 1500;
	}

	@Override
	public String getTurfType() {
		return "Cricket Turf";
	}

	
}
