import java.util.ArrayList;
public class SuperHeroes{
    private String name;
    private int level;
    private String sideKick;
    private ArrayList<String> villains = new ArrayList<String>();
    public SuperHeroes(){
        name = "Steve";
        level = 1;
    }
    public SuperHeroes(String n, int l){
        name = n;
        level = l;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public void setName(String x){
        name = x;
    }
    public void setLevel(int f){
        level = f;
    }
    public String toString(){
       return "I'm: " + name + ", I am at level "+level;
    }
    public void roguesGallery(String m){
        villains.add(m);
    }
    public void rankVillain(int x, String n){
        villains.add(x-1,n);
    }
    public ArrayList<String> getList(){
        return villains;
    }
    public void addSideKick(String v){
        sideKick = v;

    }
    public String getSideKick(){
        return sideKick;
    }
}