import java.util.*;
public class FinalProject {
    
    

    public static void main(String[] args) {
        int days = 7;
        int delay = 125;
        Scanner scan = new Scanner(System.in); 

        

        Display d = new Display(delay);
        
        Input input = new Input();
        Menu menu = new Menu();
        String name = input.ask("What is your name?");
        Player p = new Player(name);

        d.write(String.format("Welcome %s", p.get_name()));
        input.pause();
        for(int i = 0; i < days; i++) {
            d.write("It is now day "+(i+1)+"\n");
            p.stats();
            input.pause();
            d.write("you go to the local resturaunt for breakfast,these are the options for today! \n");
            menu.setMenu(5);
            String response = input.ask(" what would you like to eat?");
            Food chosenFood = menu.getItem(response);
            p.eat(chosenFood);
            p.stats();

            d.write("now it is time to go to the gym! What wokrout do you want to do?");
            String type = scan.nextLine();
            Workout w = new Workout(type, p);
            d.write("how many reps?");
            int reps = scan.nextInt();
            Map<String, ArrayList<String>> values = w.rep(p, reps);
            
            
            p.stats();

            response = input.ask(" how many hours would you like to sleep?");
            int num=Integer.parseInt(response);  
            d.write(String.valueOf(num));
            System.out.print(num);
            p.sleep(num);

            d.write("Time for a competition!");
            
            input.pause();
            d.write("Here are the competitors\n");
            Competitors comp = new Competitors();
            comp.generate();
            String response1 = input.ask("who would you like to challenge?");
            Competitor chosenComp = comp.getComp(response1);
            Boolean bool = chosenComp.battle(p);
            p.updateMoney(bool);
            





            



            
            


            
            
            




        }
    }
}