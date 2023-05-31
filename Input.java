import java.util.Scanner;
public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);  
    }

    public String ask(String question) {
        Display d = new Display(100);
        d.write(question);
        System.out.println();
        String response = scan.nextLine();
        return(response);

    }

    public String multichose(String question, String[] options) {
        int length = options.length;
        for (int i = 0; i<length; i++){
            System.out.println("("+ (i+1) +") "+options[i]);
            
        }
        int choice = scan.nextInt();
        System.out.println("you chose "+options[choice-1]+"!");
        return(options[choice-1]);
        
        
    }
    public void pause() {
        scan.nextLine();
        
    }

    public static void main(String[] args) {
        Input i = new Input();
        i.ask("My cool question?");
        String[] qs = {"One", "Two", "Three", "Four"};
        i.multichose("???", qs);
    }
}