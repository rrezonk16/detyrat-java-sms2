import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int fjaliTotal = 0;

        System.out.println("Shtypni fjali loopa terminohet me FUND");

        while (true) {
            fjalia = input.nextLine();

            if (fjalia.equals("FUND")) {
                break;
            }

            fjaliTotal++;
        }

        System.out.println("Numri total i fjaleve te shtypura: " + fjaliTotal);
    }
}
