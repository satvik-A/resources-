package swing;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;

class jtextbox {
    public static void main(String[] args) {
        framel f = new framel();

        JButton b = new JButton("button");
        // b.setBounds(10, 10, 100, 100);
        f.add(b);

        // JTextField = is a GUI textbox that can be used to add / set / get text

        JTextField tf = new JTextField();
        // tf.setBounds(200, 200, 100, 30);
        // sets the size of the textfeild in different layou managers
        tf.setPreferredSize(new Dimension(250, 10));

        // visit bro code full corse for all functinalitys

        f.add(tf);
        f.pack();
        f.setVisible(true);

    }

}