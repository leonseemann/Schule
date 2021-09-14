class Datum_main {
    public static void main(String[] arg) {
        Datum datum = new Datum();
        datum.ausgabeDatum();
        
        System.out.println(datum.istSchaltjahr());
        System.out.println(datum.pruefeTag());
        System.out.println(datum.pruefeMonat());
    }
}