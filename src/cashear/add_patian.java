/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cashear;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.MySQL;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lochana
 */
public class add_patian extends javax.swing.JPanel {

    private int lastID;

    HashMap<String, Object> printReport = new HashMap<>();
    public String Mobile = "0762555196";
    public String Address = "No,15 Kohombahena Pannirendawa";
    public LocalDate currentDateTime = LocalDate.now();
    public String stringDate = String.valueOf(currentDateTime);
    public static HashMap<String, Integer> placeMap = new HashMap<>();

    public add_patian() {
        initComponents();
        loadNextID();
        setdate();
        find_out_place();

        pk_label.setVisible(false);
        pk_combo.setVisible(false);
        pk_01.setVisible(false);
        pk_02.setVisible(false);
        fees_p.setVisible(false);
        
        

    }

    private void loadNextID() {

        try {
            ResultSet rs = MySQL.execute("SELECT MAX(reg_no) AS lastID FROM pations");
            if (rs.next()) {
                String lastIDString = rs.getString("lastID");
                if (lastIDString != null) {
                    lastID = Integer.parseInt(lastIDString.replace("SC0", ""));
                } else {
                    lastID = 0;
                }
                jLabel198.setText(generateNextID());
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching next ID: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(casher_dash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateNextID() {
        lastID++;
        return "SC0" + String.format("%02d", lastID);
    }

    private void setdate() {
        Date today = new Date();
        jDateChooser2.setForeground(new Color(204, 0, 0));
        jDateChooser2.setDate(today);
    }

    private void find_out_place() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM `find_out_place`");
            Vector<String> v = new Vector<>();
            v.add("Select");

            while (rs.next()) {
                v.add(rs.getString("place_find"));
                placeMap.put(rs.getString("place_find"), rs.getInt("find_out_place_id"));
            }

            DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>(v);
            jComboBox2.setModel(m);

        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private void reset() {
        jDateChooser2.setDate(null);

        jTextField9.setText("");

        jTextField13.setText("");
        jTextField14.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        buttonGroup11.clearSelection();
        buttonGroup3.clearSelection();
        jTextField10.setText("");
        jTextField27.setText("");
        jDateChooser1.setDate(null);
        buttonGroup12.clearSelection();
        jTextField15.setText("");
        buttonGroup4.clearSelection();
        jTextField19.setText("");
        jTextField20.setText("");
        buttonGroup2.clearSelection();
        jComboBox2.setSelectedIndex(0);
        jTextField25.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");

        buttonGroup6.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        buttonGroup10.clearSelection();
        buttonGroup1.clearSelection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        home_content = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        pk_label = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jLabel60 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        main_p = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        pk_02 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        pk_01 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        fees_p = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        pk_combo = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel198 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();

        home_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup5.add(jRadioButton3);
        jRadioButton3.setActionCommand("1");
        jRadioButton3.setText("Yes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        buttonGroup5.add(jRadioButton4);
        jRadioButton4.setActionCommand("2");
        jRadioButton4.setText("No");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, -1, -1));

        jLabel47.setText("Acupuncture Clinic Before?");
        home_content.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        jLabel48.setText("How to Find out about This Place?");
        home_content.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 210, 24));

        jLabel49.setText("Have You had Surgery Before?");
        home_content.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 174, 22));

        jLabel50.setText("Are You a Pregnant?");
        home_content.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setActionCommand("1");
        jRadioButton5.setText("Yes");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setActionCommand("2");
        jRadioButton6.setText("No");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel51.setText("Weight");
        home_content.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        jLabel30.setText("Birth Day");
        home_content.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        home_content.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 560, 30));

        jLabel31.setText("Address");
        home_content.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 46, 18));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        home_content.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 240, 30));

        jLabel32.setText("First Name");
        home_content.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 72, 18));

        jLabel33.setText("Date");
        home_content.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 29, 18));

        jLabel34.setText("Registration Number");
        home_content.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 18));

        jLabel28.setText("Marital Status");
        home_content.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 83, 18));

        jLabel35.setText("Job");
        home_content.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 19));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        home_content.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 33));

        jLabel36.setText("Mobile");
        home_content.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        home_content.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 239, 30));

        jLabel37.setText("NIC");
        home_content.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        home_content.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 239, 30));

        jLabel38.setText("Gender");
        home_content.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        buttonGroup4.add(jRadioButton1);
        jRadioButton1.setActionCommand("1");
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        buttonGroup4.add(jRadioButton2);
        jRadioButton2.setActionCommand("2");
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Payment Options");
        home_content.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jLabel40.setText("Name");
        home_content.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 830, 60, -1));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        home_content.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 850, 246, 30));

        jLabel41.setText("Mobile Numbers");
        home_content.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 830, -1, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        home_content.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 850, 239, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        home_content.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 880, 239, -1));

        jLabel42.setText("Main Reson for Visiting");
        home_content.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        home_content.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 239, 30));

        jLabel43.setText("Other Defects");
        home_content.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        home_content.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 243, 50));

        jLabel44.setText("Other Treatments Currently Received");
        home_content.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        home_content.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 239, 30));

        jLabel45.setText("Details Of Medicines Used");
        home_content.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        home_content.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 239, 30));

        jLabel46.setText("Have You Received Treatment From an ");
        home_content.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        pk_label.setText("Select Package :");
        home_content.add(pk_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 100, 30));

        jLabel53.setText("Do You Drink Alcohol?");
        home_content.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 393, 30));

        jLabel54.setText("Do You Eat Betel Nut?");
        home_content.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 136, 30));

        buttonGroup6.add(jRadioButton7);
        jRadioButton7.setActionCommand("1");
        jRadioButton7.setText("Yes");
        home_content.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, 40));

        buttonGroup6.add(jRadioButton8);
        jRadioButton8.setActionCommand("2");
        jRadioButton8.setText("No");
        home_content.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, -1, 40));

        buttonGroup7.add(jRadioButton9);
        jRadioButton9.setActionCommand("1");
        jRadioButton9.setText("Yes");
        home_content.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, 40));

        buttonGroup7.add(jRadioButton10);
        jRadioButton10.setActionCommand("2");
        jRadioButton10.setText("No");
        home_content.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, -1, 40));

        buttonGroup8.add(jRadioButton11);
        jRadioButton11.setActionCommand("2");
        jRadioButton11.setText("No");
        home_content.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, -1, 40));

        buttonGroup8.add(jRadioButton12);
        jRadioButton12.setActionCommand("1");
        jRadioButton12.setText("Yes");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, -1, 40));

        jLabel58.setText("Do You Use Drugs?");
        home_content.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, 30));

        buttonGroup9.add(jRadioButton19);
        jRadioButton19.setActionCommand("1");
        jRadioButton19.setText("Yes");
        home_content.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, -1, 40));

        buttonGroup9.add(jRadioButton20);
        jRadioButton20.setActionCommand("2");
        jRadioButton20.setText("No");
        home_content.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 120, -1, 40));

        jLabel59.setText("Do You Have a Habit ot Sleeping on One Side?");
        home_content.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 275, 30));

        buttonGroup10.add(jRadioButton21);
        jRadioButton21.setActionCommand("1");
        jRadioButton21.setText("Yes");
        home_content.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, -1, 40));

        buttonGroup10.add(jRadioButton22);
        jRadioButton22.setActionCommand("2");
        jRadioButton22.setText("No");
        home_content.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, -1, 40));

        jLabel60.setText("Do You Have a Habit of Sleeping With Your Arms Folded?");
        home_content.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 326, 30));

        buttonGroup11.add(jRadioButton23);
        jRadioButton23.setActionCommand("1");
        jRadioButton23.setText("Yes");
        home_content.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, -1, 40));

        buttonGroup11.add(jRadioButton24);
        jRadioButton24.setActionCommand("2");
        jRadioButton24.setText("No");
        home_content.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, -1, 40));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setText("Other Contact Numbers");
        home_content.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, -1, -1));

        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Kg");
        home_content.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, 40, 30));

        jLabel56.setText("Do You Smoke?");
        home_content.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 101, 30));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        home_content.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 240, 30));

        jButton12.setBackground(new java.awt.Color(51, 153, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Print");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        home_content.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 900, 160, 50));

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setActionCommand("1");
        jRadioButton13.setText("Full Payment");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 120, 40));

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setActionCommand("2");
        jRadioButton14.setText("Daily Payment");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 120, 40));

        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pk_02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel81.setText("Booking Fees  :");
        pk_02.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setText("Free");
        pk_02.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel83.setText("Mainly Focus Occupation :");
        pk_02.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Rs. 300000 /=");
        pk_02.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel85.setText("Full Payment :");
        pk_02.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel86.setText("Treetment Dates :");
        pk_02.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setText("30 Days");
        pk_02.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setText("Package 02");
        pk_02.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel89.setText("Package Name :");
        pk_02.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel71.setForeground(new java.awt.Color(153, 153, 153));
        jLabel71.setText("Package details");
        pk_02.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel90.setText("Package 02");
        pk_02.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        mainpanel.add(pk_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 970));

        pk_01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel69.setText("Package 01");
        pk_01.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        jLabel70.setForeground(new java.awt.Color(153, 153, 153));
        jLabel70.setText("Package details");
        pk_01.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel72.setText("Package Name :");
        pk_01.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel73.setText("Treetment Dates :");
        pk_01.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel74.setText("Full Payment :");
        pk_01.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setText("Rs. 450000 /=");
        pk_01.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel76.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel76.setText("Mainly Focus Occupation :");
        pk_01.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setText("Package 01");
        pk_01.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel78.setText("45 Days");
        pk_01.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel79.setText("Booking Fees  :");
        pk_01.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText("Free");
        pk_01.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        mainpanel.add(pk_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 970));

        fees_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setText("45 Days");
        fees_p.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel94.setText("Treetment Dates :");
        fees_p.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel95.setText("Full Payment :");
        fees_p.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel96.setText("Rs. 8000 /=");
        fees_p.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setText("1st Day :");
        fees_p.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel100.setText("Daily Payment Method");
        fees_p.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, -1));

        jLabel101.setForeground(new java.awt.Color(153, 153, 153));
        jLabel101.setText("Details");
        fees_p.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel99.setText("Booking Fees :");
        fees_p.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setText("Rs. 300000 /=");
        fees_p.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel102.setText("2nd Day :");
        fees_p.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel103.setText("Rs. 6000 /=");
        fees_p.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel104.setText("3rd Day :");
        fees_p.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel105.setText("Rs. 4000 /=");
        fees_p.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel106.setText("4th Day :");
        fees_p.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel107.setText("Rs. 2000 /=");
        fees_p.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel108.setText("5th Day :");
        fees_p.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel109.setText("Rs. 2000 /=");
        fees_p.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel110.setText("45th Day :");
        fees_p.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel111.setText("Rs. 2000 /=");
        fees_p.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        javax.swing.GroupLayout main_pLayout = new javax.swing.GroupLayout(main_p);
        main_p.setLayout(main_pLayout);
        main_pLayout.setHorizontalGroup(
            main_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_pLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(main_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fees_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
        main_pLayout.setVerticalGroup(
            main_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_pLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(main_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fees_p, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
        );

        home_content.add(main_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 300, 970));

        pk_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Package", "Packge 01", "Packge 02" }));
        pk_combo.setEnabled(false);
        pk_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pk_comboActionPerformed(evt);
            }
        });
        home_content.add(pk_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 570, 30));

        jLabel57.setText("Your Payment Option :");
        home_content.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 130, 30));

        jLabel193.setText("Last Name");
        home_content.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 72, 18));

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        home_content.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 240, 30));

        jDateChooser1.setForeground(new java.awt.Color(242, 242, 242));
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDateChooser1.setInheritsPopupMenu(true);
        home_content.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 240, 30));

        jDateChooser2.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser2.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setToolTipText("");
        jDateChooser2.setEnabled(false);
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        home_content.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 240, 30));

        jRadioButton41.setText("No");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jRadioButton42.setText("Yes");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });
        home_content.add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        buttonGroup12.add(jRadioButton43);
        jRadioButton43.setActionCommand("2");
        jRadioButton43.setText("No");
        home_content.add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        buttonGroup12.add(jRadioButton44);
        jRadioButton44.setActionCommand("1");
        jRadioButton44.setText("yes");
        home_content.add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        buttonGroup3.add(jRadioButton45);
        jRadioButton45.setActionCommand("2");
        jRadioButton45.setText("No");
        home_content.add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        buttonGroup3.add(jRadioButton46);
        jRadioButton46.setActionCommand("1");
        jRadioButton46.setText("Yes");
        home_content.add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        home_content.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 240, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Register New Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        home_content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 900, 180, 50));

        jLabel198.setBackground(new java.awt.Color(255, 255, 255));
        jLabel198.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(102, 153, 0));
        home_content.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        home_content.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(home_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(home_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Do you want to print the report?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            printReport.put("date", stringDate);
            printReport.put("address", Address);
            printReport.put("mobile", Mobile);

            String reportPath = "src/reports/Blank_A4.jasper";
            JREmptyDataSource dataSource = new JREmptyDataSource();

            try {
                JasperPrint print = JasperFillManager.fillReport(reportPath, printReport, dataSource);
                JasperViewer.viewReport(print, false);

                //                if (JasperPrintManager.printReport(print, true)) {
                //
                //                    JOptionPane.showMessageDialog(null, "Report printed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                //                } else {
                //
                //                    JOptionPane.showMessageDialog(null, "Failed to print the report!", "Error", JOptionPane.ERROR_MESSAGE);
                //                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
        pk_label.setVisible(true);
        pk_combo.setVisible(true);
        mainpanel.setVisible(true);
        fees_p.setVisible(false);
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        pk_label.setVisible(false);
        pk_combo.setVisible(false);
        mainpanel.setVisible(false);
        fees_p.setVisible(true);
        pk_combo.setSelectedIndex(0);
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void pk_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pk_comboActionPerformed
        // TODO add your handling code here:
        int pk_data = pk_combo.getSelectedIndex();

        if (pk_data == 1) {
            pk_01.setVisible(true);
            pk_02.setVisible(false);
        } else if (pk_data == 2) {
            pk_01.setVisible(false);
            pk_02.setVisible(true);
        } else {
            pk_01.setVisible(false);
            pk_02.setVisible(false);

        }
    }//GEN-LAST:event_pk_comboActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String date = jDateChooser2.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate()) : "";
        String bod = jDateChooser1.getDate() != null ? new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate()) : "";
        String address = jTextField9.getText();
        String occupation = jTextField13.getText();
        String regi_id = jLabel198.getText();
        String mobile = jTextField14.getText();
        String otcr = jTextField21.getText();
        String domu = jTextField22.getText();
        ButtonModel suger = buttonGroup1.getSelection();
        ButtonModel pregnant = buttonGroup2.getSelection();
        String firstName = jTextField10.getText();
        String lastName = jTextField27.getText();
        ButtonModel mstatus = buttonGroup3.getSelection();
        String nic = jTextField15.getText();
        ButtonModel gender = buttonGroup4.getSelection();
        String mrfv = jTextField19.getText();
        String od = jTextField20.getText();
        ButtonModel hrtaBefore = buttonGroup5.getSelection();
        String hfadb = String.valueOf(jComboBox2.getSelectedItem());
        String weight = jTextField25.getText();
        String otherName = jTextField16.getText();
        String otherCon1 = jTextField17.getText();
        String otherCon2 = jTextField18.getText();
        ButtonModel smoke = buttonGroup6.getSelection();
        ButtonModel alcohol = buttonGroup7.getSelection();
        ButtonModel betelNut = buttonGroup8.getSelection();
        ButtonModel drugs = buttonGroup9.getSelection();
        ButtonModel sleepingOnOneSide = buttonGroup10.getSelection();
        ButtonModel sleepingWithArmsFolded = buttonGroup11.getSelection();
        ButtonModel payment = buttonGroup1.getSelection();

        if (jDateChooser2.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please enter a date", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!address.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid address format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (occupation.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Job.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!mobile.matches("0\\d{9}")) {
            JOptionPane.showMessageDialog(this, "Invalid Mobile Number format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!otcr.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Other Treatments Currently Received format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!domu.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Details Of Medicines Used format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (suger == null) {
            JOptionPane.showMessageDialog(this, "Please select if Have You had Surgery Before?", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (pregnant == null) {
            JOptionPane.showMessageDialog(this, "Please select if pregnant", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!firstName.matches("[a-zA-Z/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid First Name format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!lastName.matches("[a-zA-Z/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Last Name format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please enter the date of birth", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (mstatus == null) {
            JOptionPane.showMessageDialog(this, "Please enter marital status", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!nic.matches("\\d{1,12}[vxVX]?")) {
            JOptionPane.showMessageDialog(this, "Invalid NIC number format (up to 12 digits with optional 'v' or 'x').", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gender == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!mrfv.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Main Reason for Visiting format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!od.matches("[a-zA-Z0-9/,\\.\\s]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Other Defects format.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (hrtaBefore == null) {
            JOptionPane.showMessageDialog(this, "Please select Acupuncture Clinic Before?", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (hfadb.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select How to Find out about This Place?", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!weight.matches("\\d{2,3}")) {
            JOptionPane.showMessageDialog(this, "Invalid weight format.", "Error!", JOptionPane.ERROR_MESSAGE);
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
        if (smoke == null) {
            JOptionPane.showMessageDialog(this, "Please select if smoker", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (alcohol == null) {
            JOptionPane.showMessageDialog(this, "Please select if alcohol consumer", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (betelNut == null) {
            JOptionPane.showMessageDialog(this, "Please select if betel nut consumer", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (drugs == null) {
            JOptionPane.showMessageDialog(this, "Please select if drug user", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sleepingOnOneSide == null) {
            JOptionPane.showMessageDialog(this, "Please select if sleeping on one side", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sleepingWithArmsFolded == null) {
            JOptionPane.showMessageDialog(this, "Please select if sleeping with arms folded", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (payment == null) {
            JOptionPane.showMessageDialog(this, "Please select payment method", "Error!", JOptionPane.ERROR_MESSAGE);
           return;
        }

        try {
            ResultSet rs = MySQL.execute("SELECT COUNT(*) AS count FROM `pations` WHERE `nic` = '" + nic + "'");
            if (rs.next() && rs.getInt("count") > 0) {
               JOptionPane.showMessageDialog(this, "NIC already exists. Please use a different NIC.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while checking the NIC", "Error!", JOptionPane.ERROR_MESSAGE);
           return;
}



        Integer findPlace_id = placeMap.get(hfadb);
        if (findPlace_id == null) {
            JOptionPane.showMessageDialog(this, "Invalid selection for How to Find out about This Place", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String Gender = gender.getActionCommand();
        String Suger = suger.getActionCommand();
        String Pregnant = pregnant.getActionCommand();
        String Marital = mstatus.getActionCommand();
        String HrtaBefore = hrtaBefore.getActionCommand();
        String Smoke = smoke.getActionCommand();
        String Alcohol = alcohol.getActionCommand();
        String BetelNut = betelNut.getActionCommand();
        String Drugs = drugs.getActionCommand();
        String OneSide = sleepingOnOneSide.getActionCommand();
        String ArmsFolded = sleepingWithArmsFolded.getActionCommand();
        String Payment = payment.getActionCommand();

        try {
            Integer.parseInt(Payment);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid payment method selected", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            MySQL.execute("INSERT INTO `pations`(`reg_no`, `reg_date`, `otcr`, `f_name`, `l_name`, `birthday`, `nic`, `gender_gender_id`, `mrfv`, `payment_type_id`,`pation_States_p_stetus_id`) "
                    + "VALUES('" + regi_id + "','" + date + "','" + otcr + "','" + firstName + "','" + lastName + "','" + bod + "','" + nic + "','" + Gender + "','" + mrfv + "','" + Payment + "','1')");

            MySQL.execute("INSERT INTO `pations_contact`(`addres`, `another_name`, `pations_mobile`, `mobile_1`, `mobile_2`, `pations_nic`) "
                    + "VALUES('" + address + "','" + otherName + "','" + mobile + "','" + otherCon1 + "','" + otherCon2 + "','" + nic + "')");

            MySQL.execute("INSERT INTO `pations_helth`(`smoke_smoke_id`, `Alcohol_Alcohol_id`, `betal_nut_betal_nut_id`, `drugs_drugs_id`, `sleep_one_side_one_side_id`, `arm_sleep_sleep_arm_id`, `damu`, `other_defects`, `pations_nic`, `weight`, `suger_suger_id`) "
                    + "VALUES('" + Smoke + "','" + Alcohol + "','" + BetelNut + "','" + Drugs + "','" + OneSide + "','" + ArmsFolded + "','" + domu + "','" + od + "','" + nic + "','" + weight + "Kg', '" + Suger + "')");

            MySQL.execute("INSERT INTO `pations_other_detailes`(`Pregnant_Pregnant_id`, `marital_Status_Marital_id`, `find_out_place_find_out_place_id`, `acupuncture_clinic_before_clinic_before_id`, `job`, `pations_nic`) "
                    + "VALUES('" + Pregnant + "','" + Marital + "','" + findPlace_id + "','" + HrtaBefore + "','" + occupation + "','" + nic + "')");

            reset();
            loadNextID();
            setdate();
            JOptionPane.showMessageDialog(this, "Saved successfully");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while saving the data", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:

        loadNextID();
    }//GEN-LAST:event_jButton14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JPanel fees_p;
    private javax.swing.JPanel home_content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel main_p;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel pk_01;
    private javax.swing.JPanel pk_02;
    private javax.swing.JComboBox<String> pk_combo;
    private javax.swing.JLabel pk_label;
    // End of variables declaration//GEN-END:variables
}
