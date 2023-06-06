import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String sentence;

        System.out.println("Shtypni fjali loopa terminohet me EXIT");

        while (true) {
            sentence = sc.nextLine();

            if (sentence.equals("EXIT")) {
                break;
            }

            if (sentence.endsWith("A")) {
                count++;
            }
        }

        System.out.println("Numri i fjalive qe perfundojne me A eshte " + count);
    }
}
