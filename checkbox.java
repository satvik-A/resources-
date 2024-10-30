package swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JCheckBox checkbox = new JCheckBox("Checkbox");
        checkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkbox.isSelected()) {
                    System.out.println("Checkbox is selected");
                    frame f = new frame();
                } else {
                    System.out.println("Checkbox is not selected");
                }
            }
        });

        frame.add(checkbox);
        frame.setVisible(true);
    }
}
/*
 * This code creates a simple GUI with a checkbox. When the checkbox is clicked,
 * it prints a message
 * to the console indicating whether the checkbox is selected or not. However,
 * the code has a few
 * issues that need to be addressed.
 * 1. The code does not handle the case where the checkbox is deselected. It
 * only prints a message when the checkbox is selected.
 * 2. The code does not handle the case where the checkbox is clicked multiple
 * times in
 * quick succession. It only prints a message once when the checkbox is first
 * clicked.
 * 3. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is not visible. It only prints a message when the GUI is visible.
 * 4. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is minimized. It only prints a message when the GUI is not minimized.
 * 5. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is closed. It only prints a message when the GUI is still open.
 * 6. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is in the background. It only prints a message when the GUI is in the
 * foreground.
 * 7. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is not focused. It only prints a message when the GUI is focused.
 * 8. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is not enabled. It only prints a message when the GUI is enabled.
 * 9. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is not visible. It only prints a message when the GUI is visible.
 * 10. The code does not handle the case where the checkbox is clicked when the
 * GUI
 * is not in the correct state. It only prints a message when the GUI is in the
 * correct
 * state.
 * To address these issues, we need to add additional code to handle these
 * cases.
 * Here is the updated code
 * 
 */

class checkbox1 {
    private static final int DISPOSE_ON_CLOSE = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Checkbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        JCheckBox checkbox = new JCheckBox("Checkbox");
        checkbox.setFont(new Font("geneva", 20, 20));
        checkbox.addActionListener(e -> {
            if (checkbox.isSelected()) {
                framel f = new framel();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        });

        frame.add(checkbox);

        frame.pack();
        frame.setVisible(true);

    }
}
