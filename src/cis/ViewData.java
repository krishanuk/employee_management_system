/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cis;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

/**
 *
 * @author Dinesh
 */
public class ViewData extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    Statement stm = null;
    /**
     * Creates new form ViewData
     */
    public ViewData() {
        initComponents();
        
        con =  DatabaseConnection.connection();
        ShowRecord();

    }
    
    public void ShowRecord(){
        
        try{
            stm = con.createStatement();
            
            if(cmbDepartment.getSelectedItem().equals("All"))
            {
                String quary = "Select * From employee";
                DefaultTableModel model = (DefaultTableModel)tblView.getModel();
                model.setRowCount(0);
                rs = stm.executeQuery(quary);
                if(rs.isBeforeFirst())
                {
                    while(rs.next()){
                     model.addRow(new Object[]{rs.getString(1),rs.getString(2),
                         rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
                }    
                
                
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        btnSelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEPARTMENT");

        cmbDepartment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Management", "Lectures", "Finance", "Marketing", "IT", " " }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        btnSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelect.setText("View Data");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tblView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "EPF NUMBER", "PHONENUMBER", "ADDRESS", "DESIGNATION", "DEPARTMENT"
            }
        ));
        jScrollPane1.setViewportView(tblView);

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnHome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelect)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

    try {
    stm = con.createStatement();

    String department = (String) cmbDepartment.getSelectedItem();
    String query = "SELECT * FROM employee";
    
    if (!"All".equals(department)) {
        query += " WHERE department=?";
    }

    DefaultTableModel model = (DefaultTableModel) tblView.getModel();
    model.setRowCount(0);

    PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(query);

    if (!"All".equals(department)) {
        pstmt.setString(1, department);
    }

    rs = pstmt.executeQuery();

    if (rs.isBeforeFirst()) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString(1), rs.getString(2),
                rs.getString(3), rs.getString(4), rs.getString(5),
                rs.getString(6), rs.getString(7)
            });
        }
    }

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
}  
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       Manager m = new Manager();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
       
        DefaultTableModel obj = (DefaultTableModel) tblView.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        tblView.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(Search.getText()));
// TODO add your handling code here:
    }//GEN-LAST:event_SearchKeyReleased

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblView;
    // End of variables declaration//GEN-END:variables
}