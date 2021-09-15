class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public void ausgabeDatum() {
        this.tag = 1;
        this.monat = 1;
        this.jahr = 1;
        char tmp = 'D';

        switch (tmp) {
            case 'D':
                System.out.println("`D`: " + tag + "." + monat + "." + jahr);
                break;

            case 'E':
                System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
                break;

            case 'A':
                System.out.println("`A`: " + tag + "-" + monat + "-" + jahr);
                break;

            default:
                System.out.println("`D`: " + tag + "." + monat + "." + jahr);
                break;
        }
    }

    public void ausgabeDatum(char tmp, int t, int m, int j) {
        this.tag = t;
        this.monat = m;
        this.jahr = j;

        switch (tmp) {
            case 'D':
                System.out.println("`D`: " + tag + "." + monat + "." + jahr);
                break;

            case 'E':
                System.out.println("`E`: " + jahr + "-" + monat + "-" + tag);
                break;

            case 'A':
                System.out.println("`A`: " + tag + "-" + monat + "-" + jahr);
                break;

            default:
                System.out.println("`D`: " + tag + "." + monat + "." + jahr);
                break;
        }
    }

    public boolean istSchaltjahr() {
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pruefeTag() {
        int tage = 0;

        switch (monat) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tage = 31;
                break;

            case 2:
                if (istSchaltjahr()) {
                    tage = 29;
                } else {
                    tage = 28;
                }
                break;

            default:
                tage = 30;
                break;
        }

        if (tag >= 1 && tag <= tage) {
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
