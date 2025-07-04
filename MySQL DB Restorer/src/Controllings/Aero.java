package Controllings;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Akila
 */
public class Aero {

    public void enableAero(JFrame frame) {
        JRootPane root = frame.getRootPane();
        root.setOpaque(false);
        root.setDoubleBuffered(false);
        Container c = root.getContentPane();
        if (c instanceof JComponent) {
            JComponent content = (JComponent) c;
            content.setOpaque(false);
            content.setDoubleBuffered(false);
        }
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setOpacity(0.95F);
    }

    /**
     * The <code>Aero</code> class is used to set the <code>JDialog</code> background opacity <code>false</code>. Need to <code>setUndecorated(true)</code> of the JDialog.
     *
     * @param dialog
     */
    public void enableAero(JDialog dialog) {
        JRootPane root = dialog.getRootPane();
        root.setOpaque(false);
        root.setDoubleBuffered(false);
        Container c = root.getContentPane();
        if (c instanceof JComponent) {
            JComponent content = (JComponent) c;
            content.setOpaque(false);
            content.setDoubleBuffered(false);
        }
        dialog.setBackground(new Color(0, 0, 0, 0));
    }
}
