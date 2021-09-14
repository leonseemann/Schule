package RechteckNeu;

class RechteckNeu {
    private double laenge;
    private double breite;

    public RechteckNeu() {
        laenge = 1;
        breite = 1;
    }

    public RechteckNeu(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public double rechneFlaeche() {
        double flaeche = laenge * breite;
        return flaeche;
    }
}
