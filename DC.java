

public class DC extends SuperHeroes{
    
    private int Strength;
    public DC(){
        
        Strength = 0;
    }
    public DC(String n, int l){
        super(n,l);
        
        Strength = l*2;
    }
    public void side(){
        System.out.print(super.getSideKick());
    }
    public int getStrength(){
        return Strength;
    }
    public String duel(String x){
        return "Come look " + super.getName() + " is going to fight " + x +"!";
    }
    public boolean equals(Object o){
        return super.equals(o);
        }

    public String toString(){
        return super.toString() + " and i have the strength of " + Strength;
        }
}
