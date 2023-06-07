import java.util.ArrayList;
import java.util.List;

public class Kompania {
    private String emri;
    private List<Punetori> punetoret;

    public Kompania(String emri, int numriPunetoreve) {
        this.emri = emri;
        punetoret = new ArrayList<>(numriPunetoreve);
    }

    public boolean ekziston(Punetori punetori) {
        return punetoret.contains(punetori);
    }

    public void shtoPunetorin(Punetori punetori) {
        if (!ekziston(punetori)) {
            punetoret.add(punetori);
            System.out.println("Punetori u shtua me sukses!");
        } else {
            System.out.println("Punetori ekziston tashme ne kompani!");
        }
    }

    public void shtypDepartamentin(String departamenti) {
        System.out.println("Punetoret ne departamentin " + departamenti + ":");
        for (Punetori punetori : punetoret) {
            if (punetori.getDepartamenti().equals(departamenti)) {
                System.out.println(punetori.toString());
            }
        }
    }

    public Punetori[] kthePunetoret() {
        if (punetoret.size() < 2) {
            return null;
        }
        Punetori[] punetoretArray = new Punetori[punetoret.size()];
        punetoretArray = punetoret.toArray(punetoretArray);
        Punetori punetoriMeIRi = punetoretArray[0];
        Punetori punetoriMeIVjeter = punetoretArray[0];
        for (int i = 1; i < punetoretArray.length; i++) {
            if (punetoretArray[i].getMosha() > punetoriMeIRi.getMosha()) {
                punetoriMeIRi = punetoretArray[i];
            }
            if (punetoretArray[i].getMosha() < punetoriMeIVjeter.getMosha()) {
                punetoriMeIVjeter = punetoretArray[i];
            }
        }
        Punetori[] punetoretEKthyer = {punetoriMeIRi, punetoriMeIVjeter};
        return punetoretEKthyer;
    }

    public static void main(String[] args) {
        Kompania kompania = new Kompania("KompaniaX", 20);
        Punetori punetori1 = new Punetori("Filan Fisteku", 33, "Teknologjia Informative");
        Punetori punetori2 = new Punetori("Ali Krasniqi", 40, "Shitje");
        Punetori punetori3 = new Punetori("Gent Bytyci", 28, "Finanaca");

        kompania.shtoPunetorin(punetori1);
        kompania.shtoPunetorin(punetori2);
        kompania.shtoPunetorin(punetori3);

        boolean ekzistonPunetori = kompania.ekziston(new Punetori("Filan Fisteku", 33, "Teknologjia Informative"));
        System.out.println("Ekziston puntori 'Filan Fisteku - 33 : Teknologjia Informative'? " + ekzistonPunetori);

        kompania.shtypDepartamentin("Teknologjia Informative");
        Punetori[] punetoret = kompania.kthePunetoret();
        if (punetoret != null) {
            System.out.println("Puntori me i ri: " + punetoret[0].toString());
            System.out.println("Puntori me i vjeter: " + punetoret[1].toString());
        } else {
            System.out.println("Nuk ka se paku dy puntore ne varg.");
        }
    }
}
