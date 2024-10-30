package swing;

import javax.swing.JButton;
import javax.swing.JLabel;

class linkedpanels {

    public static void main(String[] args) {

        JLabel l = new JLabel("new window opened");
        l.setVisible(true);
        l.setBounds(100, 100, 200, 300);

        frame frame = new frame();

        JButton b1 = new JButton("button");
        b1.setBounds(10, 10, 100, 100);
        frame.add(b1);

        b1.addActionListener(e -> {
            frame.setVisible(false);
            frame.dispose();
            frame f = new frame();
            f.add(l);

        });

    }

}