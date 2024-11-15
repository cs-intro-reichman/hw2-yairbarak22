public class Collatz {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean ver = mode.equals("v");
        boolean con = mode.equals("c");
        for (int i = 1; i <= N; i = i  +1) {
            int steps = 0;
            int current = i;
            if (ver) System.out.print(i);
            while (current != 1) {
                steps = steps  + 1;
                if (current % 2 == 0) current = current / 2; 
                else current = current * 3 + 1; 
				if (ver) System.out.print(" " + current);   
            }
            if (ver) System.out.println(" (" + steps + ")");          
        }
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        
    }
}
