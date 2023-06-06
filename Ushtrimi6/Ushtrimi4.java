import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shtyp sa numra do te shtypen: ");
        int numriNumrave = scanner.nextInt();

        if (numriNumrave >= 5) {
            int shtypur = 0;
            int maxCiftPozitiv = Integer.MIN_VALUE;

            for (int i = 0; i < numriNumrave; i++) {
                System.out.print("Shtyp numrin e " + (i + 1) + ": ");
                int numri = scanner.nextInt();

                if (numri % 2 == 0 && numri > 0 && numri > maxCiftPozitiv) {
                    maxCiftPozitiv = numri;
                }

                shtypur++;
            }

            if (maxCiftPozitiv == Integer.MIN_VALUE) {
                System.out.println("Nuk eshte shtypur asnje numer cift pozitiv!");
            } else {
                System.out.println("Jane shtypur gjithsej " + shtypur + " numra dhe " +
                        maxCiftPozitiv + " ishte numri me i madh tek pozitiv.");
            }
        } else {
            System.out.println("Ju duhet te shtypni te pakten 5 numra.");
        }
    }
}
