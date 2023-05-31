import java.util.*;

public class Workout {
  public long w;
  public String t;
  
  public Workout(String type, Player p) {
    this.t = type;
    this.w = Math.round(p.mass().get() * 1.2);
  }

  public Map<String, ArrayList<String>> rep(Player p, int n_reps) {
    int cr = 0;
    int e = 0;
    double m = 0.0;
    if(this.t.equals("BP")) {
      e = 3;
      m = 1.5;
    } else if (this.t.equals("OP")) {
      e = 2;
      m = 1.3;
    } else {
      e = 1;
      m = 1.1;
    }



    while((p.energy().can_workout(e) && p.mass().can_workout()) && cr < n_reps) {
      p.energy().workout(e);
      p.mass().add_mass(m);
      p.mass().consume_protein(1);
      Display d = new Display(e);
      d.stats(p.energy(), p.money(), p.mass());
      cr++;
    }

    Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    ArrayList<String> al = new ArrayList<String>(1);
    
    ArrayList<String> cond = new ArrayList<String>(1);
    ArrayList<String> rep = new ArrayList<String>(1);
    rep.add(String.valueOf(cr));
    if(cr < n_reps) {
      cond.add("no");
      map.put("condition", cond);
      if(!p.energy().can_workout(e)) {
        al.add("energy");
      }
      if(!p.mass().can_workout()) {
        al.add("protein");
      }
      map.put("reps", rep);
      map.put("reasons", al);
      return map;
    } else {
      cond.add("no");
      map.put("condition", cond);
      al.add("none");
      map.put("reasons", al);
      return map;
    }
  }
}