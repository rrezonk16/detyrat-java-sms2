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
        if (!(obj instanceof Qyteti)) {
            return false;
        }
        Qyteti qyteti = (Qyteti) obj;
        return kod.equals(qyteti.getKod());
    }
}
