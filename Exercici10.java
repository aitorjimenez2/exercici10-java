/*
PSEUDOCODI

INICI
    a: array de 5 enters
    b: array de 5 enters
    resultat: array de 5 enters
    i: enter

    PER i = 0 FINS A 4
          ESCRIURE "Posa un numero per a:"
        LLEGIR a[i]
    FI_PER

    PER i = 0 FINS A 4
        ESCRIURE "Posa un numero per b:"
        LLEGIR b[i]
    FI_PER

    PER i = 0 FINS A 4
        resultat[i] = a[i] + b[i]
    FI_PER

    PER i = 0 FINS A 4
        ESCRIURE "Posició: ", i
        ESCRIURE "a: ", a[i]
        ESCRIURE "b: ", b[i]
        ESCRIURE "Resultat: ", resultat[i]
    FI_PER
FI
*/



public class Exercici10 {
    public static void main(String[] args) {
        Scanner aitor = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introdueix un número per a:");
            a[i] = aitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Introdueix un número per b:");
            b[i] = aitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            resultat[i] = a[i] + b[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Posició: " + i);
            System.out.println("a: " + a[i]);
            System.out.println("b: " + b[i]);
            System.out.println("Resultat: " + resultat[i]);
        }

        aitor.close();
    }
}
