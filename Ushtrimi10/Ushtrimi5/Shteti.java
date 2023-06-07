import java.util.ArrayList;
import java.util.List;

public class Shteti {
    private String emri;
    private List<Qyteti> qytetet;

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
            if (Character.toLowerCase(qyteti.getEmri().charAt(0)) == Character.toLowerCase(shkronja)) {
                System.out.println(qyteti.toString());
            }
        }
    }

    public List<Qyteti> ktheQytetet(int popullsiaMinimale) {
        List<Qyteti> qytetetPopullsiaMbiVleren = new ArrayList<>();
        for (Qyteti qyteti : qytetet) {
            if (qyteti.getPopullsia() > popullsiaMinimale) {
                qytetetPopullsiaMbiVleren.add(qyteti);
            }
        }
        if (qytetetPopullsiaMbiVleren.isEmpty()) {
            return null;
        }
        return qytetetPopullsiaMbiVleren;
    }

    public static void main(String[] args) {
        Shteti shteti = new Shteti("Kosova", 10);
        Qyteti qyteti1 = new Qyteti("30000", "Peje", 90000);
        Qyteti qyteti2 = new Qyteti("40000", "Prishtine", 300000);
        Qyteti qyteti3 = new Qyteti("50000", "Prizren", 120000);

        shteti.shtoQytetin(qyteti1);
        shteti.shtoQytetin(qyteti2);
        shteti.shtoQytetin(qyteti3);

        // Testimi i metodave
        System.out.println("Ekziston qyteti '30000 - Peje : 90000': " + shteti.ekziston(qyteti1));

        System.out.println("Qytetet me emrin qe fillon me shkronjen 'P':");
        shteti.shtypQytetet('P');

        System.out.println("Qytetet me popullsi me te madhe se 100000 banore:");
        List<Qyteti> qytetetPopullsiaMbi100000 = shteti.ktheQytetet(100000);
        if (qytetetPopullsiaMbi100000 != null) {
            for (Qyteti qyteti : qytetetPopullsiaMbi100000) {
                System.out.println(qyteti.toString());
            }
        } else {
            System.out.println("Nuk ka asnje qytet me popullsi me te madhe se 100000 banore.");
        }
    }
}
