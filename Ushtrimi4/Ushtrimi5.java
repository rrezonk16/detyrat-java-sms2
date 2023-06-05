import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numratTotal = 0;
        int tek = 0;
        int negativ = 0;
        int plotpjestueshme7 = 0;

        System.out.println("Shtypni numrat e plote 32-bit loopa terminohet nese shtypet -5555");

        while (true) {
            numri = input.nextInt();
            
            if (numri == -5555) {
                break;
            }
            
            numratTotal++;

            if (numri % 2 != 0) {
                tek++;
            }

            if (numri < 0) {
                negativ++;
            }

            if (numri % 7 == 0) {
                plotpjestueshme7++;
            }
        }

        if (numratTotal == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + numratTotal + " numra dhe " + tek + " prej tyre jane tek, " + negativ + " jane negativ, dhe " + plotpjestueshme7 + " jane plotpjestueshme me 7.");
        }
    }
}
