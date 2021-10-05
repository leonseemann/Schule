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

        int z = this.zaehler * b.zaehler + b.nenner * this.nenner;

        int n = this.nenner * b.nenner;

        ausgabeB.zaehler = z;
        ausgabeB.nenner = n;

        return ausgabeB;
    }
}