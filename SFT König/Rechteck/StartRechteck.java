import java.util.Scanner;

class StartRechteck {
    public static void main(String[]arg){
        Scanner myObj = new Scanner(System.in);
        Rechteck rechteck = new Rechteck();

        System.out.println("Eingabe Laenge: ");
        double l = myObj.nextDouble();
        rechteck.setLaenge(l);

        System.out.println("Eingabe Breite: ");
        double b = myObj.nextDouble();
        rechteck.setBreite(b);

        System.out.println("Länge: " + l);
        System.out.println("Breite: " + b);
        System.out.println("Fläche: " + rechteck.rechneFlaeche());
    }
}