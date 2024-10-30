package swing.layout;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class borderlayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        // Border layout = a border layout places components in five areas : north /
        // south / west / east / center.
        // all extra space is placed in the c

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setPreferredSize(new Dimension(100, 100));
        frame.add(panel, BorderLayout.CENTER);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        (panel2).setPreferredSize(new Dimension(100, 100));
        frame.add(panel2, BorderLayout.NORTH);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setPreferredSize(new Dimension(100, 100));
        frame.add(panel3, BorderLayout.SOUTH);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        panel4.setPreferredSize(new Dimension(100, 100));
        frame.add(panel4, BorderLayout.EAST);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.MAGENTA);
        panel5.setPreferredSize(new Dimension(100, 100));
        frame.add(panel5, BorderLayout.WEST);

        frame.setVisible(true);

        // Reffer bro code vedio from 1:02:00 for some context

        // we can add other panels into another panel as bodder layout suchh as
        panel.setLayout(new BorderLayout());

        JPanel panelq = new JPanel();
        panelq.setBackground(Color.darkGray);
        panelq.setPreferredSize(new Dimension(10, 10));
        panel.add(panelq, BorderLayout.SOUTH);

        JPanel panel2q = new JPanel();
        panel2q.setBackground(Color.black);
        (panel2q).setPreferredSize(new Dimension(10, 10));
        panel.add(panel2q, BorderLayout.NORTH);

        JPanel panel3q = new JPanel();
        panel3q.setBackground(Color.pink);
        panel3q.setPreferredSize(new Dimension(10, 10));
        panel.add(panel3q, BorderLayout.EAST);

        // IMPORTANT STEPS AS * CAN CAUSE THINGS TO NOT APPER * AS INTENDED WRITE WHESE
        // STATEMENTS AT THE END *****

        panel.setVisible(true);
        frame.setVisible(true);

    }

}