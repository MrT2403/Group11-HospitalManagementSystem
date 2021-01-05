/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Diagnose1 extends javax.swing.JFrame {

    /**
     * Creates new form Diagnose1
     */
    Connection conn = null;
    DBconnect db = new DBconnect();
    private String userName;
    public Diagnose1(String userName) {
        initComponents();
        this.userName = userName;
        this.user.setText(userName);
    }

    private Diagnose1() {
        
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
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PATIENT ID ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 150, 110, 30);

        pid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pidKeyPressed(evt);
            }
        });
        jPanel1.add(pid);
        pid.setBounds(290, 150, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 160, 60, 20);

        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(date);
        date.setBounds(690, 150, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DOCTOR ID ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 230, 100, 30);

        did.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(did);
        did.setBounds(290, 230, 260, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 300, 50, 30);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(name);
        name.setBounds(290, 300, 260, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 370, 70, 30);

        date1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(date1);
        date1.setBounds(290, 370, 260, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DIAGNOSIS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 40, 300, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DIAGNOSE");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(600, 230, 80, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(920, 150, 120, 30);

        dia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(dia);
        dia.setBounds(690, 230, 350, 170);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PRESCRIPTION");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 430, 120, 30);

        pre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pre);
        pre.setBounds(290, 440, 260, 130);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-30.png"))); // NOI18N
        jButton3.setText("SAVE");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(790, 450, 110, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-window-20.png"))); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton4);
        jButton4.setBounds(790, 520, 110, 30);

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(user);
        user.setBounds(30, 10, 170, 30);

        jButton9.setForeground(new java.awt.Color(0, 102, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(10, 270, 49, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/historypic.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1170, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void resetForm(){
        did.setText(null);
        name.setText(null);
        dia.setText(null);
        pre.setText(null);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Insert into diagnose (PatientID,DoctorID,Diagnose,Date,Prescription,DoctorName)"
                    + "values(?,?,?,?,?,?)");
            pst.setString(1, pid.getText());
            pst.setString(2, did.getText());
            pst.setString(3, dia.getText());
            pst.setDate(4, convertFromJAVADateToSQLDate(date1.getDate()));
            pst.setString(5, pre.getText());
            pst.setString(6, name.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Save Successfully");

        } catch (Exception ex) {
            Logger.getLogger(Diagnose1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    public String convertStringToDate(Date indate) {
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MMM/yyyy");
        try {
            dateString = sdfr.format(indate);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return dateString;
    }
    private void pidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyPressed
        try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select Date from diagnose where PatientID= ?");
            pst.setString(1, pid.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                date.addItem(convertStringToDate(rs.getDate("Date")));
            }

        } catch (Exception ex) {
            Logger.getLogger(Diagnose1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Diagnose1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_pidKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select*from diagnose where PatientID=? and Date =?");
            pst.setString(1, pid.getText());
            pst.setDate(2, convertFromJAVADateToSQLDate(convert((String) date.getSelectedItem())));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                did.setText(rs.getString("DoctorID"));
                name.setText(rs.getString("DoctorName"));
                dia.setText(rs.getString("Diagnose"));
                pre.setText(rs.getString("Prescription"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Diagnose1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Diagnose1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       DoctorActivity doc = new DoctorActivity(userName);
       doc.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Diagnose1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnose1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnose1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnose1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnose1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> date;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField did;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pre;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
public static java.sql.Date convertFromJAVADateToSQLDate(
            java.util.Date javaDate) {
        java.sql.Date sqlDate = null;
        if (javaDate != null) {
            sqlDate = new java.sql.Date(javaDate.getTime());
        }
        return sqlDate;
    }

    public Date convert(String s) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);

        String dateInString = s;
        Date date = formatter.parse(dateInString);
        return date;
    }
}