public class FinalProject {
    public static void main(String[] args) {
        int days = 7;
        int delay = 125;

        Input in = new Input();

        String name = in.scan("What is your name?");

        Display d = new Display(delay);
        Player p = new Player(name);

    
        d.stats(p.energy(), p.money(), p.mass());
        d.write(String.format("Welcome %s", p.get_name()));

        for(int i = 0; i < days; i++) {
            d.write("HELLO WORLD");
        }
    }
}
