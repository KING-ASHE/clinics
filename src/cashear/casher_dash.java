package cashear;

import gui.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import java.awt.Component;

import javax.swing.JPanel;

import javax.swing.SwingUtilities;

public class casher_dash extends javax.swing.JFrame {

    private Component panel;

    public casher_dash() {

        initComponents();
        addPanel(new view_dash());

    }

    public void get(String reg_n, String nic, String name, String l_name, String payment) {

        nic_n.setText(nic);
        f_name_lname.setText(name+" "+l_name);
        reg.setText(reg_n);

        System.out.println("Registration Number: " + reg_n);
        System.out.println("NIC: " + nic);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + l_name);
        System.out.println("Payment: " + payment);

    }

    private void addPanel(JPanel newPanel) {
        if (panel == null) {
            panel = newPanel;

            main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            main.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, main.getWidth(), main.getHeight()));
            main.revalidate();
            main.repaint();
            SwingUtilities.updateComponentTreeUI(main);
        }
    }

    public void removePanel() {
        if (panel != null) {
            main.remove(panel);
            main.revalidate();
            main.repaint();
            panel = null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        tab_panel = new javax.swing.JTabbedPane();
        homepanel = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nic_n = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        f_name_lname = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        reg = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("SURABE CLINIC");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Billing & Patient Managment System ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 2, 13)); // NOI18N
        jLabel3.setText("Powerd By : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3 (2).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 10, 80, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ed-removebg-preview (2).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 80));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close (1).png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 10, -1, -1));

        jLabel196.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 10, 180, 30));

        jLabel197.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 40, 180, 30));

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(204, 204, 204));
        jLabel141.setText("(V 0. 002)");
        jPanel2.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 80));

        tab_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_panel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_panelStateChanged(evt);
            }
        });
        tab_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_panelMouseClicked(evt);
            }
        });
        tab_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tab_panelComponentShown(evt);
            }
        });

        homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1630, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );

        homepanel.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 970));

        jPanel8.setBackground(new java.awt.Color(0, 153, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Delete Patient Details");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, 32));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8725956_file_alt_icon.png"))); // NOI18N
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 30, 40));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Edit Patient Details");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/103774_add_user_half_icon.png"))); // NOI18N
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 30, 40));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/103777_user_remove_half_icon.png"))); // NOI18N
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 30, 40));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/103775_edit_user_half_icon.png"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 30, 40));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8541577_coins_currency_icon (1).png"))); // NOI18N
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 30, 40));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Add New Patient Details");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Patient List ");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel10AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setText("Account Details");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setText("Patient Details");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Quick Links");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("Patients Payments");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 780, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setText("New Apointment");
        jLabel14.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel14AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8725908_file_edit_alt_icon.png"))); // NOI18N
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 30, 40));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("Edit Apointment");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8725948_file_block_alt_icon.png"))); // NOI18N
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 40));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setText("Delete Apointment");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8725957_file_plus_alt_icon.png"))); // NOI18N
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 40));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setText("Preview Apointment");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/103773_user_half_icon.png"))); // NOI18N
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 30, 40));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel28.setText("My Dashboard");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-dashboard-30.png"))); // NOI18N
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 30, 40));

        homepanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 0, 290, 970));

        tab_panel.addTab("Home", homepanel);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 236, 30));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setText("Treatment Occupation :");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 18));

        jLabel63.setText("Patient's Full Name :");
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 18));

        jLabel64.setText("NIC number :");
        jPanel9.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 18));

        jLabel65.setText("Registered Date :");
        jPanel9.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 18));

        jLabel66.setText("Payment Option :");
        jPanel9.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 18));

        jLabel67.setText("Treatment Dates :");
        jPanel9.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 18));

        jButton2.setText("Set Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 800, 160, 50));

        jLabel68.setText("Age :");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 18));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Number Of Dates", "Due Dates", "Payments", "Due Payment"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1870, 80));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Number of Dates", "Payments"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 1870, 130));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1920, 870));

        jLabel62.setText("Patients' s NIC number :");
        jPanel4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 18));

        jButton3.setText("Search");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, 30));

        tab_panel.addTab("Clinic Details", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Report Privew");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, 620, 900));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, 10, 880));

        jLabel32.setText("Register Number:");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));
        jPanel5.add(nic_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 370, 30));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, 30));

        f_name_lname.setEditable(false);
        f_name_lname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(f_name_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 30));

        jLabel33.setText("Select Patient :");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Day", "Ammont"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 480, 110));

        jLabel34.setText("Before Payments :");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel35.setText("Other Payments :");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Item / Service", "Ammount"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 480, 120));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date ", "Product / Services", "Qty", "Full Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 650, 760));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setText("Add Anouther Items/ Services :");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 30));

        jButton6.setText("Select");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 110, 30));

        jLabel37.setText("Sub Total :");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 30));

        jLabel38.setText("Discount :");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Total Ammount");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(-125, -25, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Total Ammount");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel41.setText("Rs. 10000 /=");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 440, 200));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 40));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, 30));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 480, 440));

        jLabel42.setText("Name :");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        reg.setEditable(false);
        reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reg.setForeground(new java.awt.Color(0, 102, 0));
        jPanel5.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 30));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Day", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);

        jPanel5.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 650, 130));

        tab_panel.addTab("Billing", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product_id", "Product Name", "Qty", "Price", "Ex Date", "Added Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setRowHeight(30);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(30);
        }

        jPanel10.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 1900, 900));
        jPanel10.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 22, 260, 30));

        jButton10.setText("Search");
        jPanel10.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 23, -1, 30));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        tab_panel.addTab("Inventry", jPanel6);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "NIC", "Appoiment Number", "Payment", "Treetment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(35);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1370, 830));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Day", "2024/03/13" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel11.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 30));

        jLabel91.setText("NIC number :");
        jPanel11.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel92.setText("Select Date :");
        jPanel11.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 210, 30));

        jButton5.setText("Search");
        jPanel11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 90, 30));

        jLabel112.setText("Date :");
        jPanel11.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 120, -1, 20));

        jLabel113.setText("Treetment Date :");
        jPanel11.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 420, -1, 20));

        jLabel114.setText("NIC Number :");
        jPanel11.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 200, -1, 20));

        jLabel115.setText("Appoiment Number :");
        jPanel11.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 280, -1, 20));

        jLabel116.setText("Payment :");
        jPanel11.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 350, -1, 20));
        jPanel11.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 450, 300, 30));
        jPanel11.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 150, 300, 30));
        jPanel11.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 230, 300, 30));
        jPanel11.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 310, 300, 30));
        jPanel11.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 380, 300, 30));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Print Appoiment Sheet");
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 560, 300, 40));

        jButton8.setBackground(new java.awt.Color(255, 102, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Close Appoiment");
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 510, 150, 40));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel117.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel117.setText("Get Some Reports ");
        jPanel12.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 620, 500, 330));

        jButton9.setText("Extend Appoiment");
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 510, 140, 40));

        tab_panel.addTab("Booking Reports", jPanel11);

        jPanel1.add(tab_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1920, 1000));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        booking b1 = new booking();
        b1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        removePanel();

        addPanel(new pation_details());

    }//GEN-LAST:event_jLabel10MouseClicked

    private void tab_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_panelMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tab_panelMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        removePanel();
        addPanel(new add_patian());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        tab_panel.setSelectedIndex(5);


    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        removePanel();
        addPanel(new edit_pation());

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel14AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel14AncestorAdded


    }//GEN-LAST:event_jLabel14AncestorAdded

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked

        removePanel();
        addPanel(new view_dash());
    }//GEN-LAST:event_jLabel28MouseClicked

    private void tab_panelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_panelStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_panelStateChanged

    private void tab_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tab_panelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_panelComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


       
        select_pations select_p = new select_pations(this, true);

        select_p.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel10AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10AncestorAdded

    public static void main(String args[]) {

        FlatMacDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new casher_dash().setVisible(true);

            }
        });

    }

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
    private javax.swing.JTextField f_name_lname;
    private javax.swing.JPanel homepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel main;
    private javax.swing.JTextField nic_n;
    private javax.swing.JTextField reg;
    private javax.swing.JTabbedPane tab_panel;
    // End of variables declaration//GEN-END:variables
}
