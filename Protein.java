public class Protein {
    private int amt;
  
    public Protein(int d) {
      this.amt = d;
    }
  
    public void use(int u) {
      this.amt = this.amt - u;
    }
  
    public void eat(int e) {
      this.amt = this.amt + e;
    }
  
    public int get() {
      return this.amt;
    }
  }