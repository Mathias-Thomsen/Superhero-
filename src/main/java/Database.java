import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private String name;


    public void createTestData() {
        createSuperHero("Batman", "Bruce Wayne", false, "Money", 1939, 1.00);
        createSuperHero("Batman", "Bruce Wayne", false, "Money", 1939, 1.00);
        createSuperHero("Batman", "Bruce Wayne", false, "Money", 1939, 1.00);
    }



    public void createSuperHero(String superHeroName, String reelName, boolean isHuman, String superPower, int creationYear, double powerLevel) {
        Superhero newSuperHero = new Superhero(superHeroName, reelName, isHuman, superPower, creationYear, powerLevel);
        superheroes.add(newSuperHero);

    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public Superhero searchFor(String searchTerm) {

        for (Superhero superhero : superheroes) {
            name = superhero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm.toLowerCase())) {
                System.out.println(superhero.getSuperHeroName());
            } else System.out.println("Superhelten findes ikke");

        }return null;



    }

    }









