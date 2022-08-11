import java.lang.Math;

class Kugel {
    private double radius;
    private double oberflaeche;

    public void raechneOberflaeche() {
        this.oberflaeche = 4*Math.PI*(radius*radius);
    }

    public double get_radius() {
        return radius;
    }

    public void ausgabe() {
        System.out.println("Oberflaeche" + oberflaeche);
        System.out.println("Radius" + radius);
    }

    public void set_radius(double r) {
        this.radius = r;
    }



    public Kugel() {
        this(1.0);
    }

    public Kugel(double r) {
        this(r, 1.0);
    }

    public Kugel(double r, double o) {
        if (r <= 0) {
            radius = 1.0;
        } else {
            radius = r;
        }


        raechneOberflaeche();
        if (o != oberflaeche) {
            System.out.println("Oberflaeche wurde falsch berechnet");
        }
    }
}


