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

    public static void main(String[] args) {
       Punetori punetori1 = new Punetori("Filan Fisteku", 33, "Teknologjia Informative");
        Punetori punetori2 = new Punetori("Ali Krasniqi", 40, "Shitje");
        Punetori punetori3 = new Punetori("Gent Bytyci", 28, "Finanaca");

        System.out.println(punetori1.getEmri());         
        System.out.println(punetori2.getMosha());        
        punetori3.setDepartamenti("Shitje");         
        System.out.println(punetori3.toString());        
        System.out.println(punetori1.equals(punetori3));    
    }
}
