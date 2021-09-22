import java.sql.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
 Connection conn;
 /**
 * Creates new form login
 */
 public login() {
 initComponents();
 try {
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 } catch (SQLException ex) {

 JOptionPane.showMessageDialog(null,"Plz cheeck your connection...!");

 }


 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 T_user = new javax.swing.JTextField();
 jLabel2 = new javax.swing.JLabel();
 B_login = new javax.swing.JButton();
 jLabel3 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 T_pass = new javax.swing.JPasswordField();
 jButton1 = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 setResizable(false);
 jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login",
javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft New Tai Lue", 1,
18), new java.awt.Color(0, 51, 153))); // NOI18N
 T_user.setText("admin");
 T_user.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 T_userActionPerformed(evt);
 }
 });
 jLabel2.setText("password");
 B_login.setText("Login");
 B_login.setFocusCycleRoot(true);
 B_login.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 B_loginActionPerformed(evt);
 }
 });
 jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn_adminlogin.png"))); //
NOI18N
 jLabel1.setText("user");
 T_pass.setText("admin");
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel3)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(B_login)
 .addComponent(T_user, javax.swing.GroupLayout.DEFAULT_SIZE, 186,
Short.MAX_VALUE)
 .addComponent(T_pass)))))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel3)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(T_user, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel1))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(T_pass, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(jLabel2))
 .addGap(18, 18, 18)
 .addComponent(B_login)
 .addContainerGap())
 );
 jButton1.setText("User_Login");
 jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
 jButton1.setFocusable(false);
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(28, 28, 28)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44,
Short.MAX_VALUE)
 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
javax.swing.GroupLayout.PREFERRED_SIZE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(23, 23, 23)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(28, Short.MAX_VALUE))
 .addGroup(layout.createSequentialGroup()
 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(0, 0, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold>
 private void B_loginActionPerformed(java.awt.event.ActionEvent evt) {

 try {
 Statement run = conn.createStatement();
 ResultSet output;
 String query="SELECT * FROM admin ";
 output = run.executeQuery(query);
 while(output.next()){
 String id=output.getString("loginid"),T_use=T_user.getText();
 if(T_use.equals(id)&& output.getString("pass").equals(T_pass.getText())){
 Add_subject obj=new Add_subject();
 obj.setVisible(true);
 this.setVisible(false);

 }else
 {

 JOptionPane.showMessageDialog(null,"Your user_ID or pass in invalid...!");
 }


 }



 } catch (SQLException ex) {

 JOptionPane.showMessageDialog(null,"you may have error in try block Or connection...!");
 }
 }
 private void T_userActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

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
 java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new login().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JButton B_login;
 private javax.swing.JPasswordField T_pass;
 private javax.swing.JTextField T_user;
 private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JPanel jPanel1;
 // End of variables declaration
}
