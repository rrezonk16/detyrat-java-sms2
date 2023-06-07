public class Qyteti {
    private final String kod;
    private String emri;
    private int popullsia;

    public Qyteti(String kod, String emri, int popullsia) {
        this.kod = kod;
        this.emri = emri;
        this.popullsia = popullsia;
    }

    public String getKod() {
        return kod;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getPopullsia() {
        return popullsia;
    }

    public void setPopullsia(int popullsia) {
        this.popullsia = popullsia;
    }

    @Override
    public String toString() {
        return kod + " - " + emri + " : " + popullsia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Qyteti qyteti = (Qyteti) obj;
        return kod.equals(qyteti.kod);
    }

    public static void main(String[] args) {
        Qyteti qyteti1 = new Qyteti("001", "Tirana", 800000);
        Qyteti qyteti2 = new Qyteti("002", "Prishtina", 500000);
        Qyteti qyteti3 = new Qyteti("003", "Shkupi", 600000);

        System.out.println(qyteti1.getEmri());         
        System.out.println(qyteti2.getPopullsia());    
        qyteti3.setEmri("Oher");                      
        System.out.println(qyteti3.toString());        
        System.out.println(qyteti1.equals(qyteti3));    
    }
}
