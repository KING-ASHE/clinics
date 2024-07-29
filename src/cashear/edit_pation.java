
package cashear;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.MySQL;

/**
 *
 * @author lochana
 */
public class edit_pation extends javax.swing.JPanel {

    public static HashMap<String, Integer> placeMap = new HashMap<>();

    public edit_pation() {
        initComponents();

        pk_2.setVisible(false);
        pk_3.setVisible(false);
        pk_label1.setVisible(false);
        pk_combo1.setVisible(false);
    }

    private void selectButtonGroup(ButtonGroup group, String actionCommand) {
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.getActionCommand().equals(actionCommand)) {
                button.setSelected(true);
                break;
            }
        }
    }

    private void performSearch() {
        String nic = jTextField47.getText();

        if (nic.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a NIC.");
            return;
        }

        try {
            ResultSet rs = MySQL.execute("SELECT * FROM `pations` WHERE `nic` = '" + nic + "'");

            if (rs.next()) {
                jTextField34.setText(rs.getString("reg_no"));
                jDateChooser4.setDate(rs.getDate("reg_date"));
                jTextField44.setText(rs.getString("otcr"));
                jTextField32.setText(rs.getString("f_name"));
                jTextField48.setText(rs.getString("l_name"));
                jDateChooser3.setDate(rs.getDate("birthday"));
                jTextField38.setText(rs.getString("nic"));
                jTextField42.setText(rs.getString("mrfv"));

                selectButtonGroup(buttonGroup16, rs.getString("gender_gender_id"));
                selectButtonGroup(buttonGroup1, rs.getString("payment_type_id"));

                ResultSet rsContact = MySQL.execute("SELECT * FROM `pations_contact` WHERE `pations_nic` = '" + nic + "'");
                if (rsContact.next()) {
                    jTextField31.setText(rsContact.getString("addres"));
                    jTextField37.setText(rsContact.getString("pations_mobile"));
                    jTextField39.setText(rsContact.getString("another_name"));
                    jTextField40.setText(rsContact.getString("mobile_1"));
                    jTextField41.setText(rsContact.getString("mobile_2"));
                }

                ResultSet rsHealth = MySQL.execute("SELECT * FROM `pations_helth` WHERE `pations_nic` = '" + nic + "'");
                if (rsHealth.next()) {
                    selectButtonGroup(buttonGroup17, rsHealth.getString("smoke_smoke_id"));
                    selectButtonGroup(buttonGroup18, rsHealth.getString("Alcohol_Alcohol_id"));
                    selectButtonGroup(buttonGroup19, rsHealth.getString("betal_nut_betal_nut_id"));
                    selectButtonGroup(buttonGroup20, rsHealth.getString("drugs_drugs_id"));
                    selectButtonGroup(buttonGroup21, rsHealth.getString("sleep_one_side_one_side_id"));
                    selectButtonGroup(buttonGroup22, rsHealth.getString("arm_sleep_sleep_arm_id"));
                    jTextField45.setText(rsHealth.getString("damu"));
                    jTextField43.setText(rsHealth.getString("other_defects"));
                    jTextField46.setText(rsHealth.getString("weight").replace("Kg", ""));
                    selectButtonGroup(buttonGroup13, rsHealth.getString("suger_suger_id"));
                }

                ResultSet rsOther = MySQL.execute("SELECT * FROM `pations_other_detailes` WHERE `pations_nic` = '" + nic + "'");
                if (rsOther.next()) {
                    selectButtonGroup(buttonGroup14, rsOther.getString("Pregnant_Pregnant_id"));
                    selectButtonGroup(buttonGroup15, rsOther.getString("marital_Status_Marital_id"));
                    jTextField36.setText(rsOther.getString("job"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No patient found with the given NIC.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving the data", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetedit() {
        // Clearing text fields
        jTextField34.setText("");
        jTextField44.setText("");
        jTextField32.setText("");
        jTextField48.setText("");
        jTextField38.setText("");
        jTextField42.setText("");
        jTextField31.setText("");
        jTextField37.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField45.setText("");
        jTextField43.setText("");
        jTextField46.setText("");
        jTextField36.setText("");
        jTextField47.setText("");
        jDateChooser4.setDate(null);
        jDateChooser3.setDate(null);
        buttonGroup18.clearSelection();
        buttonGroup25.clearSelection();
        buttonGroup19.clearSelection();
        buttonGroup20.clearSelection();
        buttonGroup21.clearSelection();
        buttonGroup22.clearSelection();
        buttonGroup23.clearSelection();
        buttonGroup24.clearSelection();
        buttonGroup16.clearSelection();
        buttonGroup13.clearSelection();
        buttonGroup17.clearSelection();
        buttonGroup1.clearSelection();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        edite_details = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        pk_label1 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jLabel144 = new javax.swing.JLabel();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel145 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel146 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        main_p1 = new javax.swing.JPanel();
        mainpanel1 = new javax.swing.JPanel();
        pk_3 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        pk_2 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        fees_p1 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        pk_combo1 = new javax.swing.JComboBox<>();
        jLabel191 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1630, 970));

        edite_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel121.setText("Have You had Surgery Before?");
        edite_details.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 174, 22));

        jLabel122.setText("Are You a Pregnant?");
        edite_details.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        buttonGroup14.add(jRadioButton17);
        jRadioButton17.setActionCommand("1");
        jRadioButton17.setText("Yes");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        buttonGroup14.add(jRadioButton18);
        jRadioButton18.setActionCommand("2");
        jRadioButton18.setText("No");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jLabel123.setText("Weight");
        edite_details.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        jLabel124.setText("Birth Day");
        edite_details.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 560, 30));

        jLabel125.setText("Address");
        edite_details.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 46, 18));

        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 240, 30));

        jLabel126.setText("First Name");
        edite_details.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 72, 18));

        jLabel127.setText("Date");
        edite_details.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 29, 18));

        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(0, 255, 51));
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 236, 30));

        jLabel128.setText("Registration Number");
        edite_details.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 114, 18));

        jLabel129.setText("Marital Status");
        edite_details.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 83, 18));

        jLabel130.setText("Job");
        edite_details.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 19));

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 246, 33));

        jLabel131.setText("Mobile");
        edite_details.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 239, 30));

        jLabel132.setText("NIC");
        edite_details.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jTextField38.setEditable(false);
        jTextField38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 239, 30));

        jLabel133.setText("Gender");
        edite_details.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        buttonGroup16.add(jRadioButton25);
        jRadioButton25.setActionCommand("1");
        jRadioButton25.setText("Male");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        buttonGroup16.add(jRadioButton26);
        jRadioButton26.setActionCommand("2");
        jRadioButton26.setText("Female");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel134.setText("Payment Options");
        edite_details.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        jLabel135.setText("Name");
        edite_details.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 60, -1));

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 246, 30));

        jLabel136.setText("Mobile Numbers");
        edite_details.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, -1, -1));

        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 239, -1));

        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 239, -1));

        jLabel137.setText("Main Reson for Visiting");
        edite_details.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 239, 30));

        jLabel138.setText("Other Defects");
        edite_details.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 243, 50));

        jLabel139.setText("Other Treatments Currently Received");
        edite_details.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 239, 30));

        jLabel140.setText("Details Of Medicines Used");
        edite_details.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 239, 30));

        pk_label1.setText("Select Package :");
        edite_details.add(pk_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 100, 30));

        jLabel142.setText("Do You Drink Alcohol?");
        edite_details.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 393, 30));

        jLabel143.setText("Do You Eat Betel Nut?");
        edite_details.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 136, 30));

        buttonGroup17.add(jRadioButton27);
        jRadioButton27.setActionCommand("1");
        jRadioButton27.setText("Yes");
        edite_details.add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, 40));

        buttonGroup17.add(jRadioButton28);
        jRadioButton28.setActionCommand("2");
        jRadioButton28.setText("No");
        edite_details.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 220, -1, 40));

        buttonGroup18.add(jRadioButton29);
        jRadioButton29.setActionCommand("1");
        jRadioButton29.setText("Yes");
        edite_details.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, -1, 40));

        buttonGroup18.add(jRadioButton30);
        jRadioButton30.setActionCommand("2");
        jRadioButton30.setText("No");
        edite_details.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 250, -1, 40));

        buttonGroup19.add(jRadioButton31);
        jRadioButton31.setActionCommand("2");
        jRadioButton31.setText("No");
        edite_details.add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 280, -1, 40));

        buttonGroup19.add(jRadioButton32);
        jRadioButton32.setActionCommand("1");
        jRadioButton32.setText("Yes");
        edite_details.add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, -1, 40));

        jLabel144.setText("Do You Use Drugs?");
        edite_details.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, 30));

        buttonGroup20.add(jRadioButton33);
        jRadioButton33.setActionCommand("1");
        jRadioButton33.setText("Yes");
        edite_details.add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, -1, 40));

        buttonGroup20.add(jRadioButton34);
        jRadioButton34.setActionCommand("2");
        jRadioButton34.setText("No");
        edite_details.add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 310, -1, 40));

        jLabel145.setText("Do You Have a Habit ot Sleeping on One Side?");
        edite_details.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 275, 30));

        buttonGroup21.add(jRadioButton35);
        jRadioButton35.setActionCommand("1");
        jRadioButton35.setText("Yes");
        edite_details.add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 340, -1, 40));

        buttonGroup21.add(jRadioButton36);
        jRadioButton36.setActionCommand("2");
        jRadioButton36.setText("No");
        edite_details.add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 340, -1, 40));

        jLabel146.setText("Do You Have a Habit of Sleeping With Your Arms Folded?");
        edite_details.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 326, 30));

        buttonGroup22.add(jRadioButton37);
        jRadioButton37.setActionCommand("1");
        jRadioButton37.setText("Yes");
        edite_details.add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, -1, 40));

        buttonGroup22.add(jRadioButton38);
        jRadioButton38.setActionCommand("2");
        jRadioButton38.setText("No");
        edite_details.add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 370, -1, 40));

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel147.setText("Other Contact Numbers");
        edite_details.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel148.setForeground(new java.awt.Color(102, 102, 102));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setText("Kg");
        edite_details.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, 40, 30));

        jLabel149.setText("Do You Smoke?");
        edite_details.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 101, 30));

        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 240, 30));

        jButton10.setText("Update New Patient");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        edite_details.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 900, 160, 50));

        buttonGroup1.add(jRadioButton39);
        jRadioButton39.setActionCommand("1");
        jRadioButton39.setText("Full Payment");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 120, 40));

        buttonGroup1.add(jRadioButton40);
        jRadioButton40.setActionCommand("2");
        jRadioButton40.setText("Daily Payment");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });
        edite_details.add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 120, 40));

        mainpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pk_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel150.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel150.setText("Booking Fees  :");
        pk_3.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel151.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel151.setText("Free");
        pk_3.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel152.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel152.setText("Mainly Focus Occupation :");
        pk_3.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel153.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel153.setText("Rs. 300000 /=");
        pk_3.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel154.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel154.setText("Full Payment :");
        pk_3.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel155.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel155.setText("Treetment Dates :");
        pk_3.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel156.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel156.setText("30 Days");
        pk_3.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel157.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel157.setText("Package 02");
        pk_3.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel158.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel158.setText("Package Name :");
        pk_3.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel159.setForeground(new java.awt.Color(153, 153, 153));
        jLabel159.setText("Package details");
        pk_3.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel160.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel160.setText("Package 02");
        pk_3.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        mainpanel1.add(pk_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 970));

        pk_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel161.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel161.setText("Package 01");
        pk_2.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        jLabel162.setForeground(new java.awt.Color(153, 153, 153));
        jLabel162.setText("Package details");
        pk_2.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel163.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel163.setText("Package Name :");
        pk_2.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel164.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel164.setText("Treetment Dates :");
        pk_2.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel165.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel165.setText("Full Payment :");
        pk_2.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel166.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel166.setText("Rs. 450000 /=");
        pk_2.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel167.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel167.setText("Mainly Focus Occupation :");
        pk_2.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel168.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel168.setText("Package 01");
        pk_2.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel169.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel169.setText("45 Days");
        pk_2.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel170.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel170.setText("Booking Fees  :");
        pk_2.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel171.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel171.setText("Free");
        pk_2.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        mainpanel1.add(pk_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 970));

        fees_p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel172.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel172.setText("45 Days");
        fees_p1.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel173.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel173.setText("Treetment Dates :");
        fees_p1.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel174.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel174.setText("Full Payment :");
        fees_p1.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel175.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel175.setText("Rs. 8000 /=");
        fees_p1.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel176.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel176.setText("1st Day :");
        fees_p1.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel177.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel177.setText("Daily Payment Method");
        fees_p1.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        jLabel178.setForeground(new java.awt.Color(153, 153, 153));
        jLabel178.setText("Details");
        fees_p1.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel179.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel179.setText("Booking Fees :");
        fees_p1.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel180.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel180.setText("Rs. 300000 /=");
        fees_p1.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel181.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel181.setText("2nd Day :");
        fees_p1.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel182.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel182.setText("Rs. 6000 /=");
        fees_p1.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel183.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel183.setText("3rd Day :");
        fees_p1.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel184.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel184.setText("Rs. 4000 /=");
        fees_p1.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel185.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel185.setText("4th Day :");
        fees_p1.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel186.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel186.setText("Rs. 2000 /=");
        fees_p1.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel187.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel187.setText("5th Day :");
        fees_p1.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel188.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel188.setText("Rs. 2000 /=");
        fees_p1.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel189.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel189.setText("45th Day :");
        fees_p1.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel190.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel190.setText("Rs. 2000 /=");
        fees_p1.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        javax.swing.GroupLayout main_p1Layout = new javax.swing.GroupLayout(main_p1);
        main_p1.setLayout(main_p1Layout);
        main_p1Layout.setHorizontalGroup(
            main_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(main_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fees_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
        main_p1Layout.setVerticalGroup(
            main_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(main_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fees_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
        );

        edite_details.add(main_p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 300, 970));

        pk_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Package", "Packge 01", "Packge 02" }));
        pk_combo1.setEnabled(false);
        pk_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pk_combo1ActionPerformed(evt);
            }
        });
        edite_details.add(pk_combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 570, 30));

        jLabel191.setText("Your Payment Option :");
        edite_details.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 130, 30));

        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });
        jTextField47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField47KeyPressed(evt);
            }
        });
        edite_details.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 260, 30));

        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        edite_details.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 30));

        jLabel192.setText("NIC");
        edite_details.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, 30));

        jLabel195.setText("Last Name");
        edite_details.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 72, 18));

        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });
        edite_details.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 240, 30));

        jDateChooser3.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser3.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edite_details.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 240, 30));

        jDateChooser4.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser4.setEnabled(false);
        jDateChooser4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edite_details.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 240, 30));

        buttonGroup13.add(jRadioButton47);
        jRadioButton47.setActionCommand("2");
        jRadioButton47.setText("No");
        edite_details.add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        buttonGroup13.add(jRadioButton48);
        jRadioButton48.setActionCommand("1");
        jRadioButton48.setText(" Yes");
        edite_details.add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        buttonGroup15.add(jRadioButton49);
        jRadioButton49.setActionCommand("2");
        jRadioButton49.setText("No");
        edite_details.add(jRadioButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        buttonGroup15.add(jRadioButton50);
        jRadioButton50.setActionCommand("1");
        jRadioButton50.setText("Yes");
        edite_details.add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        edite_details.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(edite_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(edite_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String regNo = jTextField34.getText();
        String regDate = jDateChooser4.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate()) : "";
        String otcr = jTextField44.getText();
        String firstName = jTextField32.getText();
        String lastName = jTextField48.getText();
        String birthday = jDateChooser3.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser3.getDate()) : "";
        String nic = jTextField38.getText();
        String mrfv = jTextField42.getText();

        // Added null checks and proper group references
        String gender = buttonGroup16.getSelection() != null ? buttonGroup16.getSelection().getActionCommand() : "";
        String payment = buttonGroup1.getSelection() != null ? buttonGroup1.getSelection().getActionCommand() : "";

        String address = jTextField31.getText();
        String mobile = jTextField37.getText();
        String otherName = jTextField39.getText();
        String otherCon1 = jTextField40.getText();
        String otherCon2 = jTextField41.getText();

        // Added null checks and proper group references
        String smoke = buttonGroup17.getSelection() != null ? buttonGroup17.getSelection().getActionCommand() : "";
        String alcohol = buttonGroup18.getSelection() != null ? buttonGroup18.getSelection().getActionCommand() : "";
        String betelNut = buttonGroup19.getSelection() != null ? buttonGroup19.getSelection().getActionCommand() : "";
        String drugs = buttonGroup20.getSelection() != null ? buttonGroup20.getSelection().getActionCommand() : "";
        String sleepingOnOneSide = buttonGroup21.getSelection() != null ? buttonGroup21.getSelection().getActionCommand() : "";
        String sleepingWithArmsFolded = buttonGroup22.getSelection() != null ? buttonGroup22.getSelection().getActionCommand() : "";
        String domu = jTextField45.getText();
        String otherDefects = jTextField43.getText();
        String weight = jTextField46.getText() + "Kg";
        String surgery = buttonGroup13.getSelection() != null ? buttonGroup13.getSelection().getActionCommand() : "";

        // Added null checks and proper group references
        String pregnant = buttonGroup14.getSelection() != null ? buttonGroup14.getSelection().getActionCommand() : "";
        String maritalStatus = buttonGroup16.getSelection() != null ? buttonGroup16.getSelection().getActionCommand() : "";

        String job = jTextField36.getText();

        if (!address.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid address format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (job.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Job.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!mobile.matches("0\\d{9}")) {
            JOptionPane.showMessageDialog(this, "Invalid Mobile Number format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (otcr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Other Treatments Currently Received format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (domu.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Details Of Medicines Used format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (surgery.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if Have You had Surgery Before?", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (pregnant.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if pregnant", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!firstName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Invalid First Name format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!lastName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Last Name format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jDateChooser3.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please enter the date of birth", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (maritalStatus.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter marital status", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!nic.matches("\\d{1,12}[vxVX]?")) {
            JOptionPane.showMessageDialog(this, "Invalid NIC number format (up to 12 digits with optional 'v' or 'x').", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a gender", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!mrfv.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Main Reason for Visiting format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!otherName.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid other names format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!otherCon1.matches("0\\d{9}")) {
            JOptionPane.showMessageDialog(this, "Invalid other contact 1", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!otherCon2.matches("0\\d{9}")) {
            JOptionPane.showMessageDialog(this, "Invalid other contact 2", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (smoke.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if smoker", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (alcohol.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if alcohol consumer", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (betelNut.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if betel nut consumer", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (drugs.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if drug user", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sleepingOnOneSide.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if sleeping on one side", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sleepingWithArmsFolded.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select if sleeping with arms folded", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (payment.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select payment method", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            MySQL.execute("UPDATE `pations` SET `reg_no` = '" + regNo + "', `reg_date` = '" + regDate + "', `otcr` = '" + otcr + "', `f_name` = '" + firstName + "', `l_name` = '" + lastName + "', `birthday` = '" + birthday + "', `mrfv` = '" + mrfv + "', `gender_gender_id` = '" + gender + "', `payment_type_id` = '" + payment + "' WHERE `nic` = '" + nic + "'");

            MySQL.execute("UPDATE `pations_contact` SET `addres` = '" + address + "', `another_name` = '" + otherName + "', `pations_mobile` = '" + mobile + "', `mobile_1` = '" + otherCon1 + "', `mobile_2` = '" + otherCon2 + "' WHERE `pations_nic` = '" + nic + "'");

            MySQL.execute("UPDATE `pations_helth` SET `smoke_smoke_id` = '" + smoke + "', `Alcohol_Alcohol_id` = '" + alcohol + "', `betal_nut_betal_nut_id` = '" + betelNut + "', `drugs_drugs_id` = '" + drugs + "', `sleep_one_side_one_side_id` = '" + sleepingOnOneSide + "', `arm_sleep_sleep_arm_id` = '" + sleepingWithArmsFolded + "', `damu` = '" + domu + "', `other_defects` = '" + otherDefects + "', `weight` = '" + weight + "', `suger_suger_id` = '" + surgery + "' WHERE `pations_nic` = '" + nic + "'");

            MySQL.execute("UPDATE `pations_other_detailes` SET `Pregnant_Pregnant_id` = '" + pregnant + "', `marital_Status_Marital_id` = '" + maritalStatus + "',  `job` = '" + job + "' WHERE `pations_nic` = '" + nic + "'");

            JOptionPane.showMessageDialog(this, "Updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while updating the data", "Error!", JOptionPane.ERROR_MESSAGE);
        }

        resetedit();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
        pk_label1.setVisible(true);
        pk_combo1.setVisible(true);
        mainpanel1.setVisible(true);
        fees_p1.setVisible(false);
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        // TODO add your handling code here:
        pk_label1.setVisible(false);
        pk_combo1.setVisible(false);
        mainpanel1.setVisible(false);
        fees_p1.setVisible(true);
        pk_combo1.setSelectedIndex(0);
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void pk_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pk_combo1ActionPerformed
        // TODO add your handling code here:
        int pk_data1 = pk_combo1.getSelectedIndex();

        if (pk_data1 == 1) {
            pk_2.setVisible(true);
            pk_3.setVisible(false);
        } else if (pk_data1 == 2) {
            pk_2.setVisible(false);
            pk_3.setVisible(true);
        } else {
            pk_2.setVisible(false);
            pk_3.setVisible(false);

        }
    }//GEN-LAST:event_pk_combo1ActionPerformed

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        performSearch();
    }

    private String findPlaceById(int id) {
        for (Map.Entry<String, Integer> entry : placeMap.entrySet()) {
            if (entry.getValue().equals(id)) {
                return entry.getKey();
            }
        }
        return "Select";

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField47KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            // Perform the search action
            performSearch();
        }
    }//GEN-LAST:event_jTextField47KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        resetedit();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.JPanel edite_details;
    private javax.swing.JPanel fees_p1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JPanel main_p1;
    private javax.swing.JPanel mainpanel1;
    private javax.swing.JPanel pk_2;
    private javax.swing.JPanel pk_3;
    private javax.swing.JComboBox<String> pk_combo1;
    private javax.swing.JLabel pk_label1;
    // End of variables declaration//GEN-END:variables
}
