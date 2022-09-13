import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        int menuValg;

        //Udprinter velkomst
        System.out.println("Velkommen til superhelte universet!!!");

        //Menu


        do {
            System.out.println("1. Lav en ny superhero");
            System.out.println("2. Liste af superheroes");
            System.out.println("9. Afslut");
            menuValg = scanner.nextInt();
            scanner.nextLine();

            if (menuValg == 1) {
                System.out.print("Indtast navnet på din superhelt (fx spiderman): ");
                String superHeroName = scanner.nextLine();
                System.out.print("Indtast superheltens rigtige navn (fx Peter Parker): ");
                String reelName = scanner.nextLine();
                System.out.print("Er din superhelt et menneske (true/false): ");
                boolean isHuman = scanner.nextBoolean();
                scanner.nextLine();
                System.out.print("Indtast superheltens superpower: ");
                String superPower = scanner.nextLine();
                System.out.print("Indtast det år superhelten blev skabt: ");
                int creationYear = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Indtast superheltens styrke: ");
                double styrke = scanner.nextDouble();
                database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);

            } else if (menuValg == 9) {
                System.out.println("Programmet afsluttes");
            }else if (menuValg == 2) {
                database.showListOfSuperheroes();

            }

        } while (menuValg == 1);





    }

}






