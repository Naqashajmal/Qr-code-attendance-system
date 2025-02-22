
package forms;

import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.List;
import java.sql.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.BDUtility;


public class ViewAttendance extends javax.swing.JFrame {

   
    public ViewAttendance() {
        initComponents();
        BDUtility.setImage(this, "images/Time.jpg", 1101, 648);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        jLabel1.setForeground(Color.WHITE);
        dateChooserFrom.setDateFormatString("yyyy-MM-dd");
        dateChooserTo.setDateFormatString("yyyy-MM-dd");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        absentLBL = new javax.swing.JLabel();
        lblPresent = new javax.swing.JLabel();
        presentLBL = new javax.swing.JLabel();
        lblAbsent = new javax.swing.JLabel();
        btnResetFilters = new javax.swing.JButton();
        checkBoxContact = new javax.swing.JCheckBox();
        checkBoxAddress = new javax.swing.JCheckBox();
        checkBoxUniqueRegId = new javax.swing.JCheckBox();
        checkBoxState = new javax.swing.JCheckBox();
        checkBoxCountry = new javax.swing.JCheckBox();
        dateChooserFrom = new com.toedter.calendar.JDateChooser();
        dateChooserTo = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(userTable);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("On/From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");

        absentLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        absentLBL.setForeground(new java.awt.Color(255, 255, 255));
        absentLBL.setText("Absent:");

        lblPresent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPresent.setForeground(new java.awt.Color(51, 204, 0));
        lblPresent.setText("-------");

        presentLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        presentLBL.setForeground(new java.awt.Color(255, 255, 255));
        presentLBL.setText("Present:");

        lblAbsent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAbsent.setForeground(new java.awt.Color(255, 0, 0));
        lblAbsent.setText("-------");

        btnResetFilters.setText("Reset Filters");
        btnResetFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFiltersActionPerformed(evt);
            }
        });

        checkBoxContact.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxContact.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxContact.setText("Contact");
        checkBoxContact.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxContactItemStateChanged(evt);
            }
        });
        checkBoxContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxContactActionPerformed(evt);
            }
        });

        checkBoxAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxAddress.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxAddress.setText("Address");
        checkBoxAddress.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxAddressItemStateChanged(evt);
            }
        });
        checkBoxAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAddressActionPerformed(evt);
            }
        });

        checkBoxUniqueRegId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxUniqueRegId.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxUniqueRegId.setText("Reg ID");
        checkBoxUniqueRegId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxUniqueRegIdItemStateChanged(evt);
            }
        });
        checkBoxUniqueRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxUniqueRegIdActionPerformed(evt);
            }
        });

        checkBoxState.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxState.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxState.setText("State");
        checkBoxState.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxStateItemStateChanged(evt);
            }
        });
        checkBoxState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxStateActionPerformed(evt);
            }
        });

        checkBoxCountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxCountry.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxCountry.setText("Country");
        checkBoxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxCountryItemStateChanged(evt);
            }
        });
        checkBoxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCountryActionPerformed(evt);
            }
        });

        dateChooserFrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserFromPropertyChange(evt);
            }
        });

        dateChooserTo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserToPropertyChange(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(absentLBL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAbsent))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(presentLBL)
                            .addGap(62, 62, 62)
                            .addComponent(lblPresent)))
                    .addComponent(checkBoxAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxContact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxState, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxCountry, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dateChooserTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateChooserFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(checkBoxUniqueRegId)
                        .addGap(47, 47, 47)
                        .addComponent(btnResetFilters)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presentLBL)
                            .addComponent(lblPresent))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(absentLBL)
                            .addComponent(lblAbsent))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxContact)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxAddress)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxState)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxCountry)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxUniqueRegId))
                            .addComponent(btnResetFilters)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnResetFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFiltersActionPerformed
        // TODO add your handling code here:
        txtSearch.setText("");
        dateChooserFrom.setDate(null);
        dateChooserTo.setDate(null);
        checkBoxContact.setSelected(false);
        checkBoxAddress.setSelected(false);
        checkBoxState.setSelected(false);
        checkBoxCountry.setSelected(false);
        checkBoxUniqueRegId.setSelected(false);
        
        loadDataInTable();
    }//GEN-LAST:event_btnResetFiltersActionPerformed
     private void loadDataInTable() {
        var columns = new ArrayList<>(Arrays.asList(
            "ID", "Name", "Gender", "Email", "Date", "CheckIn", "CheckOut", "Work Duration"
        ));
        
        System.out.println(columns);
        String searchText= txtSearch.getText().toString();
        Date fromDateFromCal= dateChooserFrom.getDate();
        LocalDate fromDate=null;
        if(fromDateFromCal !=null){
            fromDate = fromDateFromCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        Date toDateFromCal = dateChooserTo.getDate();
        LocalDate toDate = null;
        if(toDateFromCal !=null){
            toDate = toDateFromCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
        }
        Long daysBetween=null;
        if(fromDate !=null && toDate !=null){
            daysBetween = countWeekdays(fromDate,toDate);
        }
      Boolean contactIncluded = checkBoxContact.isSelected();
      Boolean addressIncluded= checkBoxAddress.isSelected();
      Boolean stateIncluded= checkBoxState.isSelected();
      Boolean countryIncluded= checkBoxCountry.isSelected();
      Boolean uniqueRegIdIncluded= checkBoxUniqueRegId.isSelected();
      
      String sqlQuery = "select ud.id, ud.name, ud.gender, ud.email, ua.date, ua.checkin, ua.checkout, ua.workduration";
      if(contactIncluded){
          columns.add("Contacts");
          sqlQuery +=", ud.contact";
      }
      if(addressIncluded){
          columns.add("Address");
          sqlQuery +=", ud.address";
      }
      if(stateIncluded){
          columns.add("State");
          sqlQuery +=", ud.state";
      }
      if(countryIncluded){
          columns.add("Country");
          sqlQuery +=", ud.country";
      }
      if(uniqueRegIdIncluded){
          columns.add("Unique Reg Id");
          sqlQuery +=", ud.uniqueregid";
      }
      sqlQuery +=" from userdetails as ud inner join userattendance as ua on ud.id=ua.userid ";
      
      if(searchText !=null){
          sqlQuery +="where (ud.name like '%"+ searchText + "%' or ud.email like '%"+ searchText + "%')";
          if(fromDate != null && toDate != null){
              sqlQuery += "and ua.date between '"+ fromDate + "'  and '"+ toDate +"'";
              
          }else if(fromDate !=null){
              sqlQuery += " and ua.date = '" + fromDate + "'";
              
          }
      }else{
          if(fromDate !=null && toDate !=null){
              sqlQuery += " where ua.date between '"+ fromDate + "' and '"+ toDate +"'";
              
          }else if(fromDate != null){
              sqlQuery += " where ua. date = '" + fromDate + "'"; 
          }
      }
      
      DefaultTableModel model = new DefaultTableModel();
      model.setColumnIdentifiers(columns.toArray());
      userTable.setModel(model);
      
      try{
          Connection Con =  ConnectionProvider.getCon();
          Statement st = Con.createStatement();
          ResultSet rs = st.executeQuery(sqlQuery);
          int presentCount=01;
            int absentCount=01;
            Set<String> emailList = new HashSet<>();
            while(rs.next()){
                var row = new ArrayList<Object>();
                row.add(rs.getString("id"));
                row.add(rs.getString("name"));
                row.add(rs.getString("gender"));
                row.add(rs.getString("email"));
                emailList.add(rs.getString("email"));
                row.add(rs.getString("date"));
                row.add(rs.getString("checkin"));
                row.add(rs.getString("checkout"));
                row.add(rs.getString("workduration"));
                if(contactIncluded){
                    row.add(rs.getString("contact"));
               
            }
                if(addressIncluded){
                    row.add(rs.getString("address"));
                }
                if(stateIncluded){
                    row.add(rs.getString("state"));
                }
                if(countryIncluded){
                    row.add(rs.getString("country"));
                }
                if(uniqueRegIdIncluded){
                    row.add(rs.getString("uniqueregid"));
                }
                if(rs.getString("checkout")==null){
                    absentCount++;
                }else{
                    presentCount++;
                }
                model.addRow(row.toArray());
            }
            if(emailList.size()==1){
                lblPresent.setVisible(true);
                lblAbsent.setVisible(true);
                presentLBL.setVisible(true);
                absentLBL.setVisible(true);
                lblPresent.setText(String.valueOf(presentCount));
                if(daysBetween != null && daysBetween>0){
                    absentCount = (int) (daysBetween - presentCount);
                }
                lblAbsent.setText(String.valueOf(absentCount));
            }else{
                 lblPresent.setVisible(false);
                lblAbsent.setVisible(false);
                presentLBL.setVisible(false);
                absentLBL.setVisible(false);
            }
      }
      catch(Exception ex){
          ex.printStackTrace();
          }
        
    }
    private void checkBoxContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxContactActionPerformed

    private void checkBoxAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAddressActionPerformed

    private void checkBoxUniqueRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxUniqueRegIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxUniqueRegIdActionPerformed

    private void checkBoxStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxStateActionPerformed

    private void checkBoxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxCountryActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        loadDataInTable();
    }//GEN-LAST:event_formComponentShown

    private void checkBoxContactItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxContactItemStateChanged
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_checkBoxContactItemStateChanged

    private void checkBoxAddressItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxAddressItemStateChanged
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_checkBoxAddressItemStateChanged

    private void checkBoxStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxStateItemStateChanged
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_checkBoxStateItemStateChanged

    private void checkBoxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxCountryItemStateChanged
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_checkBoxCountryItemStateChanged

    private void checkBoxUniqueRegIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxUniqueRegIdItemStateChanged
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_checkBoxUniqueRegIdItemStateChanged

    private void dateChooserFromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserFromPropertyChange
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_dateChooserFromPropertyChange

    private void dateChooserToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserToPropertyChange
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_dateChooserToPropertyChange

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
                loadDataInTable();

    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absentLBL;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnResetFilters;
    private javax.swing.JCheckBox checkBoxAddress;
    private javax.swing.JCheckBox checkBoxContact;
    private javax.swing.JCheckBox checkBoxCountry;
    private javax.swing.JCheckBox checkBoxState;
    private javax.swing.JCheckBox checkBoxUniqueRegId;
    private com.toedter.calendar.JDateChooser dateChooserFrom;
    private com.toedter.calendar.JDateChooser dateChooserTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbsent;
    private javax.swing.JLabel lblPresent;
    private javax.swing.JLabel presentLBL;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    private Long countWeekdays(LocalDate start, LocalDate end) {
        long count = 0;
        LocalDate date= start;
        while(date.isBefore(end) || date.equals(end)){
            if(!(date.getDayOfWeek()== DayOfWeek.SATURDAY || date.getDayOfWeek()==DayOfWeek.SUNDAY)){
                count++;
            }
            date = date.plusDays(1);
            
        }return count;
    }

   
}
