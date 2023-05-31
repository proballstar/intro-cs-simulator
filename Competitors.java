import java.util.*;
import java.util.stream.*;

public class Competitors {
  private ArrayList<Competitor> cs;

  public Competitors() {
    cs = new ArrayList<Competitor>(25);
    cs.add(new Competitor("Nathan", 80));
    cs.add(new Competitor("Damon", 50));
    cs.add(new Competitor("Rohan", 30));
    cs.add(new Competitor("Dennis", 19));
    cs.add(new Competitor("Patka", 43));
    cs.add(new Competitor("Dariy", 45));
    cs.add(new Competitor("Jaylin", 32));
    cs.add(new Competitor("Temetrius", 80));
    cs.add(new Competitor("Rigantona", 74));
    cs.add(new Competitor("Giannis", 99));
    cs.add(new Competitor("Cendrillon", 30));
    cs.add(new Competitor("David", 35));
    cs.add(new Competitor("Mike", 100));
    cs.add(new Competitor("Klay", 91));
    cs.add(new Competitor("Draymond", 75));
    cs.add(new Competitor("Curry", 78));
    cs.add(new Competitor("LeFlop", 20));
    cs.add(new Competitor("Karen", 2));
    cs.add(new Competitor("Shanon", 42));
    cs.add(new Competitor("Grigol", 23));
    cs.add(new Competitor("Amar", 72));
    cs.add(new Competitor("Fatima", 15));
    cs.add(new Competitor("Olim", 17));
    cs.add(new Competitor("Claudia", 19));
    cs.add(new Competitor("Basim", 91));
  }

  public ArrayList<Competitor> generate() {
    Random rand = new Random(); 
    ArrayList<Competitor> lcs= new ArrayList<Competitor>();
    
    /*result = this.cs.get(rand.nextInt(this.cs.size()));
    lcs.add(result);*/
    
    
    ArrayList<Integer> chosenNum = new ArrayList<Integer>();
        
        for (int i = 0; i<3;){
            int num = rand.nextInt(cs.size());
            if (!chosenNum.contains(num)){
            chosenNum.add(num);
            Competitor item = cs.get(num);
            System.out.println(item.name());
            i++;
            }
      /*Set<Competitor> css = new HashSet<>();
      css = this.cs.stream().collect(Collectors.toSet());
      lcs.clear();
      lcs.addAll(css);*/
    }
  
    return(lcs);
  }

    public Competitor getComp(String comp){
      Competitor correctComp = new Competitor("",0);
      for (int i = 0; i<cs.size(); i++){
          Competitor comp1 = cs.get(i);
          String name = comp1.name();
          if(name.equals(comp)){
              correctComp = cs.get(i);
          }
        }
      
      return(correctComp);
    }
    

}