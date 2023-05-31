public class Competitor {
  private Mass mass;
  private String name;

  public Competitor(String n, int m) {
    mass = new Mass(m);
    name = n;
  }

  public String name() {
    return this.name;
  }

  public Mass mass() {
    return this.mass;
  }

  public boolean battle(Player p) {
    if(p.mass().get() >= this.mass().get()) {
      
      return true;
    } else {
      return false;
    }
  }

  public String display() {
    return String.format("%s, %f pounds", this.name, this.mass().get());
  }
}