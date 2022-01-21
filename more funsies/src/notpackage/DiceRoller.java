package notpackage;

public class DiceRoller {

	public static void main(String[] args) {
		
		System.out.println(rollAD6());
	}

	public static int rollAD6() {
		
		int one = 1;
		int six = 6;
		
		int d6 = (int)(Math.random() *(six - one + 1));
		
				
		return d6;
	}
}
