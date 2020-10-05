/** find the pythagoream solution of x = 3 and y = 4*/
public class Pythagoream {
     
     
	public static void main(String[] args) {
		Pythagoream p = new Pythagoream();
		p.result();
		

	}
	private void result() {
		double x = 3;
	     double y = 4;
	     double result;
	     x = Math.sqrt(x);
	     y = Math.sqrt(y);
	     result = x + y;
	     System.out.println("The pythagoream is = " +result );
	}

}
