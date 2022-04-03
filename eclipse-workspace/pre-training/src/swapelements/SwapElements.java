package swapelements;

public class SwapElements {

	public static void main(String[] args) {
		int[] elements = {1,2,3,4,5};
		
		int temp = elements[0];
		
		elements[0] = elements[elements.length-1];
		elements[elements.length-1] = temp;
		
		for (int i=0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}
