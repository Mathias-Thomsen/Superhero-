public class Superhero {
    private String superhelteNavn;
    private String rigtigeNavn;
    private boolean erMenneske;
    private String superPower;
    private int skabelsesÅr;
    private double styrke;

    //konstruktør
    public Superhero(String superhelteNavn, String rigtigeNavn, boolean erMenneske, String superPower, int skabelsesÅr, double styrke) {
        this.superhelteNavn = superhelteNavn;
        this.rigtigeNavn = rigtigeNavn;
        this.erMenneske = erMenneske;
        this.superPower = superPower;
        this.skabelsesÅr = skabelsesÅr;
        this.styrke = styrke;
    }

    //Gettere
    public String getSuperhelteNavn() {
        return superhelteNavn;
    }
    public String getRigtigeNavn() {
        return rigtigeNavn;
    }
    public boolean getErMenneske() {
        return erMenneske;
    }
    public String getSuperPower() {
        return superPower;
    }
    public int getSkabelsesÅr() {
        return skabelsesÅr;
    }
    public double getStyrke() {
        return styrke;
    }



}
