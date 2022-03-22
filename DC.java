

public class DC extends SuperHeroes{
    private String name;
    private int Strength;
    public DC(){
        name = "Jeff";
        Strength = 0;
    }
    public DC(String n, int l){
        super(n,l);
        name = n;
        Strength = l;
    }
    public void side(){
        System.out.print(super.getSideKick());
    }
    public int getStrength(){
        return Strength;
    }
    public String duel(String x){
        return "Come look " + name + " is going to fight " + x +"!";
    }
}
