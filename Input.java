

import java.util.Scanner;
public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);  
    }

    public String scan(String question) {
        Display d = new Display(200);
        d.write(question);
        System.out.println("Enter Response");
        String response = scan.nextLine();
        return(response);

    }

    public String multichose(String question, String[] options) {
        return question;
    }

    public static void main(String[] args) {
        Input i = new Input();
        i.scan("My cool question?");
    }
}
