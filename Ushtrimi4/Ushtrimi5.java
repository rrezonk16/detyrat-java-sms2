import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numratTotal = 0;
        int kushti=0;

        System.out.println("Shtypni numrat e plote 32-bit loopa terminohet nese shtypet -5555");

        while (true) {
            numri = input.nextInt();
            
            if (numri == -5555) {
                break;
            }
            
            numratTotal++;

            if (numri % 2 != 0 && numri < 0 && numri % 7 == 0){
                kushti++;
            }

        }

        if (numratTotal == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + numratTotal + " numra dhe " + kushti + " prej tyre plotesojne kushtin, ");
        }
    }
}
