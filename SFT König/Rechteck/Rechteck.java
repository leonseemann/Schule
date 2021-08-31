class Rechteck {
    private Double breite;
    private Double laenge;
    private Double flaeche;

    public void setLaenge(double l){
        laenge = l;
    }

    public void setBreite(double b){
        breite = b; 
    }

    public Double rechneFlaeche(){
        flaeche = laenge * breite;
        return flaeche;
    }
}
