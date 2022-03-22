import java.util.ArrayList;
public class Marvel extends SuperHeroes{
    private String name;
    private int Power;
    public Marvel(){
        name = "Matt";
        Power = 0;
    }
    public Marvel(String n, int l){
        super(n,l);
        name = n;
        Power = l;
    }
    public void marvelVillains(){
        ArrayList<String> x = super.getList();
        for(String f : x){
            System.out.println(f);
        }
    }
    public String movieTitle(){
        return "Marvel's "+ name;
    }
    public int getPower(){
        return Power;
    }
}
