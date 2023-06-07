import java.util.ArrayList;
import java.util.List;

public class Skuadra {
    private String emri;
    private List<Futbollisti> futbollistet;

    public Skuadra(String emri, int numriFutbollisteve) {
        this.emri = emri;
        this.futbollistet = new ArrayList<>(numriFutbollisteve);
    }

    public boolean ekziston(Futbollisti futbollisti) {
        return futbollistet.contains(futbollisti);
    }

    public void shtoFutbollistin(Futbollisti futbollisti) {
        if (!futbollistet.contains(futbollisti)) {
            futbollistet.add(futbollisti);
        }
    }

    public Futbollisti avgMaxMosha() {
        int totalMosha = 0;
        for (Futbollisti futbollisti : futbollistet) {
            totalMosha += futbollisti.getMosha();
        }
        double mesatarjaMosha = totalMosha / (double) futbollistet.size();

        Futbollisti futbollistiMaxMosha = null;
        for (Futbollisti futbollisti : futbollistet) {
            if (futbollisti.getMosha() > mesatarjaMosha) {
                futbollistiMaxMosha = futbollisti;
            }
        }
        return futbollistiMaxMosha;
    }

    public List<Futbollisti> ktheFutbollistet(String pozita) {
        List<Futbollisti> rezultati = new ArrayList<>();
        for (Futbollisti futbollisti : futbollistet) {
            if (futbollisti.getPozita().equalsIgnoreCase(pozita)) {
                rezultati.add(futbollisti);
            }
        }
        return rezultati.isEmpty() ? null : rezultati;
    }

    public void fshijFutbollistet(int numriFjaleve) {
        for (int i = futbollistet.size() - 1; i >= 0; i--) {
            Futbollisti futbollisti = futbollistet.get(i);
            String[] fjalet = futbollisti.getEmri().split(" ");
            if (fjalet.length > numriFjaleve && futbollisti.getEmri().length() > 17) {
                futbollistet.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Skuadra skuadra = new Skuadra("Shqiperia", 16);

        // Shto futbollistet
        skuadra.shtoFutbollistin(new Futbollisti("Lorik Cana", "Mbrojtes", 32));
        skuadra.shtoFutbollistin(new Futbollisti("Etrit Berisha", "Portier", 31));
        skuadra.shtoFutbollistin(new Futbollisti("Elseid Hysaj", "Mbrojtes", 27));
        skuadra.shtoFutbollistin(new Futbollisti("Keidi Bare", "Mesfushor", 24));
        skuadra.shtoFutbollistin(new Futbollisti("Odise Roshi", "Rajon", 30));
        skuadra.shtoFutbollistin(new Futbollisti("Rey Manaj", "Sulmues", 24));

        Futbollisti futbollisti = new Futbollisti("Lorik Cana", "Mbrojtes", 32);
        System.out.println("Futbollisti ekziston: " + skuadra.ekziston(futbollisti));

        Futbollisti futbollistiMaxMosha = skuadra.avgMaxMosha();
        System.out.println("Futbollisti me moshen me te madhe: " + futbollistiMaxMosha);

        List<Futbollisti> futbollistetPortier = skuadra.ktheFutbollistet("Portier");
        System.out.println("Futbollistet e pozites Portier: " + futbollistetPortier);

        skuadra.fshijFutbollistet(3);
        System.out.println("Futbollistet pas fshirjes: " + skuadra.futbollistet);
    }
}
