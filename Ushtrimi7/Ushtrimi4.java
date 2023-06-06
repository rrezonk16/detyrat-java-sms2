import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp sa numra do te shtypen: ");
        int numriNumrave = scanner.nextInt();
        scanner.nextLine(); 

        if (numriNumrave >= 7) {
            long minNr = Long.MAX_VALUE;

            for (int i = 0; i < numriNumrave; i++) {
                System.out.print("Shtyp numrin e " + (i + 1) + ": ");
                long numri = scanner.nextLong();

                if (numri < 0 && numri % 2 != 0 && numri < minNr) {
                    minNr = numri;
                }
            }

            if (minNr != Long.MAX_VALUE) {
                System.out.println("Jane shtypur gjithsej " + numriNumrave + " numra dhe " + minNr + " ishte numri me i vogel tek negativ.");
            } else {
                System.out.println("Nuk eshte shtypur asnje numer tek negativ.");
            }
        } else {
            System.out.println("Ju duhet te shtypni te pakten 7 numra.");
        }
    }
}
