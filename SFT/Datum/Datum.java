class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public void ausgabeDatum() {
        this.tag = 1;
        this.monat = 1;
        this.jahr = 1;

        System.out.println("`D`: " + tag + "." + monat + "." + jahr);
        System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
        System.out.println("`A`: " + tag + "-" + monat + "-" + jahr);
    }

    public void ausgabeDatum(int t, int m, int j) {
        this.tag = t;
        this.monat = m;
        this.jahr = j;

        System.out.println("`D`: " + tag + "." + monat + "." + jahr);
        System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
        System.out.println("`A`: " + tag + "-" + monat + "-" + jahr);
    }

    public boolean istSchaltjahr() {
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pruefeTag() {
        if (tag >= 1 && tag <= 31) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pruefeMonat() {
        if (monat >= 1 && monat <= 12) {
            return true;
        } else {
            return false;
        }
    }
}
