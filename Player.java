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

  public void eat(Food food){
    energy.regen(food.getEnergy());
    amt.spend(food.getCost());
    mass.add_protein(food.getProtein());
  }
  public void stats(){
    String statistics = String.format("Energy: %s,\tMoney: %s,\tMuscle: %s,\tPotentialMass: %s, \tProtein: %s", 
      this.energy.get(), this.amt.get(), this.mass.get(), this.mass.pmass(), this.mass.protein().get());
    System.out.println(statistics);
  }
  public void sleep(int hours){
    Display d = new Display(500);
    d.write(String.format("Player %s, is now sleeping for %o hours", this.name, hours));
    mass.convert(hours);
    energy.part_restore(hours);
    amt.spend(hours*2);
  }

  public void updateMoney(Boolean result, Bet b){
    if (result){
      this.amt.earn(b.get_money().get());
    }
    else{
      this.amt.spend(10);
    }
  }
}