class Datum_main {
    public static void main(String[] arg) {
        Datum datum = new Datum();
        datum.ausgabeDatum(12, 12, 2024);

        System.out.println("Schaltjahr: " + datum.istSchaltjahr());
        System.out.println("Gepruefter Tag: " + datum.pruefeTag());
        System.out.println("Gepruefter Monat" + datum.pruefeMonat());
    }
}