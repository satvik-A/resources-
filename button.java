package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class button implements ActionListener {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(
                "/Users/aderlasatvik/Downloads/java/practice/src/swing/Screenshot 2024-10-23 at 11.08.18 AM.png");

        frame f1 = new frame();

        // creating a button
        JButton b1 = new JButton("Click me");
        f1.add(b1); // adding the button to the frame

        b1.setBounds(100, 200, 200, 200);

        // icon button
        b1.setIcon(icon);

        // text settings
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setForeground(new Color(0xFFDFDD));
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.TOP);

        // for default layout manager
        b1.setHorizontalAlignment(JLabel.CENTER); // sets the alignment of the button
        b1.setVerticalAlignment(JLabel.CENTER); // sets the alignment of the button

        // we can desable the button by
        // b1.setEnabled(false);

        // we can make it clikable only ones by Action Listener

        // we can also set the button to be focusable

        // we can also set the button to be invisible
        // b1.setVisible(false);

        // we can also set the button to be enabled
        // b1.setEnabled(true);

        // we can also set the button to be visible
        // b1.setVisible(true);

        // sets action for clicked button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // action performed
                System.out.println("Button clicked");

                // we can make it clikable only ones by Action Listener
                // b1.setEnabled(false);
            }
        });

        // {or} we can use a labda expresion
        b1.addActionListener(e -> {
            System.out.println("Button clicked");
        });

    }
}
