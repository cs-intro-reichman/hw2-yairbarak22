// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // get n, var pi/4
		int n = Integer.parseInt(args[0]);
		double pi = Math.PI;
		int i = 0;
		double sumpi = 1.0-(1.0/3.0);
		int divisor = 5;
		boolean action = true;
		while(i < n) {
			if (action) sumpi = sumpi + (1.0/divisor);
			else sumpi = sumpi - (1.0/divisor);
			action = !action;
			divisor = divisor + 2;
			i=i+1;
			
		}
		sumpi = sumpi * 4.0;
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + sumpi);
		
	}
}
