import java.util.*;

public class Thanos {

    public static void main(String[] args) {


        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 34));
        heroes.add(new Hero("Vision", 34));
        heroes.add(new Hero("Iron Man",48));
        heroes.add(new Hero("Thor", 1500));

        //GET INITIAL LIST
        System.out.println("///Initial List :");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i).getName());
        }

        // SHUFFLED THE LIST
        ArrayList<Hero> heroesShuffled = new ArrayList<>();
        while(heroes.size() > 0){
            Random random = new Random();
            int randomHero = random.nextInt(heroes.size());
            heroesShuffled.add(heroes.get(randomHero));
            heroes.remove(randomHero);
        }
        System.out.println("////Shuffled List :");
        for (int i = 0; i < heroesShuffled.size(); i++) {
            System.out.println(heroesShuffled.get(i).getName());
        }

        //CUT THE LIST IN 2
        ArrayList<Hero> heroesCutHalf = new ArrayList<>();
        for (int i = 0; i < heroesShuffled.size()/2; i++) {
            heroesCutHalf.add(heroesShuffled.get(i));
        }
        
        System.out.println("////Half List :");
        for (int i = 0; i < heroesCutHalf.size(); i++) {
            System.out.println(heroesCutHalf.get(i).getName());
        }

    }
}