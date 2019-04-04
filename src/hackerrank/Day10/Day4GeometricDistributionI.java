package hackerrank.Day10;

public class Day4GeometricDistributionI {

	public static final double pd = 1 / 3.0;
	public static final double pnd = 1 - pd;
	public static final int item = 5;

	public static void main(String[] args) {
		System.out.printf("%.3f", (Math.pow(pnd, item - 1) * pd));
	}

}
