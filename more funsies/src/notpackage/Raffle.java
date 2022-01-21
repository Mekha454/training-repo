package notpackage;

public class Raffle {

	static String[] winners = {"bob", "jack", "alice", "cathy", "tim"};
	
	static int lo = 0;
	static int hi = 4;
	
	static int pick = (int)(Math.random() * (hi - lo + 1));
	
	public static void main(String[] args) {
		System.out.println(winners[pick]);
	
	}
			
	
}
