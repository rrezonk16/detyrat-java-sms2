import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int numratTotal = 0;
        int shumefishet = 0;

        System.out.println("Shtypni numrat te plote loopa terminohet nese shtypet -9999");

        while (true) {
            numri = input.nextInt();
            
            if (numri == -9999) {
                break;
            }
            
            numratTotal++;

            if (numri % 4 == 0 && numri % 8 == 0) {
                shumefishet++;
            }
        }

        System.out.println("Numrat e shtypur gjithsej: " + numratTotal);
        System.out.println("Shumefish i 4 dhe 8 jane " + shumefishet+" numra");
    }
}
