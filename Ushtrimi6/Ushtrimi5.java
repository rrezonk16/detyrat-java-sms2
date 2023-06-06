import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp numrin e fjaleve/fjalive qe do te shtypen: ");
        int numriFjaleve = scanner.nextInt();
        scanner.nextLine(); // Pastro buffer-in e skanerit

        if (numriFjaleve >= 7) {
            String fjaliaMin = null;

            for (int i = 0; i < numriFjaleve; i++) {
                System.out.print("Shtyp fjaline/fjalen e " + (i + 1) + ": ");
                String fjalia = scanner.nextLine();

                if (fjaliaMin == null || fjalia.length() < fjaliaMin.length()) {
                    fjaliaMin = fjalia;
                }
            }

            System.out.println("Fjalia me e shkurter eshte " + fjaliaMin);
        } else {
            System.out.println("Ju duhet te shtypni te paktën 7 fjale/fjali.");
        }
    }
}
