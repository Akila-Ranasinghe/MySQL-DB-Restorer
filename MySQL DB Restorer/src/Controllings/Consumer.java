package Controllings;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Akila
 */
public class Consumer {

    public static void setConsume(JTextComponent... tc) {
        for (JTextComponent c : tc) {
            c.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent evt) {
                    if (evt.getKeyChar() == 92 | evt.getKeyChar() == 39) {
                        evt.consume();
                    }
                }
            });
            //restric copy/ paste
            c.setTransferHandler(null);
        }
    }

}
