package PoCodingChallenges.Feb28;


public class TriangleNumber{

    int numFactors;
    int num = 1;
    int iterate = 1;

    public static void main(String[] args) {
        TriangleNumber t = new TriangleNumber();
        t.findFactors();

    }

    public void findFactors() {
        while (numFactors < 500) {
            numFactors = 0;
            for (int i = 1; i < (int) Math.sqrt(num); i++) {
                if ((num % i) == 0) {
                    numFactors += 2;
                }
            }
            iterate += 1;
            num += iterate;
        }
        System.out.println(num);
    }








}