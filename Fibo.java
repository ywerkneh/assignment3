
import java.util.Scanner;

public class Fibo {
	int[] members;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter numbers to compute Fibonacci");
		int count = scan.nextInt();
		// allocate memory for the members array members[count-1];
		Fibo fib = new Fibo();
		fib.members = new int[count - 1];
		fib.members[0] = 1;
		fib.members[1] = 1;
		System.out.println("Fibonacci sequence term ");
		System.out.print(fib.members[0] + " " + fib.members[1] + " ");
		for (int i = 2; i < fib.members.length; i++) {
			fib.members[i] = fib.members[i - 1] + fib.members[i - 2];
			System.out.print(" " + fib.members[i]);
		}
	}
}