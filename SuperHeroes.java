public class SuperHeroes{
    private String name;
    private int level;
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
}