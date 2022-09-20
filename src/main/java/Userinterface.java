import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    private String name;
    boolean userValgFalse;


    public void menu() {
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

            do {
                String valg = scanner.nextLine();

                try {
                    menuValg = Integer.parseInt(valg);
                    userValgFalse = true;
                    startprogram(menuValg);
                } catch (NumberFormatException e) {
                    System.out.print("Der skete en fejl! - Indtast venligst et gyldigt nummer: ");
                }

            } while (userValgFalse == false);
        }

    }

    public void startprogram(int menuValg) {
        if (menuValg == 1) {
            this.createSuperhero();
        } else if (menuValg == 2) {
            this.showListOfSuperheroes();
        } else if (menuValg == 3) {
            this.searchSuperhero();
        } else if (menuValg == 4) {
            this.editSuperhero();
        } else if (menuValg == 9) {
            System.out.println("Programmet afsluttes");
        }

    }

    public void createSuperhero() {
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast navnet på din superhelt (fx Spiderman): ");
        String superHeroName = this.scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast superheltens rigtige navn (fx Peter Parker): ");
        String reelName = this.scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Er din superhelt et menneske (j/n): ");
        char userAnswerHuman = this.scanner.next().charAt(0);
        boolean isHuman = false;
        if (userAnswerHuman == 'j') {
            isHuman = true;
        } else if (userAnswerHuman == 'n') {
            isHuman = false;
        } else {
            System.out.println("Ugyldigt svar");
        }

        this.scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast hvilken superkraft din superhero har (fx stærk): ");
        String superPower = this.scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast det år superhelten blev skabt (fx 1945): ");
        int creationYear = this.scanner.nextInt();
        this.scanner.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.print("Indtast superheltens styrke (med ',' f.eks. 1,5): ");
        double styrke = this.scanner.nextDouble();
        this.scanner.nextLine();
        this.database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);
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
        String userEditSuperhero = this.scanner.nextLine();
        ArrayList<Superhero> searchEditResult = new ArrayList();
        int index = 1;


        for (Superhero editSuperhero : database.superheroes) {
            name = editSuperhero.getSuperHeroName().toLowerCase();
            if (name.contains(userEditSuperhero.toLowerCase())) {
                searchEditResult.add(editSuperhero);
                System.out.println("------------------\n"
                        + "Superheltenavn: " + editSuperhero.getSuperHeroName() + "\n"
                        + "Superkraft: " + editSuperhero.getSuperPower() + "\n"
                        + "Virkelige navn: " + editSuperhero.getReelName() + "\n"
                        + "Oprindelsesår: " + editSuperhero.getCreationYear() + "\n"
                        + "Er menneske: " + editSuperhero.getHuman() + "\n"
                        + "Styrke: " + editSuperhero.getPowerLevel());

            }
        }

        Superhero editSuperhero = searchEditResult.get(index - 1);
        System.out.println("Redigere: " + editSuperhero);
        System.out.println("Ønsker du ikke redigere tryk ENTER for at fortsætte!");


        do {
            System.out.print("Indtast tallet på den superhero du vil redigere:");

            try {
                int intSuperheroEdit;
                String newPowerLevel = this.scanner.nextLine();
                intSuperheroEdit = Integer.parseInt(newPowerLevel);
                userValgFalse = true;
            } catch (NumberFormatException var12) {
                System.out.print("Indtast venligst et gyldigt nummer! ");
            }
        } while (userValgFalse == false);



        do {
            System.out.println("Superhero navn: " + editSuperhero.getSuperHeroName());

            try {
                System.out.print("Skriv din rettelse her: ");
                String newSuperheroName = scanner.nextLine();
                if (!newSuperheroName.isEmpty()) {
                    editSuperhero.setSuperheroName(newSuperheroName);
                }

                userValgFalse = true;
            } catch (NumberFormatException var11) {
                System.out.println("Skriv venligst din rettelse med tekst bogstaver eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

        do {
            System.out.println("Superhero rigtige navn: " + editSuperhero.getReelName());

            try {
                System.out.print("Skriv din rettelse her: ");
                String newReelName = scanner.nextLine();
                if (!newReelName.isEmpty()) {
                    editSuperhero.setReelName(newReelName);
                }

                userValgFalse = true;
            } catch (NumberFormatException var10) {
                System.out.println("Skriv venligst din rettelse med tekst bogstaver eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

        do {
            System.out.println("Superkraft: " + editSuperhero.getSuperPower());

            try {
                System.out.print("Skriv din rettelse her: ");
                String newSuperPower = scanner.nextLine();
                if (!newSuperPower.isEmpty()) {
                    editSuperhero.setSuperPower(newSuperPower);
                }

                userValgFalse = true;
            } catch (NumberFormatException var9) {
                System.out.println("Skriv venligst din rettelse med tekst bogstaver eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

        do {
            System.out.println("Oprindelsesår: " + editSuperhero.getCreationYear());

            try {
                System.out.print("Skriv din rettelse her: ");
                String newCreationYear = scanner.nextLine();
                if (!newCreationYear.isEmpty()) {
                    editSuperhero.setCreationYear(Integer.parseInt(newCreationYear));
                }

                userValgFalse = true;
            } catch (NumberFormatException var8) {
                System.out.println("Skriv venligst din rettelse med tal eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

        do {
            System.out.println("Er menneske: " + editSuperhero.getHuman());

            try {
                System.out.print("Skriv din rettelse her (j/n): ");
                String newIsHuman = scanner.nextLine();
                if (!newIsHuman.isEmpty()) {
                    editSuperhero.setIsHuman(Boolean.parseBoolean(newIsHuman));
                }

                userValgFalse = true;
            } catch (NumberFormatException var7) {
                System.out.println("Skriv venligst din rettelse med (j/n) eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

        do {
            System.out.println("Styrke: " + editSuperhero.getPowerLevel());

            try {
                System.out.print("Skriv din rettelse her: ");
                String newPowerLevel = scanner.nextLine();
                if (!newPowerLevel.isEmpty()) {
                    editSuperhero.setPowerLevel(Double.parseDouble(newPowerLevel));
                }

                userValgFalse = true;
            } catch (NumberFormatException var6) {
                System.out.println("Skriv venligst din rettelse med kommatal (f.eks. 1,5) eller ENTER hvis du ikke vil rette!");
            }
        } while (userValgFalse == false);

    }
}