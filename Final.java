import java.util.*;

public class Final {
    public static void main(String[] args) {
        Display d = new Display(100);
        Input in = new Input();
        Player pl = new Player("Hello");

        pl.stats();

        d.write("Now you head to the local gym for your workout. \n");

        OutputFormatter of = new OutputFormatter();
        of.add("Input", "Workout", "Effective Rank","  ", "Energy Needed");
        of.add("BP", "Bench Press (BP)", "1st","  ", "3");
        of.add("OP", "Overhead Press (OP)", "2nd","  ", "2");
        of.add("DC", "Dumbell Curl (DC)", "3rd","  ", "1");
        System.out.println(of.format());

        String wrkt = in.ask("Which option would you like to choose?");

        boolean cannot = true;
        
        Workout w = new Workout(wrkt, pl);

        String reps_str = new String();
        int reps = 0;
        
        while(cannot) {

            reps_str = in.ask("\nHow many reps?");
            reps = Integer.parseInt(reps_str);
            if(w.cannot_rep(reps)) {
                d.write(String.format("\nNot enough energy to complete %s reps", reps_str));
            } else {
                cannot = false;
            }

        }

        Map<String, Integer> resp = w.rep(reps);
        int energy = resp.get("energy");

        d.write(String.format("\nNice heavy work out there, you lost %d energy units and might gain some muscle while sleeping\n", energy));
    
        pl.stats();
    }
}