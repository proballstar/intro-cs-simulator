import java.util.*;

public class Workout {
  public long w;
  public String t;
  public int energy;
  public double mass;
  public Player player;

  
  public Workout(String type, Player p) {
    this.t = type;
    this.w = Math.round(p.mass().get() * 1.2);
    this.player = p;
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

  public boolean cannot_rep(int num_reps) {
    int player_energy = this.player.energy().get();

    if(num_reps * this.energy > player_energy) {
      return true;
    } else {
      return false;
    }
  }

  public Map<String, Integer> rep(int n_reps) {
    int cr = 0;    
    int e_used = 0;
    Player p = this.player;

    while(cr < n_reps) {
      if(p.mass().protein().get() >= this.mass) {
        p.mass().add_mass(this.mass);
        p.mass().consume_protein(1);
      }
      p.energy().workout(this.energy);
      e_used += this.energy;
      
      cr++;
    }

    Map<String, Integer> map = new HashMap<String, Integer>();
    
    map.put("energy", e_used);

    return map;
  }
}