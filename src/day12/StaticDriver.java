package day12;

public class StaticDriver {
	
	static {
		System.out.println("Bye");
	}

	static Player p1=new Player();
	public static void main(String[] args) {
		System.out.println("hi");
		Player.displayStrength();
		
		System.out.println(Player.titleSponsor);
		Player.displayStrength();
		p1.acceptPlayer();
		
		Player p2=new Player(18,"Virat",5,700);
		Player.displayStrength();
		Player.displayStrength();
		
		Player p3=new Player(p2);
		Player.displayStrength();
		Player.displayStrength();
		Player.displayStrength();
	}

}
