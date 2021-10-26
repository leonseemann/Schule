class StartBruch {
    public static void main(String[] arg) {
        Bruch bruch = new Bruch(3, 5);
        System.out.println(bruch.ausgabeDezimal());
        bruch.ausgabeBruch();

        System.out.println("--------------------------------------------------------");

        Bruch brech = new Bruch(4, 5);
        System.out.println(brech.ausgabeDezimal());
        brech.ausgabeBruch();

        System.out.println("--------------------------------------------------------");

        Bruch g = new Bruch(4, 7);
        System.out.println(brech.ausgabeDezimal());
        brech.ausgabeBruch();

        System.out.println("--------------------------------------------------------");

        g = bruch.addition(brech);
    }
}
