import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numriFjaleve = 0;
        while (numriFjaleve < 5) {
            System.out.print("Shkruani numrin e fjaleve/fjalive: ");
            numriFjaleve = input.nextInt();

            if (numriFjaleve < 5) {
                System.out.println("Numri i fjaleve/fjalive duhet te jete se paku 5.");
            }
        }

        String[] varguFjaleve = new String[numriFjaleve];
        for (int i = 0; i < numriFjaleve; i++) {
            System.out.print("Shkruani fjalen/fjaline e " + (i + 1) + ": ");
            varguFjaleve[i] = input.next();
        }

        int fjaleTePlotesuara = myMethod(varguFjaleve);
        int gjatesiaMesatare = fjaleTePlotesuara > 0 ? myMethod(varguFjaleve) / fjaleTePlotesuara : 0;

        System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjali dhe " + fjaleTePlotesuara +
                " prej tyre e plotesojne kushtin.");
        System.out.println("Gjatesia mesatare e fjaleve/fjalive qe permbajne 'ubt' dhe nuk fillojne me SHKI eshte: " +
                gjatesiaMesatare);

        input.close();
    }

    public static int myMethod(String[] varguFjaleve) {
        int fjaleTePlotesuara = 0;
        int gjatesiaFjaleve = 0;
    
        for (String fjala : varguFjaleve) {
            if (fjala.contains("ubt") && !fjala.toUpperCase().startsWith("SHKI")) {
                fjaleTePlotesuara++;
                gjatesiaFjaleve += fjala.length();
            }
        }
    
        return fjaleTePlotesuara;
    }
    
    
}
