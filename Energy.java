public class Energy {
    public int energy;
  
    public Energy(int energy) {
      this.energy = energy;
    }
  
    public void workout(int e) {
      this.energy = this.energy - e;
    }
  
    public void regen(int e) {
      this.energy = this.energy + e;
    }
  
    public void part_restore(int hrs) {
      this.energy = 15 * hrs;
    }
  
    public int get() {
      return this.energy;
    }
  
    public boolean can_workout(int e) {
      if(this.energy > e) {
        return true;
      } else {
        return false;
      }
    }
  }