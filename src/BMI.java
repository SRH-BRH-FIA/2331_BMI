import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // E - Eingabe
        System.out.print("Name: ");
        String name = eingabe.nextLine();

        System.out.print("Alter: ");
        int alter = eingabe.nextInt();

        System.out.print("Gewicht [kg]: ");
        double gewicht = eingabe.nextDouble();

        System.out.print("Körpergröße [m]: ");
        double größe = eingabe.nextDouble();

        // V - Verarbeitung
        double bmi = gewicht / (größe * größe);

        // A - Ausgabe
        System.out.println("BMI: " + bmi);

        if (              bmi <= 18.5)
            System.out.println("Untergewicht");
        if (bmi > 18.5 && bmi <= 25)
            System.out.println("Normalgewicht");
        if (bmi > 25   && bmi <= 30)
            System.out.println("Übergewicht");
        if (bmi > 30)
            System.out.println("Adipositas");
    }
}
