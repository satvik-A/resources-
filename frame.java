package swing;

import java.awt.Color;
import javax.swing.*;

public class frame extends JFrame {
    public frame() {
        this.setVisible(true); // sets visibulity
        this.setSize(1580, 980);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Swing"); // application / this tittle
        this.setBackground(new Color(0xFFDFdd));
        this.getContentPane().setBackground(new Color(255, 200, 210));
        this.setLayout(null);

    }
}
