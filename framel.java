package swing;

import java.awt.*;
import javax.swing.JFrame;

public class framel extends JFrame {
    public framel() {
        this.setVisible(true); // sets visibulity
        this.setSize(1580, 980);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Swing with layout"); // application / this tittle
        this.setBackground(new Color(0xFFDFdd));
        this.getContentPane().setBackground(new Color(255, 200, 210));
    }
}