public class Bet {
    private Money amt;
  
    public Bet(int amt){
      this.amt = new Money(amt);
    }

    public Money get_money() {
      return this.amt;
    }
  
    public void end(Competitor c, Player p, String w) {
      if(w.equals("C")) {
        p.money().spend(this.amt.get());
      } else {
        p.money().earn(this.amt.get());
      }
    }
  }