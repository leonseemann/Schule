import java.awt.*;

public class FensterFloat extends Frame {
    public FensterFloat() {
        setLayout(new FlowLayout());
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        setBackground(new Color(255, 165 ,0));
        setTitle("Fenster Float");
        setSize(300,150);
        addWindowListener(new MeinWA());
        setVisible(true);
    }
}
