package swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class test extends frame {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon(
                "/Users/aderlasatvik/Downloads/java/practice/src/swing/Screenshot 2024-10-23 at 11.08.18 AM.png");
        frame frame = new frame();

        // button
        JButton b = new JButton("button");
        b.setBounds(10, 10, 100, 100);
        frame.add(b);

        // option panel
        String[] op = { "how can you do that to me", "thats not fair", "your are fucked up",
                "dont talk to me ever again" };

        int i = JOptionPane.showOptionDialog(null,
                " bro do you even code? i know you dont / body ",
                "secret Message / tittle ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, image, op, 0);
        System.out.println(i);

    }
}