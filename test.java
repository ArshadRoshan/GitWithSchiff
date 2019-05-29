public class test {
	public static void main (String [] args) {
		Perfect_Square perf = (int x) -> { if (Math.pow((Math.sqrt(x)),2) == x) System.out.println("yes"); else System.out.println("no");};

		perf.square(25);
	}
}