import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
public class Add_subject extends javax.swing.JFrame {
 Connection conn;

 /**
 * Creates new form Add_subject
 */
 public Add_subject() {
 initComponents();

 try {
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"check your connection...!"); }


 }
 /**
 * This method is called from within the constructor to initialize the form.
 * 
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 sub_id = new javax.swing.JTextField();
 jButton1 = new javax.swing.JButton();
 jLabel2 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 sub_name = new javax.swing.JTextField();
 jPanel2 = new javax.swing.JPanel();
 jLabel4 = new javax.swing.JLabel();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 setBackground(new java.awt.Color(102, 102, 102));
 jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add_ Subject",
javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); //
NOI18N
 jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 sub_id.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 sub_idActionPerformed(evt);
 }
 });
 jPanel1.add(sub_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 211, -1));
 jButton1.setText("Save");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 109, 86, -1));
 jLabel2.setText("Sub_Name");
 jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 74, 101, -1));
 jLabel1.setText("Sub_Id");
 jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 33, 101, -1));
 jPanel1.add(sub_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 71, 211, -1));
 jLabel4.setIcon(new
javax.swing.ImageIcon(getClass().getResource("/Subject_Subject.fr_logo.png"))); // NOI18N
 javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
 jPanel2.setLayout(jPanel2Layout);
 jPanel2Layout.setHorizontalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel2Layout.createSequentialGroup()
 .addContainerGap(88, Short.MAX_VALUE)
 .addComponent(jLabel4)
 .addGap(84, 84, 84))
 );
 jPanel2Layout.setVerticalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel4))
 );
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(63, 63, 63)
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413,
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addContainerGap(38, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(35, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold>
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 // TODO add your handling code here:

 try{
Statement run=conn.createStatement();
ResultSet rs;
int flag=0;
 String query="SELECT * FROM subject WHERE sub_id='"+sub_id.getText()+"' OR
sub_name='"+sub_name.getText()+"'";
 rs=run.executeQuery(query);
 while(rs.next()){

 flag=1;
 JOptionPane.showMessageDialog(null,"change your id OR Name it is exists...! \n\nsub_id
="+rs.getString("sub_id")+" \n\nAnd\n\n Name="+rs.getString("sub_name"));

 }
 if(flag==0){

 flag=1;
 query="INSERT INTO subject values( "+sub_id.getText()+",'"+sub_name.getText()+"')";
 run.executeUpdate(query);
 Add_question obj=new Add_question();
 Add_question.subj_ID.setText(sub_id.getText());
 sub_id.setText("");
 sub_name.setText("");
 JOptionPane.showMessageDialog(null,"You Add New Subject plz Add questions for it...");
 obj.setVisible(true);
 this.setVisible(false);





 }





 }
 catch(Exception ex){
 if(sub_id.getText().equals("") && sub_name.getText().equals("")){
 JOptionPane.showMessageDialog(null,"Plz Enter Sub_ID and Sub_Name ");
 }else{
 JOptionPane.showMessageDialog(null,"Plz check your code...! ");
 }
 }
 }
 private void sub_idActionPerformed(java.awt.event.ActionEvent evt) {

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

java.util.logging.Logger.getLogger(Add_subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(Add_subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(Add_subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(Add_subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Add_subject().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JTextField sub_id;
 private javax.swing.JTextField sub_name;
 // End of variables declaration
}
