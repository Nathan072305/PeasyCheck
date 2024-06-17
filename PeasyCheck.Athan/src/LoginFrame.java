
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginTabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        reportButton = new javax.swing.JButton();
        toAdminLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkStatusButton = new javax.swing.JButton();
        toAdminLogin1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        passwordTF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        toMainPage = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PeasyCheck");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PeasyCheck (200 x 200 px).png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        loginTabbedPane.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportButton.setBackground(new java.awt.Color(255, 255, 51));
        reportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reportButton.setText("Report a problem");
        reportButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 5));
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        jPanel3.add(reportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 320, 40));

        toAdminLogin.setBackground(new java.awt.Color(243, 243, 89));
        toAdminLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toAdminLogin.setText("Admin Options");
        toAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAdminLoginActionPerformed(evt);
            }
        });
        jPanel3.add(toAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 320, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("PeasyCheck");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 204, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Make PC-checking Easy-peasy!");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Encountered a problem in one of the computers?");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        checkStatusButton.setBackground(new java.awt.Color(243, 243, 89));
        checkStatusButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkStatusButton.setText("Check status of computers");
        checkStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStatusButtonActionPerformed(evt);
            }
        });
        jPanel3.add(checkStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 320, 40));

        toAdminLogin1.setBackground(new java.awt.Color(243, 243, 89));
        toAdminLogin1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toAdminLogin1.setText("Raise a suggestion");
        toAdminLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAdminLogin1ActionPerformed(evt);
            }
        });
        jPanel3.add(toAdminLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 320, 40));

        loginTabbedPane.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTF.setBackground(new java.awt.Color(0, 0, 102));
        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 370, 38));

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Password");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 101, -1));

        showPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Admin Options");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        login.setBackground(new java.awt.Color(0, 0, 102));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel4.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 373, 90, 30));

        toMainPage.setText("Back ");
        toMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMainPageActionPerformed(evt);
            }
        });
        jPanel4.add(toMainPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 373, 80, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Enter the admin password to proceed");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        loginTabbedPane.addTab("tab2", jPanel4);

        jPanel1.add(loginTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 630, 480));

        jPanel5.setBackground(new java.awt.Color(243, 243, 89));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStatusButtonActionPerformed
        // TODO add your handling code here:
        CheckStatusFrame checkStatus = new CheckStatusFrame();
        checkStatus.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_checkStatusButtonActionPerformed

    private void toAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAdminLoginActionPerformed
        // TODO add your handling code here:
        loginTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_toAdminLoginActionPerformed

    private void toMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMainPageActionPerformed
        loginTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_toMainPageActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        ReportFrame reportFrame = new ReportFrame();
        reportFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void toAdminLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAdminLogin1ActionPerformed
        Suggestion a = new Suggestion();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_toAdminLogin1ActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if (showPassword.isSelected()) {
        // Show the password
        passwordTF.setEchoChar((char) 0);
    } else {
        // Hide the password
        passwordTF.setEchoChar('*');
    }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String password = new String(passwordTF.getPassword());
        
        
        // Validate fields
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter password.");
            return;
        }

        // Check if user exists
        if (password.equals("admin123")) {
            
            Admin adminView = new Admin();
            adminView.setVisible(true);
            this.setVisible(false);
                
            this.setVisible(false);                
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect password.");
            }
        
        
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkStatusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton login;
    private javax.swing.JTabbedPane loginTabbedPane;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton reportButton;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton toAdminLogin;
    private javax.swing.JButton toAdminLogin1;
    private javax.swing.JButton toMainPage;
    // End of variables declaration//GEN-END:variables
}
