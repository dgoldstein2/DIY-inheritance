import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<SuperHeroes> listOfSupers = new ArrayList<SuperHeroes>();
        SuperHeroes s1 = new SuperHeroes();
        SuperHeroes s2 = new SuperHeroes("Invincible", 10);
        SuperHeroes d1 = new DC();
        DC d2 = new DC("Batman", 15);
        SuperHeroes m1 = new Marvel();
        Marvel m2 = new Marvel("Iron man", 10);
        DC d3 = new DC("Superman", 80);
        SuperHeroes d4 = new DC("Flash", 70);
        SuperHeroes m3 = new Marvel("Thor", 30);
        SuperHeroes m4 = new Marvel("Wolverine", 30);
        DC d5 = new DC("Flash", 20);
        
        listOfSupers.add(s1);
        listOfSupers.add(s2);
        listOfSupers.add(d1);
        listOfSupers.add(d2);
        listOfSupers.add(d3);
        listOfSupers.add(d4);
        listOfSupers.add(m1);
        listOfSupers.add(m2);
        listOfSupers.add(m3);
        listOfSupers.add(m4);
        
        d3.addSideKick("Jimmy olsen");
        d3.side();
        System.out.println(m2.movieTitle());
        d2.roguesGallery("Joker");
        d2.roguesGallery("Bane");
        d2.roguesGallery("Riddler");
        d2.rankVillain(2,"Hush");
        System.out.println(d4.equals(d5));
        System.out.println(m4.equals(m2));
        d2.getList();
        System.out.println("Power: " + m2.getPower());
        System.out.println(d2.duel("Superman"));
        System.out.println("Strength: " + d3.getStrength());
        System.out.println(s1);
        System.out.println(d4);
        System.out.println(m3);
        System.out.println(d2);
        System.out.println(m2);
        
        


        
        

        
    }
}
