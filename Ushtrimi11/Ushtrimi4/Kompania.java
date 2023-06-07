public class Kompania {
    private String emri;
    private Punetori[] punetoret;

    public Kompania(String emri, int numriPunetoreve) {
        this.emri = emri;
        this.punetoret = new Punetori[numriPunetoreve];
    }

    public boolean ekziston(Punetori punetori) {
        for (Punetori p : punetoret) {
            if (p != null && p.equals(punetori)) {
                return true;
            }
        }
        return false;
    }

    public void shtoPunetorin(Punetori punetori) {
        if (!ekziston(punetori)) {
            for (int i = 0; i < punetoret.length; i++) {
                if (punetoret[i] == null) {
                    punetoret[i] = punetori;
                    break;
                }
            }
        }
    }

    public void shtypDepartamentin(String departamenti) {
        for (Punetori punetori : punetoret) {
            if (punetori != null && punetori.getDepartamenti().equals(departamenti)) {
                System.out.println(punetori.toString());
            }
        }
    }

    public Punetori[] kthePunetoret() {
        if (punetoret.length >= 2) {
            Punetori punetoriIRi = punetoret[0];
            Punetori punetoriIVjeter = punetoret[0];
            for (Punetori punetori : punetoret) {
                if (punetori != null) {
                    if (punetori.getMosha() > punetoriIRi.getMosha()) {
                        punetoriIRi = punetori;
                    }
                    if (punetori.getMosha() < punetoriIVjeter.getMosha()) {
                        punetoriIVjeter = punetori;
                    }
                }
            }
            Punetori[] rezultati = new Punetori[2];
            rezultati[0] = punetoriIVjeter;
            rezultati[1] = punetoriIRi;
            return rezultati;
        } else {
            return null;
        }
    }

    public void fshijPunetoret(char shkronja) {
        for (int i = 0; i < punetoret.length; i++) {
            if (punetoret[i] != null && punetoret[i].getEmri().startsWith(String.valueOf(shkronja))) {
                punetoret[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        Kompania kompania = new Kompania("KompaniaX", 20);

        Punetori punetori1 = new Punetori("Filan Fisteku", 33, "Teknologjia Informative");
        Punetori punetori2 = new Punetori("Rrezon Krasniqi", 19, "Taksa");
        Punetori punetori3 = new Punetori("Alban Gashi", 28, "Finaca");
        Punetori punetori4 = new Punetori("Burim Kryeziu", 30, "Zyra e informacionit");
        Punetori punetori5 = new Punetori("Dafina Bytyci", 29, "Financa");

        kompania.shtoPunetorin(punetori1);
        kompania.shtoPunetorin(punetori2);
        kompania.shtoPunetorin(punetori3);
        kompania.shtoPunetorin(punetori4);
        kompania.shtoPunetorin(punetori5);

        boolean ekzistonPunetori = kompania.ekziston(new Punetori("Filan Fisteku", 33, "Teknologjia Informative"));
        System.out.println("Punetori 'Filan Fisteku - 33 : Teknologjia Informative' ekziston ne kompani: " + ekzistonPunetori);

        System.out.println("Punetoret e departamentit 'Departamenti1':");
        kompania.shtypDepartamentin("Departamenti1");

        Punetori[] punetoretMinMax = kompania.kthePunetoret();
        if (punetoretMinMax != null) {
            System.out.println("Punetori me i ri ne kompani: " + punetoretMinMax[0].toString());
            System.out.println("Punetori me i vjeter ne kompani: " + punetoretMinMax[1].toString());
        } else {
            System.out.println("Nuk ka te dhena per punetoret me te ri dhe me te vjeter ne kompani.");
        }

        char shkronja = 'H';
        kompania.fshijPunetoret(shkronja);
    }
}
