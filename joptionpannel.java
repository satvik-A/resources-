package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class joptionpannel {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon(
                "/Users/aderlasatvik/Downloads/java/practice/src/swing/Screenshot 2024-10-23 at 11.08.18 AM.png");

        // Create a new JFrame
        frame f = new frame();

        // JOptionPane = pop up a standard dialog box that prompts users for a value or
        // informs them of some thing;

        // JOptionPane.showMessageDialog(parentComponent,message,title,optionType)
        // JOptionPane.showMessageDialog() = displays a message dialog with the
        // specified message and title.
        // parentComponent = the parent component of the dialog box
        // message = the message to be displayed
        // title = the title of the dialog box
        // optionType = the type of message dialog to be displayed

        /*
         * // does not return any thing
         * 
         * // just a message dialog box
         * JOptionPane.showMessageDialog(null,"bro do you even code","Tittle",
         * JOptionPane.PLAIN_MESSAGE);
         * 
         * // just a informative dialog box
         * JOptionPane.showMessageDialog(null,
         * "i know you don't","TITTLE",JOptionPane.INFORMATION_MESSAGE);
         * 
         * // just a question dialog box
         * JOptionPane.showMessageDialog(null,
         * "you are a noob","TITTLE",JOptionPane.QUESTION_MESSAGE);
         * 
         * // just a Warning dialog box
         * JOptionPane.showMessageDialog(null,
         * "you are a noob","TITTLE",JOptionPane.WARNING_MESSAGE);
         * 
         * // just a ERROR dialog box
         * JOptionPane.showMessageDialog(null,
         * "you are a noob","TITTLE",JOptionPane.ERROR_MESSAGE);
         */

        /*
         * // JOptionPane.showConfirmDialog() = displays a dialog with a specified
         * message and returns a value indicating
         * // whether the user chose OK, CANCEL, or CANCEL.
         * JOptionPane.showConfirmDialog(null, "bro do you even code",
         * " this is my tittle",JOptionPane.YES_NO_CANCEL_OPTION);
         * 
         */

        /*
         * // JOptionPane.showInputDialog() = displays a dialog with a specified message
         * // and returns the user's input
         * String name = JOptionPane.showInputDialog("what is your name");
         * System.err.println("name" + name);
         */

        /*
         * // JOptionPane.showOptionDialog() = displays a dialog with a specified
         * message
         * // and returns the index of the selected option
         * // the options are the buttons in the dialog box
         * // the default option is the button that is selected by default
         * // the close option is the button that closes the dialog box
         * // the cancel option is the button that cancels the dialog box
         * 
         * JOptionPane.showOptionDialog(null, "bro do you even code",
         * "this is my tittle",JOptionPane.YES_NO_CANCEL_OPTION,
         * JOptionPane.QUESTION_MESSAGE, null, new Object[] { "yes", "no", "cancel
         * "}, "yes");
         * 
         * 
         */

        // * we can create our own options by
        // * creating an array of objects
        // * and passing it to the showOptionDialog() method
        // * the objects in the array are the options in the dialog box
        // * the first object in the array is the default option
        // * the last object in the array is the close option
        String[] op = { "how can you do that to me", "thats not fair", "your are fucked up",
                "dont talk to me ever again" };

        // finally combining all of these
        int i = JOptionPane.showOptionDialog(null, " bro do you even code? i know you dont / body ",
                "secret Message / tittle ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, image, op, 0);

        System.out.println(i);

        f.dispose();
    }

}