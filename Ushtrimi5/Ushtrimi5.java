import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numraTotal = 0;
        int tek = 0;
        int negativ = 0;
        int plotepjestueshme7 = 0;

        System.out.println("Shtypni numra te plote 32-bit loopa terminohet me -1111");

        while (true) {
            numri = input.nextInt();

            if (numri == -1111) {
                break;
            }

            numraTotal++;

            if (numri % 2 == 1) {
                tek++;
            }

            if (numri < 0) {
                negativ++;
            }

            if (numri % 7 == 0) {
                plotepjestueshme7++;
            }
        }

        if (numraTotal == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + numraTotal + " numra");
            System.out.println("Prej tyre, " + tek + " jane tek, " + negativ + " jane negativ dhe " + plotepjestueshme7 + " jane te plotepjestueshme me 7");
        }
    }
}
