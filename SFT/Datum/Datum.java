class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public void ausgabeDatum() {
        tag = 1;
        monat = 1;
        jahr = 1;

        System.out.println("`D`: " + tag + "." + monat + "." + jahr);
        System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
        System.out.println("`A`: " + tag + "-" + monat + "-" + tag);
    }

    public void ausgabeDatum(char t, char m, char j) {
        tag = t;
        monat = m;
        jahr = j;

        System.out.println("`D`: " + tag + "." + monat + "." + jahr);
        System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
        System.out.println("`A` :" + tag + "-" + monat + "-" + tag);
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
