// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
         String word = args[0];
         word = word.toUpperCase();
         int n = Integer.parseInt(args[1]);
         int i=0;
         int length = word.length();
        
         while (i < length) {
                String letters = "AEFHILMNORSX";
                if ((letters.indexOf(word.charAt(i))) >= 0) 
                System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                else System.out.println("Give me a " + word.charAt(i) + ": " + word.charAt(i) + "!");
                i = i + 1;      
         }
         int m=0;
         System.out.println("What does that spell?");
         while (m<n) { 
                System.out.println(word + "!!!");
                m = m+1;
         }



        }
}
