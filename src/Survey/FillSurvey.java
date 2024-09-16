package Survey;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FillSurvey extends javax.swing.JFrame {

    Connection con;
    int[] opt = new int[50];
    int k = 0, i = 1;
    String Surl = "jdbc:MySQL://localhost:3306/java_user_db";
    String Suser = "root";
    String Spass = "";
    ResultSet rst;
    Statement stm;

    public FillSurvey(String name, String id, String code) throws SQLException, ClassNotFoundException {
        initComponents();
        jLabel4.setText(name);
        idlabel.setText(id);
        jLabel6.setText(code);
        setTitle("Fill Survey");
        setResizable(false);
        setVisible(true);
        updateDate(date);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(Surl, Suser, Spass);
            String str1 = "SELECT title FROM surveys WHERE survey_code = '" + code + "'";
            Statement stm1 = con.createStatement();
            ResultSet rst1 = stm1.executeQuery(str1);
            if (rst1.next()) {
                jLabel1.setText(rst1.getString("title"));
            }
            String str = "SELECT * FROM questions WHERE survey_code = '" + code + "'";
            stm = con.createStatement();
            rst = stm.executeQuery(str);
            if (rst.next()) {
                ques.setText(rst.getString(4));
                op1.setText(rst.getString(5));
                op2.setText(rst.getString(6));
                op3.setText(rst.getString(7));
                op4.setText(rst.getString(8));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        QuesNo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        ques = new javax.swing.JLabel();
        NextBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FILL SURVEY");

        idlabel.setForeground(new java.awt.Color(204, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Survey Code :");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Q");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 18, -1, -1));

        QuesNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuesNo.setText("1 ");
        jPanel3.add(QuesNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 23, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText(":");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 22, 13, -1));

        buttonGroup1.add(op1);
        op1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op1.setContentAreaFilled(false);
        op1.setFocusPainted(false);
        jPanel3.add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, 830, 30));

        buttonGroup1.add(op2);
        op2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op2.setContentAreaFilled(false);
        jPanel3.add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 101, 830, 30));

        buttonGroup1.add(op3);
        op3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op3.setContentAreaFilled(false);
        jPanel3.add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 139, 830, 30));

        buttonGroup1.add(op4);
        op4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op4.setContentAreaFilled(false);
        jPanel3.add(op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 177, 830, 30));

        ques.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jPanel3.add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 18, 780, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 880, 230));

        NextBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next.png"))); // NOI18N
        NextBtn.setBorder(null);
        NextBtn.setContentAreaFilled(false);
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });
        jPanel2.add(NextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        CancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel 1.png"))); // NOI18N
        CancelBtn.setBorder(null);
        CancelBtn.setBorderPainted(false);
        CancelBtn.setContentAreaFilled(false);
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 334, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 23, -1, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 23, 133, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 23, -1, 24));

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 23, 120, 24));

        jLabel15.setText("Next");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 388, -1, 27));

        jLabel14.setText("Cancel");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 388, 42, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        String code = jLabel6.getText();
        String fname = jLabel4.getText();
        String sid = idlabel.getText();
        int x = -1;
        if (op1.isSelected()) {
            x = 1;
        } else if (op2.isSelected()) {
            x = 2;
        } else if (op3.isSelected()) {
            x = 3;
        } else if (op4.isSelected()) {
            x = 4;
        }
        if (x != -1) {
            opt[k] = x;
            k++;
            try {
                if (rst.next()) {
                    ques.setText(rst.getString("ques"));
                    op1.setText(rst.getString("option1"));
                    op2.setText(rst.getString("option2"));
                    op3.setText(rst.getString("option3"));
                    op4.setText(rst.getString("option4"));
                    repaint();
                    i++;
                    String ki = Integer.toString(i);
                    QuesNo.setText(ki);
                } else {
                    for (int j = 0; j < k; j++) {
                        if (opt[j] != -1 && opt[j] != 0) {
                            answerUpdt(code, j + 1, opt[j]);
                            System.out.println(j + 1 + "," + opt[j]);
                        } else {
                            System.out.println(j + 1 + ", No option selected");
                        }
                    }
                    addTotal(code);
                    JOptionPane.showMessageDialog(new JFrame(), "Survey Completed. Thank You.", "Congratulations", JOptionPane.PLAIN_MESSAGE);
                    con.close();
                    Home home = new Home(fname, sid);
                    home.setVisible(true);
                    home.setLocationRelativeTo(null);
                    dispose();
                }
            } catch (SQLException e1) {
                System.out.println(e1);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Select an option!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        buttonGroup1.clearSelection();

    }//GEN-LAST:event_NextBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        String fname = jLabel4.getText();
        String sid = idlabel.getText();
        Home home = new Home(fname, sid);
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Error :" + ex);
        }
    }

    public void answerUpdt(String surveycode, int qno, int option) throws SQLException {
        String id = idlabel.getText();
        String query = "INSERT INTO responses(survey_code, qno, Option_Number, id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, surveycode);
            preparedStatement.setInt(2, qno);
            preparedStatement.setInt(3, option);
            preparedStatement.setString(4, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addTotal(String code) throws SQLException {
        String str = "UPDATE attempts SET total = total+1 WHERE survey_code = ?";

        try (PreparedStatement pstmt = con.prepareStatement(str)) {
            pstmt.setString(1, code);
            pstmt.executeUpdate();
        }
    }

    private static void updateDate(JLabel date) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        date.setText(formattedDate);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel QuesNo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel ques;
    // End of variables declaration//GEN-END:variables
}
