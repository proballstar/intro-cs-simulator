public class Player {
    public Mass mass;
    public Energy energy;
    public Money amt;
  
    public Player() {
      this.mass = new Mass(0);
      this.energy = new Energy(100);
      this.amt = new Money(100);
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
    public void sleep(int hours){
      mass.convert(hours);
      energy.part_restore(hours);
      amt.spend(hours*10);
    }
  }