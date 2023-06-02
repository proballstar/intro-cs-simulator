public class Protein {
    private int amt;
  
    public Protein(int d) {
      this.amt = d;
    }
  
    public void use(int u) {
      int after_res = this.amt - u;

      if(after_res >= 0) {
        this.amt = after_res;
      } else {
        this.amt = 0;
      }
    }
  
    public void eat(int e) {
      this.amt = this.amt + e;
    }
  
    public int get() {
      return this.amt;
    }
  }