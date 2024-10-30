package swing;

import java.awt.*;
import javax.swing.*;

class pannel {

    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("/Users/aderlasatvik/Downloads/java/practice/src/swing/ .png");

        // panel 1
        JPanel panel1 = new JPanel();
        panel1.setBackground((new Color(0xDDFF23)));
        panel1.setBounds(30, 0, 1300, 770);

        // panel 2
        JPanel panel2 = new JPanel();
        panel2.setBackground((new Color(0x00FF00)));
        panel2.setBounds(0, 700, 1300, 770);

        // label
        JLabel label = new JLabel("Hello, World!");
        label.setIcon(image);
        label.setFont(new Font("Geneva", Font.BOLD, 20));
        label.setBounds(10, 20, 1080, 450);

        // frame settings
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1300, 900);
        frame.getContentPane().setBackground(new Color(0xFFDFDD));

        frame.setLayout(null);
        panel1.setLayout(null);

        // adding label and panel1 to frame
        panel1.add(label);
        frame.add(panel2);
        frame.add(panel1);
    }
}