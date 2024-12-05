package day17abstraction.turfbusiness;

public class FootballTurf implements Turf
{

	@Override
	public double getTurfPrice() {
		return 1000;
	}

	@Override
	public String getTurfName() {
		return "Football Turf";
	}

}
