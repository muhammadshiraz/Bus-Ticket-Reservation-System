/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wali
 */


public class ViewTicket extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminLogin
     */
    
    Connection con=null;
    Statement st;
    ResultSet rs;
    
    public ViewTicket() 
    {
        initComponents();
        con= Connect.ConnectDB();
         try 
        {
        st = con.createStatement();
        rs=st.executeQuery("select R_Name from TB_Route");
            while(rs.next())
        {
        cmbr.addItem(rs.getString(1));
        }
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
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
        cmbr = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        ViewAll = new javax.swing.JButton();
        CancelTicket = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setTitle("Tickets");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adminicon.png"))); // NOI18N
        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 51, 255));

        cmbr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbrItemStateChanged(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear Table");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket No", "CustomerID", "Name", "Route", "From", "To", "Bus Number", "Booking Date", "Date", "Time", "Seat Number", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl);

        ViewAll.setBackground(new java.awt.Color(0, 0, 0));
        ViewAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewAll.setForeground(new java.awt.Color(255, 255, 255));
        ViewAll.setText("View All");
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });

        CancelTicket.setBackground(new java.awt.Color(0, 0, 0));
        CancelTicket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelTicket.setForeground(new java.awt.Color(255, 255, 255));
        CancelTicket.setText("View Cancelled Tickets");
        CancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(ViewAll)
                        .addGap(33, 33, 33)
                        .addComponent(CancelTicket)
                        .addGap(123, 123, 123)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cmbr)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(ViewAll)
                    .addComponent(CancelTicket))
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setText("Booked Ticket's");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        tm.setNumRows(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbrItemStateChanged
        // TODO add your handling code here:
        
        DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        tm.setNumRows(0);
        String cmbroute = "'" + cmbr.getSelectedItem().toString()+ "'";
        try
        {
            rs=st.executeQuery("  select * from TB_Ticket where Cust_Route= "+cmbroute+" and Ticket_status='confirm'   ");
            
            while(rs.next())
            {
            tm.insertRow(tm.getRowCount(), new Object[]{rs.getString(1),rs.getString(2), rs.getString(3)
                , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13) });
            }
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbrItemStateChanged

    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        tm.setNumRows(0);
       
        try
        {
            rs=st.executeQuery("  select * from TB_Ticket ");
            
            while(rs.next())
            {
            tm.insertRow(tm.getRowCount(), new Object[]{rs.getString(1),rs.getString(2), rs.getString(3)
                , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13) });
            }
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        }
        
    }//GEN-LAST:event_ViewAllActionPerformed

    private void CancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelTicketActionPerformed
        // TODO add your handling code here:
         
        DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        tm.setNumRows(0);
       
        try
        {
            rs=st.executeQuery("  select * from TB_Ticket where Ticket_status='cancel' ");
            
            while(rs.next())
            {
            tm.insertRow(tm.getRowCount(), new Object[]{rs.getString(1),rs.getString(2), rs.getString(3)
                , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13) });
            }
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        }
    }//GEN-LAST:event_CancelTicketActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelTicket;
    private javax.swing.JButton ViewAll;
    private javax.swing.JComboBox cmbr;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}