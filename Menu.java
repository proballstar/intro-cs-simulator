import java.util.ArrayList;
import java.util.Random;
public class Menu {

    ArrayList<Food> menu = new ArrayList<Food>(); 
    Random rand = new Random();
    public Menu(){
        menu.add(new Food("rotten apple",0,0,3));
        menu.add(new Food("ceasar salad",2,0,5));
        menu.add(new Food("lettuce wrap",0,2,5));
        menu.add(new Food("steamed vegtables",1,1,4));
        menu.add(new Food("fruit cup",1,2,4));
        menu.add(new Food("omelette",3,4,5));
        menu.add(new Food("lobster bisque",4,4,7));
        menu.add(new Food("sushi rolls",2,6,8));
        menu.add(new Food("pizza",6,5,5));
        menu.add(new Food("pasta",4,7,8));
        menu.add(new Food("burger",8,8,10));
        menu.add(new Food("beef ministroni",8,3,6));
        menu.add(new Food("ramen",0,10,4));
        menu.add(new Food("fried rice",2,10,5));
        menu.add(new Food("fried chicken",8,4,3));
        menu.add(new Food("sushi rolls",2,6,8));
        
        menu.add(new Food("fried chicken",8,2,3));
    }

    public Food choose(){
        int num = rand.nextInt(menu.size());
        Food item = menu.get(num);
        return(item);
        
    }

    public void setMenu(int amt){
        ArrayList<Integer> chosenNum = new ArrayList<Integer>();
        
        for (int i = 0; i<amt;){
            int num = rand.nextInt(menu.size());
            if (!chosenNum.contains(num)){
            chosenNum.add(num);
            Food item = menu.get(num);
            System.out.println(item.foodStats());
            i++;
            }
        }
    }
    public Food getItem(String foodName){
        Food correctFood = new Food("init",0,0,0);
        for (int i = 0; i<menu.size(); i++){
            Food food = menu.get(i);
            String name = food.getFoodName();
            if(name.equals(foodName)){
                correctFood = menu.get(i);
            }
        
        }
        return(correctFood);
    }

}