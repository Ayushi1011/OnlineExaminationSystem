import java.beans.Visibility;
import javax.swing.JFrame;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
Connection conn;

 public Main() {
 initComponents();try{
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 }
 catch(Exception e){

 JOptionPane.showMessageDialog(null,"Plz cheeck your connection...!");

 }


 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jLabel3 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 jDesktopPane1 = new javax.swing.JDesktopPane();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 setBackground(new java.awt.Color(0, 0, 0));
 setMinimumSize(new java.awt.Dimension(855, 330));
 getContentPane().setLayout(null);
 jButton1.setBackground(new java.awt.Color(0, 0, 0));
 jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
 jButton1.setBorder(new javax.swing.border.MatteBorder(null));
 jButton1.setFocusable(false);
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 getContentPane().add(jButton1);
 jButton1.setBounds(0, 170, 220, 120);
 jButton2.setBackground(new java.awt.Color(0, 0, 0));
 jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
 jButton2.setBorder(new javax.swing.border.MatteBorder(null));
 jButton2.setFocusable(false);
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 getContentPane().add(jButton2);
 jButton2.setBounds(620, 170, 220, 120);
 jLabel3.setBackground(new java.awt.Color(255, 255, 255));
 jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
 jLabel3.setForeground(new java.awt.Color(153, 153, 153));
 jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel3.setText("OR");

jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAIS
ED));
 getContentPane().add(jLabel3);
 jLabel3.setBounds(370, 210, 90, 50);
 jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcm.png"))); // NOI18N
 jLabel1.setText("jLabel1");
 getContentPane().add(jLabel1);
 jLabel1.setBounds(0, 0, 850, 170);
 jLabel2.setBackground(new java.awt.Color(0, 0, 0));
 jLabel2.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
 jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
 getContentPane().add(jLabel2);
 jLabel2.setBounds(-10, 140, 870, 150);
 jDesktopPane1.setFocusable(false);
 javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
 jDesktopPane1.setLayout(jDesktopPane1Layout);
 jDesktopPane1Layout.setHorizontalGroup(
 jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGap(0, 940, Short.MAX_VALUE)
 );
 jDesktopPane1Layout.setVerticalGroup(
 jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGap(0, 280, Short.MAX_VALUE)
 );
 getContentPane().add(jDesktopPane1);
 jDesktopPane1.setBounds(0, 0, 940, 280);
 pack();
 }// </editor-fold>
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

 login obj=new login();
 obj.setVisible(true);
 this.setVisible(false);
 }
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

user_login obj=new user_login();
obj.setVisible(true);
this.setVisible(false);
 }
 public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
 */
 try {
 for (javax.swing.UIManager.LookAndFeelInfo info :
javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Main().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JDesktopPane jDesktopPane1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 // End of variables declaration
}
