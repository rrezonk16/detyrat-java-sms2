import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numriFjaleve;

        do {
            System.out.print("Shtyp numrin e fjaleve/fjalive (te pakten 10): ");
            numriFjaleve = scanner.nextInt();
        } while (numriFjaleve < 10);

        scanner.nextLine();

        String[] varguFjaleve = new String[numriFjaleve];

        for (int i = 0; i < numriFjaleve; i++) {
            System.out.print("Shtyp fjalen/fjalin e " + (i + 1) + ": ");
            varguFjaleve[i] = scanner.nextLine();
        }

        int numriFjaleveTePlotesuara = numeroSimbolet(varguFjaleve);

        System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjali dhe " + numriFjaleveTePlotesuara + " prej tyre e plotesojne kushtin.");
    }

    public static int numeroSimbolet(String[] varguFjaleve) {
        int count = 0;

        for (String fjalia : varguFjaleve) {
            if (!fjalia.matches(".*[-+*/%].*") && fjalia.length() >= 6 && fjalia.length() <= 15) {
                count++;
            }
        }

        return count;
    }
}
