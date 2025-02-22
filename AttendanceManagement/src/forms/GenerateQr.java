
package forms;

import com.google.gson.Gson;
import dao.ConnectionProvider;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.swing.BorderFactory;
import utility.BDUtility;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;


public class GenerateQr extends javax.swing.JFrame {

  
    public GenerateQr() {
        initComponents();
        BDUtility.setImage(this, "images/Time.jpg", 1223, 501); 
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.BLACK));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblImage = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        btnSaveQr = new javax.swing.JButton();
        btnSaveQrAt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 447));
        setMinimumSize(new java.awt.Dimension(1101, 501));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate User QR");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Email", "Conatact ", "Address", "Country", "Registration Id"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        btnSaveQr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveQr.setText("Save QR");
        btnSaveQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQrActionPerformed(evt);
            }
        });

        btnSaveQrAt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSaveQrAt.setText("Save QR at");
        btnSaveQrAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQrAtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(428, 428, 428)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSaveQr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnSaveQrAt)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSaveQr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveQrAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        
    }//GEN-LAST:event_lblImageMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        try {
            Connection connection = ConnectionProvider.getCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from userdetails");
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet.getString("gender"),
                    resultSet.getString("email"),
                    resultSet.getString("contact"),
                    resultSet.getString("address"),
                    resultSet.getString("state"),
                    resultSet.getString("country"),
                    resultSet.getString("uniqueregid"),
                });
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formComponentShown

    ByteArrayOutputStream out = null;
    String email = null;

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int index = userTable.getSelectedRow();
        TableModel model = userTable.getModel();

        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        email = model.getValueAt(index, 3).toString();
        String registrationId = model.getValueAt(index, 7).toString();

        Map<String, String> data = new HashMap<>();
        data.put("id", id);
        data.put("name", name);
        data.put("email", email);
        data.put("registrationId", registrationId);

        Gson gson = new Gson();
        String jsonData = gson.toJson(data);
        System.out.println("Generated JSON Data: " + jsonData);

        out = QRCode.from(jsonData).withSize(322, 286).to(ImageType.PNG).stream();
        try {
            byte[] imageData = out.toByteArray();
            System.out.println("Image Data Length: " + imageData.length);
            ImageIcon icon = new ImageIcon(imageData);
            lblImage.setIcon(icon);
            lblImage.revalidate();
            lblImage.repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_userTableMouseClicked

    private void btnSaveQrAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQrAtActionPerformed
        // TODO add your handling code here
        try{
            if(out==null){
                JOptionPane.showMessageDialog(this, "No Qr Generated");
                return;
            }
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save QR Code at");
            fileChooser.setSelectedFile(new File (email + ".png"));
            int userSelection = fileChooser.showSaveDialog(this);
            if(userSelection == JFileChooser.APPROVE_OPTION){
                File fileToSave = fileChooser.getSelectedFile();
                try{
                    java.nio.file.Files.write(fileToSave.toPath(), out.toByteArray());
                    JOptionPane.showMessageDialog(this, "QR code saved!");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Error saving QR code","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "something went wrong");
        }
    }//GEN-LAST:event_btnSaveQrAtActionPerformed

    private void btnSaveQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQrActionPerformed
        try{
            if(out==null){
                JOptionPane.showMessageDialog(this, "No Qr Generated");
                return;
            }
            String defaultDir = BDUtility.getPath("qrCodes");
            File directory = new File(defaultDir);
            if(!directory.exists()){
                directory.mkdirs();
            }
            File defaultFile = new File (directory, email +".jpg");
            try{
                java.nio.file.Files.write(defaultFile.toPath(), out.toByteArray());
                JOptionPane.showMessageDialog(null, "QR code saved!");
            }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error saving QR Code.","Error",JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "something went wrong");
        }
    }//GEN-LAST:event_btnSaveQrActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateQr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveQr;
    private javax.swing.JButton btnSaveQrAt;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
