import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Shtypni fjali loopa terminohet me STOP");

        while (true) {
            String Fjalia = input.nextLine();

            if (Fjalia.equals("STOP")) {
                break;
            }

            if (Fjalia.contains("SHK")) {
                count++;
            }
        }

        System.out.println("Numri i fjalive qe permbajne fjalen 'SHK': " + count);
    }
}
