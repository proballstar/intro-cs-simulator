import java.util.*;

public class Display {

  private int delay;

  public Display(int delay) {
    this.delay = delay;
  }
  
  public void write(String words) {
    TypingBot tb = new TypingBot(words, this.delay);
    tb.isDaemon();
    tb.start();
    Thread t = Thread.currentThread();
    try {
      t.join(this.delay);
    } catch (Exception E) {
      System.err.println(E);
    }
  }

  public void stats(Energy e, Money d, Mass m) {
    int energy = e.get();
    int money = d.get();
    double muscle = m.get();
    String used_code = "";
    Map<String, String> codes = new HashMap<>();
    codes.put("red", "\u001B[31m");
    codes.put("yellow", "\u001B[33m");
    codes.put("green", "\u001B[32m");
    long energy_bars = Math.round(energy / 10.0);

    if(energy_bars > 7) {
     used_code = codes.get("green");
    } else if (energy_bars <= 7 && energy_bars > 4) {
      used_code = codes.get("yellow");
    } else {
      used_code = codes.get("red");
    }

    System.out.println("   Energy                Money                        Muscle");
    System.out.println("   ...........");
    for(int i = 0; i < 3; i++) {
      System.out.print("   .");
      int k = 0;
      for(int j = 0; j < 10; j++) {
        if(k < energy_bars) {
          System.out.print(String.format("%s.", used_code));
          k++;
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\033[0m");
      if(i == 0 || i == 2) {
        System.out.print("..");
      } else if(i == 1) {
        System.out.print(String.format("..         %o      %f", money, muscle));
      }
      System.out.print("\n");
    }
    System.out.println("   ...........");
  }
}

class TypingBot extends Thread {
    String words;
    int delay;
  
    public TypingBot(String words, int delay){
        this.words = words;
        this.delay = delay;
    }

    @Override
    public void run(){
        for (int i = 0 ; i < this.words.length() ; i++){
            System.out.print(this.words.charAt(i));
            try{
                Thread.sleep(this.delay);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}