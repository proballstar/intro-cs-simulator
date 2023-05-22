public class Money {
    private int amt;
  
    public Money(int i) {
      amt = i;
    }
  
    public void earn(int a) {
      this.amt = this.amt + a;
    }
  
    public void spend(int a) {
      this.amt = this.amt - a;
    }
  
    public void sleep_restore(int hrs) {
      this.amt = this.amt - (
        10 * hrs);
    }
  
    public int get() {
      return this.amt;
    }
  }
  