class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch() {
        this(3);
    }

    public Bruch(int z) {
        this(z, 1);
    }

    public Bruch(int z, int n) {
        if (n <= 0) {
            n = 1;
        }

        zaehler = z;
        nenner = n;
    }

    public double ausgabeDezimal() {
        double dezimal = (double) zaehler / (double) nenner;
        return dezimal;
    }

    public void ausgabeBruch() {
        System.out.println(zaehler + "/" + nenner);
    }

    public Bruch addition(Bruch b) {
        Bruch ausgabeB = new Bruch();

        ausgabeB.zaehler = this.zaehler * b.zaehler + b.nenner * this.nenner;

        ausgabeB.nenner = this.nenner * b.nenner;

        return ausgabeB;
    }

    public Bruch subtraktion(Bruch b) {
        Bruch ausgabeB = new Bruch();

        ausgabeB.zaehler = this.zaehler * b.zaehler - b.nenner * this.nenner;

        ausgabeB.nenner = this.nenner * b.nenner;

        return ausgabeB;
    }

    public Bruch multiplikation(Bruch b) {
        Bruch ausgabeB = new Bruch(this.zaehler * b.zaehler, this.nenner * b.nenner);

        return ausgabeB;
    }

    public Bruch dividieren(Bruch b) {
        Bruch ausgabeB = new Bruch(this.zaehler * b.nenner, this.nenner * b.zaehler);

        return ausgabeB;
    }
}