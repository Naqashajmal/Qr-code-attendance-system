
package forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import utility.BDUtility;


public class Dashboard extends javax.swing.JFrame {

   
    public Dashboard() {
        initComponents();
        BDUtility.setImage(this, "images/Time.jpg", 1366, 768);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.BLACK));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnRegisterUser1 = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnGenerateQr = new javax.swing.JButton();
        btnViewQrs = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnRegisterUser6 = new javax.swing.JButton();
        btnRegisterUser7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnRegisterUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterUser1.setText("Register User");
        btnRegisterUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUser1ActionPerformed(evt);
            }
        });

        btnViewUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        btnGenerateQr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateQr.setText("Generate QR");
        btnGenerateQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateQrActionPerformed(evt);
            }
        });

        btnViewQrs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewQrs.setText("View QR's");
        btnViewQrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewQrsActionPerformed(evt);
            }
        });

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnRegisterUser6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterUser6.setText("View Attendance");
        btnRegisterUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUser6ActionPerformed(evt);
            }
        });

        btnRegisterUser7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterUser7.setText("Mark Attendance");
        btnRegisterUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUser7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnRegisterUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerateQr, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewQrs, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegisterUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegisterUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegisterUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateQr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewQrs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        BDUtility.openForm(ViewUser.class.getSimpleName(), new ViewUser());
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnRegisterUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUser1ActionPerformed
        BDUtility.openForm(UserRegistration.class.getSimpleName(), new UserRegistration());
    }//GEN-LAST:event_btnRegisterUser1ActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        BDUtility.openForm(UpdateUser.class.getSimpleName(), new UpdateUser());
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        BDUtility.openForm(DeleteUser.class.getSimpleName(), new DeleteUser());
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnGenerateQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateQrActionPerformed
        BDUtility.openForm(GenerateQr.class.getSimpleName(), new GenerateQr());
    }//GEN-LAST:event_btnGenerateQrActionPerformed

    private void btnViewQrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewQrsActionPerformed
        // TODO add your handling code here:
        BDUtility.openForm(ViewQrs.class.getSimpleName(), new ViewQrs());
    }//GEN-LAST:event_btnViewQrsActionPerformed

    private void btnRegisterUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUser7ActionPerformed
        // TODO add your handling code here:
        BDUtility.openForm(ViewQrs.class.getSimpleName(),new MarkAttendance());
    }//GEN-LAST:event_btnRegisterUser7ActionPerformed

    private void btnRegisterUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUser6ActionPerformed
        // TODO add your handling code here:
        BDUtility.openForm(ViewAttendance.class.getSimpleName(), new ViewAttendance());
    }//GEN-LAST:event_btnRegisterUser6ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerateQr;
    private javax.swing.JButton btnRegisterUser1;
    private javax.swing.JButton btnRegisterUser6;
    private javax.swing.JButton btnRegisterUser7;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewQrs;
    private javax.swing.JButton btnViewUser;
    // End of variables declaration//GEN-END:variables
}
