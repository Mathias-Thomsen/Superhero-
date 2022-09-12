import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);




        //Udprinter velkomst
        System.out.println("Velkommen til superhelte universet!!!");

        System.out.print("Indtast navnet på din superhelt (fx spiderman): ");
        String superheltnavn = scanner.nextLine();

        System.out.println("Indtast superheltens rigtige navn (fx Peter Parker): ");
        String rigtigenavn = scanner.nextLine();

        System.out.println("Er din superhelt et menneske (true/false): ");
        boolean erMenneske = scanner.nextBoolean();

        System.out.println("Indtast superheltens superpower: ");
        String superpower = scanner.nextLine();

        System.out.println("Indtast det år superhelten blev skabt: ");
        int skabelsesÅr = scanner.nextInt();

        System.out.println("Indtast superheltens styrke: ");
        boolean styrke = scanner.nextBoolean();




        }



    }
}
