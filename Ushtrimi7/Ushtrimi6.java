import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp numrin e fjaleve/fjalive qe do te shtypen: ");
        int numriFjaleve = scanner.nextInt();
        scanner.nextLine();

        if (numriFjaleve >= 7) {
            int count = 0;

            for (int i = 0; i < numriFjaleve; i++) {
                System.out.print("Shtyp fjalen/fjalin e " + (i + 1) + ": ");
                String fjalia = scanner.nextLine();

                if (countTest(fjalia)) {
                    count++;
                }
            }

            System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjali dhe " + count + " prej tyre e plotesojne kushtin.");
        } else {
            System.out.println("Ju duhet te shtypni te pakten 7 fjale/fjali.");
        }
    }

    public static boolean countTest(String fjalia) {
        boolean fillonMeShkronjeMadhe = Character.isUpperCase(fjalia.charAt(0));
        boolean perfundonMeNumer = Character.isDigit(fjalia.charAt(fjalia.length() - 1));
        boolean permbanCSE = fjalia.toLowerCase().contains("cse");

        return fillonMeShkronjeMadhe && perfundonMeNumer && permbanCSE;
    }
}
