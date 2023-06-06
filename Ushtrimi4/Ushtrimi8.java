import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int fjaliTotal = 0;

        System.out.println("Shtypni fjali loopa terminohet me EXIT");

        while (true) {
            fjalia = input.nextLine();

            if (fjalia.equals("EXIT")) {
                break;
            }

            if (fjalia.contains("CSE")) {
                fjaliTotal++;
            }
        }

        System.out.println("Numri total i fjaleve qe permbajne 'CSE': " + fjaliTotal);
    }
}
