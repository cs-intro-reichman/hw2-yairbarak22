public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addmin = Integer.parseInt(args[1]);
        int Totalmin = (hours * 60) + minutes + addmin;
        int Totalhours = Totalmin / 60;
        int Newhours = Totalhours % 24;
        int Newminutes = Totalmin - (Totalhours * 60);

        //print hours
        if (Newhours < 10) System.out.print("0" + Newhours + ":");
        else System.out.print(Newhours + ":");

        //print minuets
        if (Newminutes < 10) System.out.print("0" + Newminutes);
        else System.out.print(Newminutes);


    }
}
