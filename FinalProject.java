import java.security.spec.DSAGenParameterSpec;

public class FinalProject {
    public static void main(String[] args) {
        int days = 7;
        int delay = 125;
        String name = "Damon Chiou";

        Display d = new Display(delay);

        d.write(String.format("Welcome %s", name));

        Player p = new Player();

        for(int i = 0; i < days; i++) {
            
        }
    }
}
