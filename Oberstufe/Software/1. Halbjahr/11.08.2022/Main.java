import java.awt.*;

public class Main extends Frame{

    public Main() {
        setBackground(new Color(255, 0 ,0));
        setTitle("Fenster");
        setSize(300,150);
        addWindowListener(new MeinWA());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
