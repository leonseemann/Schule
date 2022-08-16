import java.awt.*;

public class FensterGrid extends Frame {
    public FensterGrid() {
        setLayout(new GridLayout(2, 2));
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        setBackground(new Color(255, 165 ,0));
        setTitle("Fenster Grid");
        setSize(300,150);
        addWindowListener(new MeinWA());
        setVisible(true);
    }
}
