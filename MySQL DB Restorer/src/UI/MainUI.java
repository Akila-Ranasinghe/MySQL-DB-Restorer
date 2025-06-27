package UI;

import Controllings.Consumer;
import Controllings.JDBC;
import java.awt.FileDialog;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Akila
 */
public class MainUI extends javax.swing.JDialog {

    public MainUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Consumer.setConsume(txt_host, txt_port, txt_user, txt_pass);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_user = new com.alee.laf.text.WebTextField();
        txt_pass = new com.alee.laf.text.WebPasswordField();
        txt_port = new com.alee.laf.text.WebTextField();
        txt_host = new com.alee.laf.text.WebTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_browse = new com.alee.laf.button.WebButton();
        btn_Restore = new com.alee.laf.button.WebButton();
        txt_DBFilePath = new com.alee.laf.text.WebTextField();
        jCombo_sqlVersion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MySQL DB Restorer");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mysql_config.png"))); // NOI18N
        jLabel1.setText("<html>Restore MySQL DB File</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_user.setHideInputPromptOnFocus(false);
        txt_user.setInputPrompt("User Name");
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });

        txt_pass.setEchoChar('\u25cf');
        txt_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_pass.setHideInputPromptOnFocus(false);
        txt_pass.setInputPrompt("Password");
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });

        txt_port.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_port.setHideInputPromptOnFocus(false);
        txt_port.setInputPrompt("Port");
        txt_port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_portKeyPressed(evt);
            }
        });

        txt_host.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_host.setHideInputPromptOnFocus(false);
        txt_host.setInputPrompt("Server Host");
        txt_host.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_hostKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_hostKeyReleased(evt);
            }
        });

        btn_browse.setText("Browse");
        btn_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseActionPerformed(evt);
            }
        });

        btn_Restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DB_Restore_32.png"))); // NOI18N
        btn_Restore.setText("Restore");
        btn_Restore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestoreActionPerformed(evt);
            }
        });

        txt_DBFilePath.setEditable(false);
        txt_DBFilePath.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_DBFilePath.setHideInputPromptOnFocus(false);
        txt_DBFilePath.setInputPrompt("DB File Path");

        jCombo_sqlVersion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCombo_sqlVersion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5.0", "5.6" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("MySQL Server Version");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("File :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Restore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_DBFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_host, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCombo_sqlVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCombo_sqlVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_host, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DBFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Restore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_pass, txt_user});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txt_pass.grabFocus();
        }
    }//GEN-LAST:event_txt_userKeyPressed

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            btn_browse.grabFocus();
        }
    }//GEN-LAST:event_txt_passKeyPressed

    private void txt_portKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_portKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txt_user.grabFocus();
        }
    }//GEN-LAST:event_txt_portKeyPressed

    private void txt_hostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hostKeyReleased

        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String txt = txt_host.getText();
            switch (txt) {
                case "l":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(1);
                    break;
                case "lo":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(2);
                    break;
                case "loc":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(3);
                    break;
                case "loca":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(4);
                    break;
                case "local":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(5);
                    break;
                case "localh":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(6);
                    break;
                case "localho":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(7);
                    break;
                case "localhos":
                    txt_host.setText("localhost");
                    txt_host.setSelectionStart(8);
                    break;
                default:
                    txt_host.setSelectionEnd(9);
            }

        }
    }//GEN-LAST:event_txt_hostKeyReleased

    private void txt_hostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hostKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txt_port.grabFocus();
        }
    }//GEN-LAST:event_txt_hostKeyPressed

    private void btn_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseActionPerformed

        FileDialog fd = new FileDialog(this, "Opan Backup File", FileDialog.LOAD);
        fd.setVisible(true);
        fd.setMultipleMode(false);
        String path = fd.getDirectory() + fd.getFile();
        if (!path.equals("nullnull")) {
            txt_DBFilePath.setText(path);
        }

    }//GEN-LAST:event_btn_browseActionPerformed

    private void btn_RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestoreActionPerformed

        try {
            //start Restore-progress
            if (txt_host.getText().isEmpty() | txt_port.getText().isEmpty() | txt_user.getText().isEmpty() | txt_pass.getText().isEmpty()) {
                return;
            }
            if (txt_DBFilePath.getText().isEmpty()) {
                return;
            } else {
                JDBC.setHost(txt_host.getText());
                JDBC.setPort(txt_port.getText());
                JDBC.setUser(txt_user.getText());
                JDBC.setPass(txt_pass.getText());
                JDBC.mycon();
                new ProgressAnimator(null, true).setVisible(true);
            }

        } catch (Exception ex) {

            if (ex.getMessage().equals("Unknown database 'information_schema' ")) {
                new ProgressAnimator(null, true).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Operation Faild!", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_RestoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainUI dialog = new MainUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton btn_Restore;
    private com.alee.laf.button.WebButton btn_browse;
    public static javax.swing.JComboBox<String> jCombo_sqlVersion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static com.alee.laf.text.WebTextField txt_DBFilePath;
    public static com.alee.laf.text.WebTextField txt_host;
    public static com.alee.laf.text.WebPasswordField txt_pass;
    public static com.alee.laf.text.WebTextField txt_port;
    public static com.alee.laf.text.WebTextField txt_user;
    // End of variables declaration//GEN-END:variables

}
