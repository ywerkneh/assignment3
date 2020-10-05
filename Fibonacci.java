public class Fibonacci{

	public void run() {
	System.out.println("This program list the Fibonacci sequence");
		int t1 = 0;
		int t2 = 1;
		while (t1 <= MAX_TERM_VALUE) {
			System.out.println(t1);

			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;

		}

	}

	private void println(int t1) {
		

	}

	private void println(String string) {
		

	}

	private static final int MAX_TERM_VALUE = 10000;

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		f.run();
	}
}
