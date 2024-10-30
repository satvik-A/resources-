
package swing.layout;

import java.awt.*;
import javax.swing.*;
import swing.frame;

class gridlayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // DISPOSE_ON_CLOSE will make only one frame to close

        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        // rows is n.o of rows
        // columns is no of columns
        // hgap is horizontal margins
        // vgap is vertical margins

        for (int i = 0; i < 9; i++) {
            frame.add(new JButton("Button " + (i + 1)));
        }
        frame.setVisible(true);

        frame f = new frame();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

}