package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

class layeredpanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layered Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 800);
        frame.setBackground(new Color(0xFFDFDD));
        frame.getContentPane().setBackground(new Color(255, 200, 210));

        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 10, 180, 180);
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.CYAN);
        panel2.setBounds(150, 300, 180, 80);
        panel2.add(new JButton("Button 4"));
        panel2.add(new JButton("Button 5"));

        // *******

        // to set different placements
        frame.add(panel, Integer.valueOf(2));
        frame.add(panel2, Integer.valueOf(1));
        // Integer.valueOf(2) make it apper in order of the n.o higher the n.o on top it
        // will be

        frame.setVisible(true);
    }
}