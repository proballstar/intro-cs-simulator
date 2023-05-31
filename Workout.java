import java.util.*;

public class Workout {
  public long w;
  public String t;
  public int energy;
  public double mass;
  
  public Workout(String type, Player p) {
    this.t = type;
    this.w = Math.round(p.mass().get() * 1.2);
    if(this.t.equals("BP")) {
      this.energy = 3;
      this.mass = 1.5;
    } else if (this.t.equals("OP")) {
      this.energy = 2;
      this.mass = 1.3;
    } else {
      this.energy = 1;
      this.mass = 1.1;
    }
  }

  public Map<String, Integer> rep(Player p, int n_reps) {
    int cr = 0;    
    int e_used = 0;

    while(cr < n_reps) {
      p.energy().workout(this.energy);
      e_used += this.energy;
      p.mass().add_mass(this.mass);
      p.mass().consume_protein(1);
      cr++;
    }

    Map<String, Integer> map = new HashMap<String, Integer>();
    
    map.put("energy", e_used);

    return map;
  }
}