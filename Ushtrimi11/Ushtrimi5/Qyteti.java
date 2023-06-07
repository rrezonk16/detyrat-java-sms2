public class Qyteti {
    private final String kodi;
    private String emri;
    private int popullsia;

    public Qyteti(String kodi, String emri, int popullsia) {
        this.kodi = kodi;
        this.emri = emri;
        this.popullsia = popullsia;
    }

    public String getKodi() {
        return kodi;
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
        return kodi + " - " + emri + ": " + popullsia;
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
        return kodi.equals(qyteti.kodi);
    }
}
