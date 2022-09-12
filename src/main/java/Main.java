import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        //Udprinter velkomst
        System.out.println("Velkommen til superhelte universet!!!");

        System.out.print("Indtast navnet på din superhelt (fx spiderman): ");
        String superheltnavn = scanner.nextLine();

        System.out.print("Indtast superheltens rigtige navn (fx Peter Parker): ");
        String rigtigenavn = scanner.nextLine();

        System.out.print("Er din superhelt et menneske (true/false): ");
        boolean erMenneske = scanner.nextBoolean();

        System.out.print("Indtast superheltens superpower: ");
        String superpower = scanner.nextLine();

        System.out.print("Indtast det år superhelten blev skabt: ");
        int skabelsesÅr = scanner.nextInt();

        System.out.print("Indtast superheltens styrke: ");
        double styrke = scanner.nextDouble();


    }




    }

