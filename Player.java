public class Player {
    private Mass mass;
    private Energy energy;
    private Money amt;
    private String name;
  
    public Player(String name) {
      this.mass = new Mass(0);
      this.energy = new Energy(100);
      this.amt = new Money(100);
      this.name = name;
    }
  
    public Mass mass() {
      return this.mass;
    }
  
    public Money money() {
      return this.amt;
    }
  
    public Energy energy() {
      return this.energy;
    }

    public String get_name() {
        return this.name;
    }

    public void sleep(int hours){
      mass.convert(hours);
      energy.part_restore(hours);
      amt.spend(hours*10);
    }
  }