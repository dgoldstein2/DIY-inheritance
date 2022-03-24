import java.util.ArrayList;
public class Marvel extends SuperHeroes{
    
    private int Power;
    public Marvel(){
        
        Power = 0;
    }
    public Marvel(String n, int l){
        super(n,l);
        
        Power = l*3;
    }
    public void marvelVillains(){
        ArrayList<String> x = super.getList();
        for(String f : x){
            System.out.println(f);
        }
    }
    public String movieTitle(){
        return "Marvel's "+ super.getName();
    }
    public int getPower(){
        return Power;
    }
    public boolean equals(Object o){
        return super.equals(o);
        }
    public String toString(){
        return super.toString() + " and i have the power of " + Power;
        }
}
