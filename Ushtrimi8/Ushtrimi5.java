import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numriNumrave;

        do {
            System.out.print("Sa numra do te shtypen te pakten 15: ");
            numriNumrave = scanner.nextInt();
        } while (numriNumrave < 15);

        int[] varguNumrave = new int[numriNumrave];

        for (int i = 0; i < numriNumrave; i++) {
            System.out.print("Shtyp numrin e " + (i + 1) + ": ");
            varguNumrave[i] = scanner.nextInt();
        }

        int numratEPlotesuar = maxMesatarja(varguNumrave);

        System.out.println("Jane shtypur gjithsej " + numriNumrave + " numra dhe " + numratEPlotesuar + " ishte numri me i madh se mesatarja.");
    }

    public static int maxMesatarja(int[] varguNumrave) {
        int sum = 0;
        int count = 0;

        for (int numri : varguNumrave) {
            sum += numri;
            count++;
        }

        double mesatarja = sum / count;
        int maxNumri = Integer.MIN_VALUE;

        for (int numri : varguNumrave) {
            if (numri > mesatarja && numri > maxNumri) {
                maxNumri = numri;
            }
        }

        return maxNumri;
    }
}
