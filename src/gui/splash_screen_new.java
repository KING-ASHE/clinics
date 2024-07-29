
package gui;

import Model.logs;
import Model.properties;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;
import login.select_user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;


public class splash_screen_new extends javax.swing.JFrame {


    public splash_screen_new() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        
        try {
            logs.startLogger();
        } catch (Exception e) {
            logs.logger.log(Level.SEVERE, String.valueOf(e));
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new javax.swing.JProgressBar();
        loding_text = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        loding_text.setForeground(new java.awt.Color(153, 153, 153));
        loding_text.setText("Loading .");
        getContentPane().add(loding_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        value.setForeground(new java.awt.Color(153, 153, 153));
        value.setText("0%");
        getContentPane().add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modern Letter A Logo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 750, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        
        FlatMacDarkLaf.setup();

        splash_screen_new spwindow = new splash_screen_new();
        spwindow.setVisible(true);
        boolean internetConnected = false;
        boolean databaseConnected = false;

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(70);
                spwindow.bar.setValue(i);
                spwindow.value.setText(Integer.toString(i) + "%");
                if (i < 30) {
                    spwindow.loding_text.setText("Loading...");
                } else if (i < 40) {
                    spwindow.loding_text.setText("Copying files...");
                } else if (i < 60) {
                    spwindow.loding_text.setText("Checking internet connection...");
                    if (i == 45) {
                        if (!checkInternetConnection()) {
                            spwindow.loding_text.setText("No internet connection.");
                            JOptionPane.showMessageDialog(null, "No internet connection. Please check your connection and try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        } else {
                            internetConnected = true;
                        }
                    }
                } else if (i < 80) {
                    spwindow.loding_text.setText("Connecting to database...");
                    if (i == 65) {
                        if (connectToDatabase()) {
                            spwindow.loding_text.setText("Database connected.");
                            databaseConnected = true;
                        } else {
                            spwindow.loding_text.setText("Database connection failed.");
                            JOptionPane.showMessageDialog(null, "Database connection failed. Please check your connection and try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                } else {
                    spwindow.loding_text.setText("Almost done...");
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        spwindow.setVisible(false);

        if (internetConnected && databaseConnected) {
            select_user selectU = new select_user();
            selectU.setVisible(true);
        }

        spwindow.dispose();
    }

    private static boolean checkInternetConnection() {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("google.com", 80), 3000);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean connectToDatabase() {
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/surabe_new", "root", "Corei3diluna09");
//           Connection connection = DriverManager.getConnection("jdbc:mysql://" + ((properties.getPort() == "") ? "" + properties.getHost() + "" : ":" + properties.getHost() + properties.getPort() + "") + "/" + properties.getDatabase(), properties.getUsername(), properties.getPassword());

            Statement statement = connection.createStatement();
        
            ResultSet resultSet = statement.executeQuery("SELECT 1");
            if (resultSet.next()) {
                System.out.println("Database connected successfully!");
                connection.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loding_text;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
