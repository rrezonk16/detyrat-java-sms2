import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numraTotal = 0;
        int kushti=0;

        System.out.println("Shtypni numra te plote 32-bit loopa terminohet me -1111");

        while (true) {
            numri = input.nextInt();

            if (numri == -1111) {
                break;
            }

            numraTotal++;

            if (numri % 2 != 0 && numri < 0 && numri % 7 == 0){
                kushti++;
            }
        }

        if (numraTotal == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + numraTotal + " numra");
            System.out.println("Prej tyre, "+kushti+" plotesojne kushtin");
        }
    }
}
