import java.util.*;

public class Display {

  private int delay;

  public Display(int delay) {
    this.delay = delay;
  }
  
  public void write(String words) {
    for(char c: words.toCharArray()) { 
      System.out.print(c);
      try {
        Thread.sleep(delay);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
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
