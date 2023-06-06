import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp numrin e fjaleve/fjalive qe do te shtypen: ");
        int numriFjaleve = scanner.nextInt();
        scanner.nextLine();

        if (numriFjaleve >= 17) {
            int count = 0;

            for (int i = 0; i < numriFjaleve; i++) {
                System.out.print("Shtyp fjaline/fjaline e " + (i + 1) + ": ");
                String fjalia = scanner.nextLine();

                if (fjalia.toLowerCase().contains("ubt")) {
                    count++;
                }
            }

            System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjalime dhe " + count + " prej tyre e plotesojne kushtin.");
        } else {
            System.out.println("Ju duhet te shtypni te pakten 17 fjale/fjalime.");
        }
    }
}
