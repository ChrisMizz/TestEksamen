import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner regn = new Scanner(System.in);


        System.out.println("Indtast først værdien for højden (H)");
        double Højden = regn.nextDouble();
        System.out.println("Indtast værdien for Grundfladen");
        double Grundflade = regn.nextDouble();

        Regner regner = new Regner(Grundflade, Højden);

        System.out.println("Volumen er: " + regner.sum());

    }
}
