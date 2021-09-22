import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class user_login extends javax.swing.JFrame {
 Connection conn;
 /**
 * Creates new form user_login
 */
 public user_login() {
 initComponents();
 try {

 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");

 }
 catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Plz check your connection..!");
 
 }

 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 U_ID = new javax.swing.JTextField();
 jLabel2 = new javax.swing.JLabel();
 B_login = new javax.swing.JButton();
 jLabel3 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 U_pass = new javax.swing.JPasswordField();
 jMenuBar1 = new javax.swing.JMenuBar();
 jMenu1 = new javax.swing.JMenu();
 jMenuItem1 = new javax.swing.JMenuItem();
 jMenuItem3 = new javax.swing.JMenuItem();
 jMenu3 = new javax.swing.JMenu();
 jMenuItem2 = new javax.swing.JMenuItem();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login",
javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft New Tai Lue", 1,
18), new java.awt.Color(0, 51, 153))); // NOI18N
 jLabel2.setText("password");
 B_login.setText("Login");
 B_login.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 B_loginActionPerformed(evt);
 }
 });
 jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login.png"))); //
NOI18N
 jLabel1.setText("User_ID");
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(B_login)
 .addComponent(U_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 186,
Short.MAX_VALUE)
 .addComponent(U_pass))))
 .addContainerGap())
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(U_ID, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel1))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(U_pass, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(jLabel2))
 .addGap(18, 18, 18)
 .addComponent(B_login)
 .addContainerGap())
 );
 jMenu1.setText("Admin");
 jMenuItem1.setText("Login");
 jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem1ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem1);
 jMenuItem3.setText("Exit");
 jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem3ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem3);
 jMenuBar1.add(jMenu1);
 jMenu3.setText("Registration");
 jMenuItem2.setText("New user");
 jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem2ActionPerformed(evt);
 }
 });
 jMenu3.add(jMenuItem2);
 jMenuBar1.add(jMenu3);
 setJMenuBar(jMenuBar1);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(40, 40, 40)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(0, 78, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(34, 34, 34)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(0, 44, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold> 
 private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
add_user obj=new add_user();
obj.setVisible(true);
this.setVisible(false);
 }
 private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
login obj=new login();
obj.setVisible(true);
this.setVisible(false);
 }
 private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {


 System.exit(0);
 }
 private void B_loginActionPerformed(java.awt.event.ActionEvent evt) {


 try{
 Statement run_query=conn.createStatement();
 String query="SELECT * FROM user WHERE user_id="+U_ID.getText()+" AND
pass='"+U_pass.getText()+"'";
 ResultSet rs;
 int flag=0;
 rs=run_query.executeQuery(query);
 while(rs.next()){

if(rs.getString("user_id").equals(U_ID.getText())&&rs.getString("pass").equals(U_pass.getText())){
 flag=1;
 subject obj=new subject();
 obj.setVisible(true);
 setVisible(false);

 }

 }
 if(flag==0){
 JOptionPane.showMessageDialog(null,"Plz enter correct User_ID and Pass");

 }
 }
 catch(Exception msg){
 
 JOptionPane.showMessageDialog(null,"Plz enter User_ID and Pass");
 }

 } public static void main(String args[]) {
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

java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new user_login().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JButton B_login;
 private javax.swing.JTextField U_ID;
 private javax.swing.JPasswordField U_pass;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JMenu jMenu1;
 private javax.swing.JMenu jMenu3;
 private javax.swing.JMenuBar jMenuBar1;
 private javax.swing.JMenuItem jMenuItem1;
 private javax.swing.JMenuItem jMenuItem2;
 private javax.swing.JMenuItem jMenuItem3;
 private javax.swing.JPanel jPanel1;
 // End of variables declaration
}
