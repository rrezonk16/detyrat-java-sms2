public class Punetori {
    private final String emri;
    private int mosha;
    private String departamenti;

    public Punetori(String emri, int mosha, String departamenti) {
        this.emri = emri;
        this.mosha = mosha;
        this.departamenti = departamenti;
    }

    public String getEmri() {
        return emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String departamenti) {
        this.departamenti = departamenti;
    }

    @Override
    public String toString() {
        return emri + " - " + mosha + " : " + departamenti;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Punetori punetori = (Punetori) obj;
        return emri.equals(punetori.emri) && mosha == punetori.mosha;
    }
}
