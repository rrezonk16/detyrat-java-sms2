import java.util.ArrayList;
import java.util.List;

public class Shteti {
    private String emri;
    private List <Qyteti> qytetet;

    public Shteti(String emri, int numriQyteteve) {
        this.emri = emri;
        this.qytetet = new ArrayList<>(numriQyteteve);
    }

    public boolean ekziston(Qyteti qyteti) {
        return qytetet.contains(qyteti);
    }

    public void shtoQytetin(Qyteti qyteti) {
        if (!qytetet.contains(qyteti)) {
            qytetet.add(qyteti);
        }
    }

    public void shtypQytetet(char shkronja) {
        for (Qyteti qyteti : qytetet) {
            if (qyteti.getEmri().charAt(0) == shkronja) {
                System.out.println(qyteti);
            }
        }
    }

    public List<Qyteti> ktheQytetet(int popullsia) {
        List<Qyteti> rezultati = new ArrayList<>();
        for (Qyteti qyteti : qytetet) {
            if (qyteti.getPopullsia() > popullsia) {
                rezultati.add(qyteti);
            }
        }
        return rezultati;
    }

    public void fshijQytetet(int popullsia) {
        qytetet.removeIf(qyteti -> qyteti.getPopullsia() < popullsia);
    }

    public static void main(String[] args) {
        Shteti shteti = new Shteti("Kosova", 10);
        
        shteti.shtoQytetin(new Qyteti("30000", "Peje", 90000));
        shteti.shtoQytetin(new Qyteti("30001", "Prishtine", 500000));
        shteti.shtoQytetin(new Qyteti("30002", "Gjilan", 75000));
        
        Qyteti qyteti = new Qyteti("30000", "Peje", 90000);
        System.out.println("Qyteti ekziston: " + shteti.ekziston(qyteti));
        
        shteti.shtypQytetet('P');
        
        List<Qyteti> qytetetMePopullsineMbi100000 = shteti.ktheQytetet(100000);
        System.out.println("Qytetet me popullsine me te madhe se 100000: " + qytetetMePopullsineMbi100000);
        
        shteti.fshijQytetet(50000);
        System.out.println("Qytetet pas fshirjes: " + shteti.qytetet);
    }
}
