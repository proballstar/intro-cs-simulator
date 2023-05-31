import java.util.*;

public class Final {
    public static void main(String[] args) {
        Display d = new Display(100);
        Input in = new Input();
        Player pl = new Player("Hello");

        d.write("Now you head to the local gym for your workout, which option would you like to choose\n");

        OutputFormatter of = new OutputFormatter();
        of.add("Input", "Workout", "Effective Rank", "Energy Needed");
        of.add("BP", "Bench Press (BP)", "1st", "3");
        of.add("OP", "Overhead Press (OP)", "2nd", "2");
        of.add("DC", "Dumbell Curl (DC)", "3rd", "1");
        System.out.println(of.format());

        String wrkt = in.ask("Enter your workout:");
        String reps_str = in.ask("Enter number of reps");
        int reps = Integer.parseInt(reps_str);

        Workout w = new Workout(wrkt, pl);
        if(w.cannot_rep(reps)) {
            d.write(String.format("Not enough energy to complete %s reps", reps_str));
        }

        Map<String, Integer> resp = w.rep(pl, reps);
        int energy = resp.get("energy");

        d.write(String.format("Nice heavy work out there, you lost %d energy units and might gain some muscle while sleeping", energy));
    }
}