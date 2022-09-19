import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    private String name;


    public void menu() {

        //test data husk at slette.
        database.createTestData();

        int menuValg = 0;
        while (menuValg != 9) {
            System.out.println("-------------------------");
            System.out.println("Database med superheroes!");
            System.out.println("-------------------------");
            System.out.println("1. Lav en ny superhero");
            System.out.println("2. Liste af superheroes");
            System.out.println("3. Søgning efter superheroes");
            System.out.println("4. Redigere superhero");
            System.out.println("9. Afslut");

            boolean userValgFalse = false;
            do {
                String valg = scanner.nextLine();
                try {
                    menuValg = Integer.parseInt(valg);
                    userValgFalse = true;
                    startprogram(menuValg);

                } catch (NumberFormatException e) {
                    System.out.print("Der skete en fejl! - Indtast venligst et nummer: ");

                }
            } while (userValgFalse == false);

        }

    }

    public void startprogram(int menuValg) {
        //Udprinter velkomst
        if (menuValg == 1) {
            creatSuperhero();
        } else if (menuValg == 2) {
            showListOfSuperheroes();
        } else if (menuValg == 3) {
            searchSuperhero();
        } else if (menuValg == 4) {
            editSuperhero();
        } else if (menuValg == 9) {
            System.out.println("Programmet afsluttes");
        }
    }

    public void creatSuperhero() {
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
        scanner.nextLine();
        database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);


    }


    public void showListOfSuperheroes() {
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

    }

    public void searchSuperhero() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Indtast den superhelt du vil søge efter: ");
        String searchTerm = scanner.nextLine();

        ArrayList<Superhero> searchResult = new ArrayList<Superhero>();

        for (Superhero superhero : database.superheroes) {
            name = superhero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm.toLowerCase())) {
                searchResult.add(superhero);
                System.out.println("------------------\n"
                        + "Superheltenavn: " + superhero.getSuperHeroName() + "\n"
                        + "Superkraft: " + superhero.getSuperPower() + "\n"
                        + "Virkelige navn: " + superhero.getReelName() + "\n"
                        + "Oprindelsesår: " + superhero.getCreationYear() + "\n"
                        + "Er menneske: " + superhero.getHuman() + "\n"
                        + "Styrke: " + superhero.getPowerLevel());

            }


        }
    }


    public void editSuperhero() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Indtast en superhero du vil redigere: ");
        String userEditSuperhero = scanner.nextLine();

        ArrayList<Superhero> searchEditResult = new ArrayList<Superhero>();

        int index = 1;
        for (Superhero superhero : database.superheroes) {
            name = superhero.getSuperHeroName().toLowerCase();
            if (name.contains(userEditSuperhero.toLowerCase())) {
                searchEditResult.add(superhero);
                System.out.println(index++ + ":" + superhero.getSuperHeroName());


            }

        }
    }
}






