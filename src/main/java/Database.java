import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();



    public void createSuperHero(String superHeroName, String reelName, boolean isHuman, String superPower, int creationYear, double powerLevel) {
        Superhero newSuperHero = new Superhero(superHeroName, reelName, isHuman, superPower, creationYear, powerLevel);
        superheroes.add(newSuperHero);

    }

    public void showListOfSuperheroes(){
        for (Superhero superhero : superheroes) {
            System.out.println("------------------:\n"
                    + "Superheltenavn: " + superhero.getSuperHeroName()+ "\n"
                    + "Superkraft: " + superhero.getSuperPower()+ "\n"
                    + "Virkelige navn: " + superhero.getReelName()+ "\n"
                    + "Oprindelsesår: " + superhero.getCreationYear()+ "\n"
                    + "Er menneske: " + superhero.getHuman()+ "\n"
                    + "Styrke: " + superhero.getPowerLevel());
        }
    }

}
