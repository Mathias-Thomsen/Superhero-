import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    int menuValg;
    private String name;
    private Superhero superhero;


    public void menu() {
        System.out.println("-------------------------");
        System.out.println("Database med superheroes!");
        System.out.println("-------------------------");
        System.out.println("1. Lav en ny superhero");
        System.out.println("2. Liste af superheroes");
        System.out.println("3. Søgning efter superheroes");
        System.out.println("9. Afslut");
        menuValg = scanner.nextInt();
        scanner.nextLine();

    }
    public void creatSuperhero(){
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast navnet på din superhelt (fx Spiderman): ");
        String superHeroName = scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast superheltens rigtige navn (fx Peter Parker): ");
        String reelName = scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Er din superhelt et menneske (j/n): ");

        char userAnswerHuman = scanner.next().charAt(0);
        boolean isHuman = false;
        if (userAnswerHuman == 'j') {
            isHuman = true;
        } else if (userAnswerHuman == 'n') {
            isHuman = false;

        } else
            System.out.println("Ugyldigt svar");
        scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast superheltens superpower (fx stærk): ");
        String superPower = scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast det år superhelten blev skabt (fx 1945): ");
        int creationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast superheltens styrke (med ',' f.eks. 1,5): ");
        double styrke = scanner.nextDouble();
        database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);

        startprogram();
    }

    public void printSuperheroData() {
        System.out.println("------------------\n"
                + "Superheltenavn: " + superhero.getSuperHeroName() + "\n"
                + "Superkraft: " + superhero.getSuperPower() + "\n"
                + "Virkelige navn: " + superhero.getReelName() + "\n"
                + "Oprindelsesår: " + superhero.getCreationYear() + "\n"
                + "Er menneske: " + superhero.getHuman() + "\n"
                + "Styrke: " + superhero.getPowerLevel());
    }
    public void showListOfSuperheroes(){
        System.out.println("Liste af superhelte: ");
        for (Superhero superhero : database.getSuperheroes()) {
            System.out.println("------------------\n"
                    + "Superheltenavn: " + superhero.getSuperHeroName() + "\n"
                    + "Superkraft: " + superhero.getSuperPower() + "\n"
                    + "Virkelige navn: " + superhero.getReelName() + "\n"
                    + "Oprindelsesår: " + superhero.getCreationYear() + "\n"
                    + "Er menneske: " + superhero.getHuman() + "\n"
                    + "Styrke: " + superhero.getPowerLevel());
        }
        startprogram();
    }

    public void searchInList() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Indtast den superhelt du vil søge efter: ");
        String searchTerm = scanner.nextLine();

        ArrayList<Superhero> searchResult = new ArrayList<Superhero>();

        for (Superhero superhero : database.superheroes ) {
            name = superhero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm.toLowerCase())) {
                searchResult.add(superhero);
            }

        }
        if (!searchResult.isEmpty()) {
            for (int i = 0; i < searchResult.size(); i++)
                System.out.println(i+1 + ":" + searchResult.get(i).toString());

        } else {
            System.out.println("Der findes ingen superhelte i databasen med dette navn: " + searchTerm);
        }

        startprogram();
    }

    public void startprogram() {
        //test data husk at slette.
        database.createTestData();
        //Udprinter velkomst
        menu();
        if (menuValg == 1) {
            creatSuperhero();
        }
        else if (menuValg == 2) {
            showListOfSuperheroes();
        }
        else if (menuValg == 3) {
            searchInList();
        }
        else if (menuValg == 9) {
            System.out.println("Programmet afsluttes");

        }
        else {
            System.out.println("Ugyldigt input");
            startprogram();
        }


    }


}

/* Superhero superherolist = database.searchFor(searchTerm);
         if (superherolist == null) {
         System.out.println("Superhelten findes ikke i databasen");
         }
         else {
            /*System.out.println("------------------\n"
                    + "Superheltenavn: " + superherolist.getSuperHeroName() + "\n"
                    + "Superkraft: " + superherolist.getSuperPower() + "\n"
                    + "Virkelige navn: " + superherolist.getReelName() + "\n"
                    + "Oprindelsesår: " + superherolist.getCreationYear() + "\n"
                    + "Er menneske: " + superherolist.getHuman() + "\n"
                    + "Styrke: " + superherolist.getPowerLevel());

             */
