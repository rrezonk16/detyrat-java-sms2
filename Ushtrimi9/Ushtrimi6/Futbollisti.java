public class Futbollisti {
    private final String emri;
    private String pozita;
    private int mosha;

    public Futbollisti(String emri, String pozita, int mosha) {
        this.emri = emri;
        this.pozita = pozita;
        this.mosha = mosha;
    }

    public String getEmri() {
        return emri;
    }

    public String getPozita() {
        return pozita;
    }

    public void setPozita(String pozita) {
        this.pozita = pozita;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return emri + " : " + mosha + " - " + pozita;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Futbollisti futbollisti = (Futbollisti) obj;
        return emri.equals(futbollisti.emri) && pozita.equals(futbollisti.pozita) && mosha == futbollisti.mosha;
    }

    public static void main(String[] args) {
        Futbollisti futbollisti1 = new Futbollisti("Ibrahimovic", "Sulmues", 36);
        Futbollisti futbollisti2 = new Futbollisti("Messi", "Mesfushor", 34);
        Futbollisti futbollisti3 = new Futbollisti("Casillas", "Portier", 29);

        System.out.println(futbollisti1.getEmri());         
        System.out.println(futbollisti2.getMosha());        
        futbollisti3.setPozita("Mesfushor");                 
        System.out.println(futbollisti3.toString());   
        System.out.println(futbollisti1.equals(futbollisti3));    
    }
}
