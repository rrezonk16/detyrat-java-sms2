public class Skuadra {
    private String emri;
    private Futbollisti[] futbollistet;

    public Skuadra(String emri, int numriFutbollisteve) {
        this.emri = emri;
        futbollistet = new Futbollisti[numriFutbollisteve];
    }

    public boolean ekziston(Futbollisti futbollisti) {
        for (Futbollisti f : futbollistet) {
            if (f != null && f.equals(futbollisti)) {
                return true;
            }
        }
        return false;
    }

    public void shtoFutbollistin(Futbollisti futbollisti) {
        for (int i = 0; i < futbollistet.length; i++) {
            if (futbollistet[i] == null) {
                futbollistet[i] = futbollisti;
                return;
            }
        }
    }

    public Futbollisti avgMaxMosha() {
        int sum = 0;
        int count = 0;
        int maxMosha = Integer.MIN_VALUE;
        Futbollisti futbollistiMaxMosha = null;

        for (Futbollisti f : futbollistet) {
            if (f != null) {
                sum += f.getMosha();
                count++;

                if (f.getMosha() > maxMosha) {
                    maxMosha = f.getMosha();
                    futbollistiMaxMosha = f;
                }
            }
        }

        if (count > 0) {
            int avg = sum / count;
            if (futbollistiMaxMosha != null && futbollistiMaxMosha.getMosha() > avg) {
                return futbollistiMaxMosha;
            }
        }

        return null;
    }

    public Futbollisti[] ktheFutbollistet(String pozita) {
        int count = 0;
        for (Futbollisti f : futbollistet) {
            if (f != null && f.getPozita().equals(pozita)) {
                count++;
            }
        }

        if (count > 0) {
            Futbollisti[] futbollistetPozita = new Futbollisti[count];
            int index = 0;
            for (Futbollisti f : futbollistet) {
                if (f != null && f.getPozita().equals(pozita)) {
                    futbollistetPozita[index] = f;
                    index++;
                }
            }
            return futbollistetPozita;
        }

        return null;
    }

    public static void main(String[] args) {
        Skuadra skuadra = new Skuadra("Shqiperia", 16);

        Futbollisti futbollisti1 = new Futbollisti("Lorik Cana", "Mbrojtes", 32);
        Futbollisti futbollisti2 = new Futbollisti("Alban Hoxha", "Portier", 29);
        Futbollisti futbollisti3 = new Futbollisti("Ergys Kace", "Mesfushor", 31);
        Futbollisti futbollisti4 = new Futbollisti("Elseid Hysaj", "Mbrojtes", 27);
        Futbollisti futbollisti5 = new Futbollisti("Sokol Cikalleshi", "Raportues", 29);
        Futbollisti futbollisti6 = new Futbollisti("Odise Roshi", "Mesfushor", 34);

        skuadra.shtoFutbollistin(futbollisti1);
        skuadra.shtoFutbollistin(futbollisti2);
        skuadra.shtoFutbollistin(futbollisti3);
        skuadra.shtoFutbollistin(futbollisti4);
        skuadra.shtoFutbollistin(futbollisti5);
        skuadra.shtoFutbollistin(futbollisti6);

        System.out.println("A ekziston futbollisti \"Lorik Cana : Mbrojtes - 32\"?");
        System.out.println(skuadra.ekziston(new Futbollisti("Lorik Cana", "Mbrojtes", 32)));

        System.out.println("Futbollisti me moshen me te madhe se mesatarja e moshave:");
        Futbollisti futbollistiMaxMosha = skuadra.avgMaxMosha();
        if (futbollistiMaxMosha != null) {
            System.out.println(futbollistiMaxMosha.toString());
        } else {
            System.out.println("Nuk ka futbollist me moshen me te madhe se mesatarja.");
        }

        String pozitaTest = "Portier";
        System.out.println("Futbollistet e pozites \"" + pozitaTest + "\":");
        Futbollisti[] futbollistetPozita = skuadra.ktheFutbollistet(pozitaTest);
        if (futbollistetPozita != null) {
            for (Futbollisti f : futbollistetPozita) {
                System.out.println(f.toString());
            }
        } else {
            System.out.println("Nuk ka futbolliste te pozites \"" + pozitaTest + "\".");
        }
    }
}
