import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp numrin e fjaleve/fjalive qe do te shtypen: ");
        int numriFjaleve = scanner.nextInt();
        scanner.nextLine(); 

        if (numriFjaleve >= 5) {
            String fjaliaMeEgjate = "";

            for (int i = 0; i < numriFjaleve; i++) {
                System.out.print("Shtyp fjalen/fjalin e " + (i + 1) + ": ");
                String fjalia = scanner.nextLine();

                if (fjalia.length() > fjaliaMeEgjate.length()) {
                    fjaliaMeEgjate = fjalia;
                }
            }

            System.out.println("Fjalia me e gjate eshte: " + fjaliaMeEgjate);
        } else {
            System.out.println("Ju duhet te shtypni te pakten 5 fjale/fjali.");
        }
    }
}
