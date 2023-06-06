import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int fjaliTotal = 0;

        System.out.println("Shtypni fjali loopa terminohet me END");

        while (true) {
            fjalia = input.nextLine();

            if (fjalia.equals("END")) {
                break;
            }

            if (fjalia.endsWith("a") || fjalia.endsWith("A")) {
                fjaliTotal++;
            }
        }

        System.out.println("Numri total i fjaleve qe perfundojne me 'a' ose 'A': " + fjaliTotal);
    }
}
