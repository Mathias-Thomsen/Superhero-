import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Database database = new Database();


        //Udprinter velkomst
        System.out.println("Velkommen til superhelte universet!!!");
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

        Superhero superhelt1 = new Superhero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);

        database.createSuperHero(superHeroName, reelName, isHuman, superPower, creationYear, styrke);











    }

}






