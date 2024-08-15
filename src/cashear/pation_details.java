/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cashear;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.MySQL;

/**
 *
 * @author lochana
 */
public class pation_details extends javax.swing.JPanel {

    public static HashMap<String, Integer> placeMap = new HashMap<>();

    public pation_details() {
        initComponents();
        initialize();
    }

    private void initialize() {
        active_ption_combo();
        addComboBoxListener();
        loadPationTable(null);
    }

    private void loadPationTable(Integer statusId) {
        try {
            String query = "SELECT * FROM `pations` "
                    + "INNER JOIN `gender` ON `pations`.`gender_gender_id` = `gender`.`gender_id` "
                    + "INNER JOIN `payment_type` ON `pations`.`payment_type_id` = `payment_type`.`id` "
                    + "INNER JOIN `pations_contact` ON `pations`.`nic` = `pations_contact`.`pations_nic` "
                    + (statusId != null ? "WHERE `pations`.`pation_States_p_stetus_id` = " + statusId + " " : "")
                    + "ORDER BY `pations`.`reg_no` ASC";

            ResultSet rs = MySQL.execute(query);

            DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
            model.setRowCount(0);

            int rowCount = 0;
            boolean sc01Added = false;

            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString("reg_no"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("f_name"));
                v.add(rs.getString("l_name"));
                v.add(rs.getString("birthday"));
                v.add(rs.getString("gender_name"));
                v.add(rs.getString("pations_contact.pations_mobile"));
                v.add(rs.getString("pations_contact.addres"));
                v.add(rs.getString("otcr"));
                v.add(rs.getString("mrfv"));
                v.add(rs.getString("full_or_daily"));

                rowCount++;
                if (!sc01Added && rs.getString("reg_no").equals("sc01")) {
                    model.insertRow(0, v);
                    sc01Added = true;
                } else {
                    model.addRow(v);
                }
            }

            jTable5.setModel(model);
            jLabel120.setText("" + rowCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void performSearch() {
        String nic = serc_bar.getText().trim();
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable5.setRowSorter(sorter);

        if (nic.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(nic, 1));
        }
    }
    
    
     private void addSearchBarListener() {
        serc_bar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                performSearch();
            }
        });
    }

    private void active_ption_combo() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM `pation_states`");
            Vector<String> v = new Vector<>();
            v.add("Select");

            while (rs.next()) {
                v.add(rs.getString("states_name"));
                placeMap.put(rs.getString("states_name"), rs.getInt("p_stetus_id"));
            }

            DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>(v);
            pation_active.setModel(m);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void filterPatients() {
        String selectedStatus = (String) pation_active.getSelectedItem();
        if (selectedStatus.equals("Select")) {
            loadPationTable(null);
        } else {
            Integer statusId = placeMap.get(selectedStatus);
            loadPationTable(statusId);
        }
    }

    private void addComboBoxListener() {
        pation_active.addActionListener(e -> filterPatients());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pation_details = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        serc_bar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        serc_bar1 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel194 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        pation_active = new javax.swing.JComboBox<>();
        jLabel200 = new javax.swing.JLabel();

        pation_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel118.setText("Patient Details");
        pation_details.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        serc_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serc_barMouseClicked(evt);
            }
        });
        serc_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serc_barActionPerformed(evt);
            }
        });
        serc_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serc_barKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serc_barKeyTyped(evt);
            }
        });
        pation_details.add(serc_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, 200, 30));

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pation_details.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, 90, 30));

        serc_bar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serc_bar1MouseClicked(evt);
            }
        });
        serc_bar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serc_bar1ActionPerformed(evt);
            }
        });
        serc_bar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serc_bar1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serc_bar1KeyTyped(evt);
            }
        });
        pation_details.add(serc_bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, 200, 30));

        jLabel121.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel121.setText("Patient Details");
        pation_details.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pation_details.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, 90, 30));

        jLabel194.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel194.setText("Patient States");
        pation_details.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 80, 120, 30));

        jScrollPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseClicked(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R. Num", "NIC", "First Name", "Last Name", "DOB", "Gender", "Mobile", "Address", "O. T. C. R", "M. R. F. C", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(0);
        jTable5.setAutoscrolls(false);
        jTable5.setRowHeight(30);
        jTable5.setSelectionBackground(new java.awt.Color(102, 153, 0));
        jTable5.setShowGrid(true);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(55);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable5.getColumnModel().getColumn(1).setMinWidth(120);
            jTable5.getColumnModel().getColumn(2).setMinWidth(180);
            jTable5.getColumnModel().getColumn(3).setMinWidth(180);
            jTable5.getColumnModel().getColumn(4).setMinWidth(90);
            jTable5.getColumnModel().getColumn(5).setMinWidth(90);
            jTable5.getColumnModel().getColumn(6).setMinWidth(100);
            jTable5.getColumnModel().getColumn(7).setMinWidth(300);
            jTable5.getColumnModel().getColumn(8).setMinWidth(350);
            jTable5.getColumnModel().getColumn(9).setMinWidth(350);
            jTable5.getColumnModel().getColumn(10).setMinWidth(100);
        }

        pation_details.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1560, 790));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        pation_details.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 920, -1, -1));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel119.setText("Surabe Clinic Counts On All Pastionts Registrations :-");
        pation_details.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 920, -1, -1));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel120.setText("jLabel120");
        pation_details.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 920, 160, 30));

        jLabel199.setForeground(new java.awt.Color(204, 204, 204));
        jLabel199.setText("Double Click on pastion raw to view pastion's  full details");
        pation_details.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        pation_active.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pation_details.add(pation_active, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 80, 230, -1));

        jLabel200.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel200.setText("NIC");
        pation_details.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pation_details, javax.swing.GroupLayout.PREFERRED_SIZE, 1630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pation_details, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void serc_barMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serc_barMouseClicked
        // TODO add your handling code here:
        serc_bar.setText("");
    }//GEN-LAST:event_serc_barMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        performSearch();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked

        if (evt.getClickCount() == 2) {
            if (jTable5.getSelectedRow() != -1) {
                String register_number = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 0));
                String nic = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 1));
                String f_name = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 2));
                String l_name = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 3));
                String dob = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 4));
                String gender = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 5));
                String mobile = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 6));
                String address = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 7));
                String otcr = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 8));
                String mrfc = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 9));
                String payment = String.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 10));

                casher_dash fr = new casher_dash();
                p_details fd = new p_details(fr, true);
                fd.get(register_number, nic, f_name, l_name, dob, gender, mobile, address, otcr, mrfc, payment);

                fd.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jScrollPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane5MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        initialize();

        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable5.setRowSorter(sorter);
        sorter.setRowFilter(null);

        serc_bar.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void serc_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serc_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serc_barActionPerformed

    private void serc_barKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serc_barKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            performSearch();
        }
    }//GEN-LAST:event_serc_barKeyPressed

    private void serc_barKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serc_barKeyTyped
        // TODO add your handling code here:
        
        addSearchBarListener();
    }//GEN-LAST:event_serc_barKeyTyped

    private void serc_bar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serc_bar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_serc_bar1MouseClicked

    private void serc_bar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serc_bar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serc_bar1ActionPerformed

    private void serc_bar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serc_bar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_serc_bar1KeyPressed

    private void serc_bar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serc_bar1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_serc_bar1KeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable5;
    private javax.swing.JComboBox<String> pation_active;
    private javax.swing.JPanel pation_details;
    private javax.swing.JTextField serc_bar;
    private javax.swing.JTextField serc_bar1;
    // End of variables declaration//GEN-END:variables
}
