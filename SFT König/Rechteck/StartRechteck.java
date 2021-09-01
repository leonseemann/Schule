import java.util.Scanner;

class StartRechteck {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Rechteck rechteck = new Rechteck();
        
        System.out.println("Eingabe L\u00e4nge(cm): ");
        double l = input.nextDouble();
        rechteck.setLaenge(l);

        System.out.println("Eingabe Breite(cm): ");
        double b = input.nextDouble();
        rechteck.setBreite(b);

        System.out.print("\033\143");

        System.out.println("L\u00e4nge: " + l + " cm");
        System.out.println("Breite: " + b + " cm");
        System.out.println("Fl\u00e4che: " + rechteck.rechneFlaeche() + " cm^2");
    }
}
