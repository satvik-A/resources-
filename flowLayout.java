package swing.layout;

import java.awt.FlowLayout;
import javax.swing.JButton;

import swing.frame;

class flowLayout {
    public static void main(String[] args) {
        frame f = new frame();

        f.setLayout(new FlowLayout());// it is center by default

        // chosing Flow Layout manager we have
        // LEADING sticks to the left
        // CENTER sticks to the center
        // TRAILING sticks to the right
        f.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        // hgap is horizontal gap b/w buttons or elements
        // vgap is vertical gap b/w buttons or elements

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");
        JButton b7 = new JButton("Button 7");
        JButton b8 = new JButton("Button 8");
        JButton b9 = new JButton("Button 9");
        JButton b10 = new JButton("Button 10");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);

        f.setVisible(true);

        f.add(new JButton("LEADING"));
        f.add(new JButton("CENTER"));
        f.add(new JButton("TRAILING"));

        f.setVisible(true);

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));

        f.setVisible(true);

    }
}