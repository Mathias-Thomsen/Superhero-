public class Superhero {
    private String superHeroName;
    private String reelName;
    private boolean isHuman;
    private String superPower;
    private int creationYear;
    private double powerLevel;

    //konstruktør
    public Superhero(String superHeroName, String reelName, boolean isHuman, String superPower, int creationYear, double powerLevel) {
        this.superHeroName = superHeroName;
        this.reelName = reelName;
        this.isHuman = isHuman;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.powerLevel = powerLevel;
    }

    //Gettere
    public String getSuperHeroName() {
        return superHeroName;
    }
    public String getReelName() {
        return reelName;
    }
    public boolean getHuman() {
        return isHuman;
    }
    public String getSuperPower() {
        return superPower;
    }
    public int getCreationYear() {
        return creationYear;
    }
    public double getPowerLevel() {
        return powerLevel;
    }


    public void setSuperhelteNavn() {
        this.superHeroName = superHeroName;
    }



}
