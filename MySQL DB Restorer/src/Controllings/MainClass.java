package Controllings;

import com.alee.laf.WebLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Akila
 */
public class MainClass {

    public static void main(String[] args) {
        try {
            LookAndFeel lf = new WebLookAndFeel();
            UIManager.setLookAndFeel(lf);
            WebLookAndFeel.setDecorateAllWindows(true);
            new UI.MainUI(null, true).setVisible(true);

        } catch (Exception e) {
        }
    }
}
