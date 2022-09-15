import java.util.Scanner;

public class Userinterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    int menuValg;


    public void menu() {
        System.out.println("Velkommen til superhelte universet!!!");
        System.out.println("1. Lav en ny superhero");
        System.out.println("2. Liste af superheroes");
        System.out.println("3. Søgning efter superheroes");
        System.out.println("9. Afslut");
        menuValg = scanner.nextInt();
        scanner.nextLine();

    }
    public void creatSuperhero(){
        System.out.print("Indtast navnet på din superhelt (fx Spiderman): ");
        String superHeroName = scanner.nextLine();
        System.out.print("Indtast superheltens rigtige navn (fx Peter Parker): ");
        String reelName = scanner.nextLine();
        System.out.print("Er din superhelt et menneske (j/n): ");
        char userAnswerHuman = scanner.next().charAt(0);
        boolean isHuman = false;
        if (userAnswerHuman == 'j') {
            isHuman = true;
        } else if (userAnswerHuman == 'n') {
            isHuman = false;
        } else System.out.println("Ugyldigt svar");
        scanner.nextLine();

        System.out.print("Indtast superheltens superpower (fx stærk): ");
        String superPower = scanner.nextLine();
        System.out.print("Indtast det år superhelten blev skabt (fx 1945): ");
        int creationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Indtast superheltens styrke (med ',' f.eks. 1,5): ");
        double styrke = scanner.nextDouble();
        database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);

        startprogram();
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
            System.out.println("Indtast den superhelt du vil søge efter: ");
            String searchTerm = scanner.nextLine();
            database.searchFor(searchTerm);

            startprogram();

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

