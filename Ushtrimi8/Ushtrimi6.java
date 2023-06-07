import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp numrin e fjaleve/fjalive qe do te shtypen: ");
        int numriFjaleve = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer

        if (numriFjaleve >= 5) {
            String[] varguFjaleve = new String[numriFjaleve];

            for (int i = 0; i < numriFjaleve; i++) {
                System.out.print("Shtyp fjaline/fjalen e " + (i + 1) + ": ");
                varguFjaleve[i] = scanner.nextLine();
            }

            int fjaleTePlotesuara = myMethod(varguFjaleve);
            System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjali dhe " + fjaleTePlotesuara + " prej tyre e plotesojne kushtin.");
        } else {
            System.out.println("Ju duhet te shtypni te pakten 5 fjale/fjali.");
        }
    }

    public static int myMethod(String[] varguFjaleve) {
        int fjaleTePlotesuara = 0;
        int gjatesiaTotale = 0;
        int numriFjaleveTePlotesuara = 0;

        for (String fjala : varguFjaleve) {
            if (fjala.contains("ubt") && !fjala.toLowerCase().startsWith("shki")) {
                fjaleTePlotesuara++;
                gjatesiaTotale += fjala.length();
            }
        }

        if (fjaleTePlotesuara > 0) {
            numriFjaleveTePlotesuara = gjatesiaTotale / fjaleTePlotesuara;
        }

        return numriFjaleveTePlotesuara;
    }
}
