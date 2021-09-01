class Rechteck {
    private double laenge;
    private double breite;
    private double flaeche;

    public void setLaenge(double l) {
        laenge = l;
    }

    public void setBreite(double b) {
        breite = b;
    }

    public double rechneFlaeche() {
        flaeche = laenge * breite;
        return flaeche;
    }
}
