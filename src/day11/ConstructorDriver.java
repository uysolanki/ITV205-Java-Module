package day11;

public class ConstructorDriver {

	public static void main(String[] args) {
	Player p1=new Player();  //decalre	
	Player p2=new Player();  
	Player p3=new Player();  
	Player p4=new Player(); 
	Player p5=new Player(72,"Tilak",500,25000); 
	System.out.println(p5.pname);
	Player p6=new Player(p5);
	System.out.println(p5.pname);
//	System.out.println(p1);
//	System.out.println(p2);
//	System.out.println(p3);
//	System.out.println(p4);
//	System.out.println(p5);
//	System.out.println(p6);
	
	
//	p2.acceptPlayer();
//	System.out.println(p2);
	}

}
