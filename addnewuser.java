import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class add_user extends javax.swing.JFrame {
 Connection conn;

 public add_user() {
 initComponents();
 
 try {
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Plz check your connection...!");
 }



 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 jLabel3 = new javax.swing.JLabel();
 jLabel5 = new javax.swing.JLabel();
 Email = new javax.swing.JTextField();
 Address = new javax.swing.JTextField();
 U_pass = new javax.swing.JTextField();
 U_Re_Pass = new javax.swing.JTextField();
 jLabel4 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 U_ID = new javax.swing.JTextField();
 U_Name = new javax.swing.JTextField();
 jLabel6 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add_User",
javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); //
NOI18N
 jLabel3.setText("re-enter password");
 jLabel5.setText("Address");
 jLabel4.setText("Name");
 jLabel2.setText("Password");
 jLabel6.setText("Email");
 jLabel1.setText("ID");
 jButton1.setText("Confirm");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jButton2.setText("Cancle");
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
 .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
Short.MAX_VALUE))
 .addGap(70, 70, 70)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addComponent(jButton1)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jButton2))

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(U_pass)
 .addComponent(U_Name)
 .addComponent(U_ID)
 .addComponent(U_Re_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addContainerGap())
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(U_ID, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
 .addGap(5, 5, 5)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(U_Name, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel4))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(U_pass, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel2))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(U_Re_Pass, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel3))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel5))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel6))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24,
Short.MAX_VALUE)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jButton1)
 .addComponent(jButton2))
 .addContainerGap())
 );
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(24, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addContainerGap(33, Short.MAX_VALUE)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(26, 26, 26))
 );
 pack();
 }// </editor-fold>
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {


 U_ID.setText("");
 U_Name.setText("");
 U_pass.setText("");
 U_Re_Pass.setText("");
 Address.setText("");
 Email.setText("");


 }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

 try{
 Statement run_query=conn.createStatement();
 ResultSet rs;
 if(U_pass.getText().equals(U_Re_Pass.getText())){
 String query="SELECT user_id FROM user ";
 int flage=0;
 rs=run_query.executeQuery(query);
 while(rs.next()){

 if(rs.getString("user_id").equals(U_ID.getText())){
 
 JOptionPane.showMessageDialog(null," This ID is existed...\n\nPlz Change it... ");
 flage=1;
 }

 }

if(U_Name.getText().equals("")||U_pass.getText().equals("")||U_Re_Pass.getText().equals("")||Addr
ess.getText().equals("")||Email.getText().equals("")){

 if(flage==0){
 JOptionPane.showMessageDialog(null," Plz enter required user detail "); }



 }
 else{
 if(flage==0){
 if(U_ID.getText().equals("")){
 query="INSERT INTO user
VALUES("+null+",'"+U_pass.getText()+"','"+U_Name.getText()+"','"+Address.getText()+"','"+Email.getT
ext()+"')";
 }else{
 query="INSERT INTO user
VALUES("+U_ID.getText()+",'"+U_pass.getText()+"','"+U_Name.getText()+"','"+Address.getText()+"','"+
Email.getText()+"')";
 }
 run_query.executeUpdate(query);
 JOptionPane.showMessageDialog(null," You added for test ... Plz login with following detail\n\n
U_ID "+U_ID.getText()+"\n Password "+U_pass.getText());
 U_ID.setText("");
 U_Name.setText("");
 U_pass.setText("");
 U_Re_Pass.setText("");
 Address.setText("");
 Email.setText("");
 user_login obj=new user_login();
 obj.setVisible(true);
 this.setVisible(false);

 }

 }

 }

 else{


 JOptionPane.showMessageDialog(null,"Plz enter same password in both field");
 

 }

 }
 catch(Exception msg){


 JOptionPane.showMessageDialog(null,"You have error in statment code s");

 }

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

java.util.logging.Logger.getLogger(add_user.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(add_user.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(add_user.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(add_user.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new add_user().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JTextField Address;
 private javax.swing.JTextField Email;
 private javax.swing.JTextField U_ID;
 private javax.swing.JTextField U_Name;
 private javax.swing.JTextField U_Re_Pass;
 private javax.swing.JTextField U_pass;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JPanel jPanel1;
 // End of variables declaration
}
