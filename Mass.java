public class Mass {
  private double mass;
  private double p_mass;
  private Protein p;

  public Mass(int m) {
    this.p = new Protein(0);
    this.mass = m;
  }

  public double get() {
    return this.mass;
  }

  public Protein protein() {
    return this.p;
  }

  public double pmass() {
    return this.p_mass;
  }

  public void add_mass(double m) {
    this.p_mass = this.p_mass + m;
  }

  public boolean can_convert(int attempt) {
    if(attempt <= this.p_mass) {
      return true;
    } else {
      return false;
    }
  }

  public void convert(int hrs) {
    
    this.mass = this.mass + this.p_mass * (1 + hrs / 10);
    this.p_mass = 0;
  }

  public boolean can_workout() {
    if(this.protein().get() >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public void consume_protein(int c) {
    this.p.use(c);
  }

  public void add_protein(int p) {
    this.p.eat(p);
  }
}