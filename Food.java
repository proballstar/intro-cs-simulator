public class Food {
    private String foodName;
    private int protein;
    private int energy;
    private int cost;
    
    public Food(String startFoodName, int startProtein, int startEnergy, int startCost){
        foodName = startFoodName;
        protein = startProtein;
        energy = startEnergy;
        cost = startCost;
    }
    public String getFoodName(){
        return foodName;
    }
    public int getProtein(){
        return protein;
    }
    public int getEnergy(){
        return energy;
    }
    public int getCost(){
        return cost;
    }
    public String foodStats(){
        return("Item:"+foodName+ "\t\tProtein:"+protein+"\tEnergy:"+energy+"\tCost:$"+cost);
    }
    public void updateStats(){
        
    }
}

