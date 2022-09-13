public class Database {
    private Superhero[] superheroes;
    private int antalSuperheros;
    private int superHeroesAmount;



    public Database(){
        superheroes = new Superhero[5];
        antalSuperheros = 0;
        superHeroesAmount = 0;
    }

    public void createSuperHero(String superHeroName, String reelName, boolean isHuman, String superPower, int creationYear, double powerLevel) {
        Superhero newSuperHero = new Superhero(superHeroName, reelName, isHuman, superPower, creationYear, powerLevel);
        superheroes[antalSuperheros++] = newSuperHero;
        superheroes[superHeroesAmount++] = newSuperHero;
    }


    public void setAntalSuperheros() {
        this.antalSuperheros = antalSuperheros;
    }
}
