package loginpg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Surya Prakash
 */
public class questions1 extends javax.swing.JFrame {

    /**
     * Creates new form questions1
     */
    public questions1() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        qnArea = new javax.swing.JTextArea();
        qnumber = new javax.swing.JTextField();
        o3 = new javax.swing.JTextField();
        o2 = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        add1 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 104, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 21, 133), 5), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(138, 43, 226), 6)));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 450));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        qnArea.setBackground(new java.awt.Color(123, 104, 238));
        qnArea.setColumns(20);
        qnArea.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        qnArea.setForeground(new java.awt.Color(255, 255, 255));
        qnArea.setRows(5);
        qnArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(qnArea);

        qnumber.setBackground(new java.awt.Color(123, 104, 238));
        qnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qnumber.setForeground(new java.awt.Color(255, 255, 255));
        qnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        o3.setBackground(new java.awt.Color(123, 104, 238));
        o3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        o3.setForeground(new java.awt.Color(255, 255, 255));
        o3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });

        o2.setBackground(new java.awt.Color(123, 104, 238));
        o2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        o2.setForeground(new java.awt.Color(255, 255, 255));
        o2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });

        ans.setBackground(new java.awt.Color(123, 104, 238));
        ans.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ans.setForeground(new java.awt.Color(255, 255, 255));
        ans.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(199, 21, 133));
        add1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("Add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        add2.setBackground(new java.awt.Color(199, 21, 133));
        add2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("Back");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(qnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 427, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2))
                .addGap(62, 62, 62)
                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o3ActionPerformed

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o2ActionPerformed

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
  
     String q=qnArea.getText();
        String option1=o3.getText();
String option2=o2.getText();
String answer=ans.getText();
String qnnr=qnumber.getText();
String qnA=qnArea.getText();
 //if(!option1.equals(answer)||!option2.equals(answer)){JOptionPane.showMessageDialog(null,"Please Provide correct Answer");}

        try{
    
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Examination","xam","xam"); 
    Statement st=con.createStatement();
    String sql= "insert into quiz2(option1,option2,answer,qno,questiona)values(?,?,?,?,?)";
    PreparedStatement pst=con.prepareStatement(sql);
      pst.setString(1,o3.getText());
      pst.setString(2,o2.getText());
        pst.setString(3,ans.getText());
         pst.setString(4,qnumber.getText());
         pst.setString(5,qnArea.getText());
         pst.execute(); con.close();
                  JOptionPane.showMessageDialog(null,"Your questions added succesfully");}
        catch(Exception e){ JOptionPane.showMessageDialog(null,e);  }
      // TODO add your handling code here:
    }//GEN-LAST:event_add1ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
      new admin().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_add2ActionPerformed

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
            java.util.logging.Logger.getLogger(questions1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questions1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questions1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questions1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questions1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JTextField ans;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField o2;
    private javax.swing.JTextField o3;
    private javax.swing.JTextArea qnArea;
    private javax.swing.JTextField qnumber;
    // End of variables declaration//GEN-END:variables
}
