package Survey;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home(String fname, String id) {
        initComponents();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement(fname);
        model.addElement("Logout");
        jComboBox1.setModel(model);
        jComboBox1.setSelectedItem(fname);
        jLabel3.setText(fname);
        idlabel.setText(id);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AttemptSurvey = new javax.swing.JButton();
        CreateSurvey = new javax.swing.JButton();
        idlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SURVERY SYSTEM - HOMEPAGE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AttemptSurvey.setBackground(new java.awt.Color(204, 255, 255));
        AttemptSurvey.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        AttemptSurvey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/write.png"))); // NOI18N
        AttemptSurvey.setText("Fill Survey");
        AttemptSurvey.setBorder(null);
        AttemptSurvey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AttemptSurvey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttemptSurveyActionPerformed(evt);
            }
        });
        jPanel1.add(AttemptSurvey, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 195, 60));

        CreateSurvey.setBackground(new java.awt.Color(204, 255, 255));
        CreateSurvey.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        CreateSurvey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create.png"))); // NOI18N
        CreateSurvey.setText("Create Survey");
        CreateSurvey.setBorder(null);
        CreateSurvey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateSurvey.setFocusPainted(false);
        CreateSurvey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSurveyActionPerformed(evt);
            }
        });
        jPanel1.add(CreateSurvey, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 195, 59));

        idlabel.setForeground(new java.awt.Color(255, 255, 255));
        idlabel.setText("jLabel2");
        jPanel1.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 37, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 2, 3)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 18, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/survey.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 540, 410));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/welcome.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setText("Survey System");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Logout", "Exit" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateSurveyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSurveyActionPerformed
        String name = JOptionPane.showInputDialog("Enter your name : ");
        String Code = JOptionPane.showInputDialog("Enter your Unique Id : ");
        try {
            if (!Code.isEmpty() && !name.isEmpty()) {
                if (check(name, Code)) {
                    Survey_Form Sform;
                    Sform = new Survey_Form(name, Code);
                    Sform.setVisible(true);
                    Sform.setLocationRelativeTo(null);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect name or Unique Id", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Incorrect name or Unique Id", "Warning Message", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e2) {
            System.out.println("Error! " + e2.getMessage());
        }
    }//GEN-LAST:event_CreateSurveyActionPerformed

    private void AttemptSurveyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttemptSurveyActionPerformed
        String name, id;
        name = jLabel3.getText();
        id = idlabel.getText();
        String surveyCode = JOptionPane.showInputDialog("Enter the Survey Code : ");
        try {
            if (!surveyCode.isEmpty() && surveyCode.length() == 5) {
                if (codeCheck(surveyCode)) {
                    FillSurvey fs = new FillSurvey(name, id, surveyCode);
                    fs.setVisible(true);
                    fs.setLocationRelativeTo(null);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "No Survey Available!!!", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Incorrect Survey Code", "Warning Message", JOptionPane.WARNING_MESSAGE);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_AttemptSurveyActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String fname = jLabel3.getText();
        if ("Logout".equals(jComboBox1.getSelectedItem())) {
            int choice;
            choice = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                Login_form login = new Login_form();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                dispose();
            } else if (choice == JOptionPane.NO_OPTION) {
                jComboBox1.removeAllItems();
                jComboBox1.addItem(fname);
                jComboBox1.addItem("Logout");
            }
        }
        if (fname.equals(jComboBox1.getSelectedItem())) {
            JOptionPane.showMessageDialog(new JFrame(), "Full name :" + fname);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public boolean check(String name, String id) throws SQLException {
        String query, Surl, Suser, Spass;
        Surl = "jdbc:MySQL://localhost:3306/java_user_db";
        Suser = "root";
        Spass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(Surl, Suser, Spass);
            Statement st = con.createStatement();
            query = "SELECT * FROM faculty WHERE name = '" + name + "'AND id = '" + id + "'";
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(query);
            if (rst.next()) {

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean codeCheck(String code) throws SQLException {
        String query = "SELECT survey_code FROM surveys WHERE survey_code = ?";
        String Surl = "jdbc:MySQL://localhost:3306/java_user_db";
        String Suser = "root";
        String Spass = "";

        try (Connection con = DriverManager.getConnection(Surl, Suser, Spass); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, code);
            try (ResultSet rst = pstmt.executeQuery()) {
                return rst.next();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttemptSurvey;
    private javax.swing.JButton CreateSurvey;
    private javax.swing.JLabel idlabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
