import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numraTotal = 0;
        int shumefishet = 0;

        System.out.println("Shtypni numra te plote loopa terminohet me -7777");

        while (true) {
            numri = input.nextInt();

            if (numri == -7777) {
                break;
            }

            numraTotal++;

            if (numri % 4 == 0 && numri % 8 == 0) {
                shumefishet++;
            }
        }

        System.out.println("Numri total i numrave shtypur: " + numraTotal);
        System.out.println("Numri i numrave shumefish te 4 dhe 8: " + shumefishet);
    }
}
