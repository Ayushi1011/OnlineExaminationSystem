import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Add_question extends javax.swing.JFrame {
 Connection conn;
 /**
 * Creates new form Add_question
 */
 public Add_question() {
 initComponents();
 try {
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 } catch (SQLException ex) {

 JOptionPane.showMessageDialog(null,"Plz check your connection...!");

 }

 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jColorChooser1 = new javax.swing.JColorChooser();
 jPanel2 = new javax.swing.JPanel();
 jPanel1 = new javax.swing.JPanel();
 jLabel3 = new javax.swing.JLabel();
 jScrollPane1 = new javax.swing.JScrollPane();
 Question = new javax.swing.JTextArea();
 jLabel6 = new javax.swing.JLabel();
 jLabel7 = new javax.swing.JLabel();
 jLabel5 = new javax.swing.JLabel();
 jLabel4 = new javax.swing.JLabel();
 jLabel1 = new javax.swing.JLabel();
 subj_ID = new javax.swing.JTextField();
 Option_B = new javax.swing.JTextField();
 jLabel2 = new javax.swing.JLabel();
 Option_C = new javax.swing.JTextField();
 Correct = new javax.swing.JTextField();
 Option_D = new javax.swing.JTextField();
 Option_A = new javax.swing.JTextField();
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jMenuBar1 = new javax.swing.JMenuBar();
 jMenu1 = new javax.swing.JMenu();
 jMenuItem1 = new javax.swing.JMenuItem();
 jMenuItem2 = new javax.swing.JMenuItem();
 jMenuItem3 = new javax.swing.JMenuItem();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jPanel2.setBackground(new java.awt.Color(153, 153, 153));

jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAIS
ED));
 jPanel1.setBackground(new java.awt.Color(204, 204, 204));

jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtc
hedBorder(), "Add_Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14), new
java.awt.Color(102, 102, 102))); // NOI18N
 jLabel3.setText("Option_B");
 Question.setBackground(new java.awt.Color(204, 204, 204));
 Question.setColumns(20);
 Question.setRows(5);
 jScrollPane1.setViewportView(Question);
 jLabel6.setText("Correct_Option");
 jLabel7.setText("Question");
 jLabel5.setText("Option_D");
 jLabel4.setText("Option_C");
 jLabel1.setText("Sub_ID");
 subj_ID.setBackground(new java.awt.Color(204, 204, 204));
 subj_ID.setEnabled(false);
 Option_B.setBackground(new java.awt.Color(204, 204, 204));
 Option_B.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 Option_BActionPerformed(evt);
 }
 });
 jLabel2.setText("Option_A");
 Option_C.setBackground(new java.awt.Color(204, 204, 204));
 Correct.setBackground(new java.awt.Color(204, 204, 204));
 Option_D.setBackground(new java.awt.Color(204, 204, 204));
 Option_A.setBackground(new java.awt.Color(204, 204, 204));
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
 .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGap(23, 23, 23))
 .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
Short.MAX_VALUE))
 .addGap(18, 18, 18)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(Correct)
 .addComponent(Option_D, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(Option_C, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(Option_B, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(Option_A, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
 .addComponent(subj_ID, javax.swing.GroupLayout.Alignment.TRAILING))
 .addContainerGap())
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(subj_ID, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel1))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(42, 42, 42)
 .addComponent(jLabel7)))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Option_A, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel2))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Option_B, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel3))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Option_C, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel4))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Option_D, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel5))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(Correct, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel6))
 .addContainerGap())
 );
 jButton1.setText("Save");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jButton2.setText("Cancel");
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
 jPanel2.setLayout(jPanel2Layout);
 jPanel2Layout.setHorizontalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addContainerGap())
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addGap(121, 121, 121)
 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(jButton2)
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 jPanel2Layout.setVerticalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19,
Short.MAX_VALUE)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jButton1)
 .addComponent(jButton2)))
 );
 jMenu1.setText("File");
 jMenuItem1.setText("Add_new_Subject");
 jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem1ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem1);
 jMenuItem2.setText("Main_menu");
 jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem2ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem2);
 jMenuItem3.setText("Exit");
 jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem3ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem3);
 jMenuBar1.add(jMenu1);
 setJMenuBar(jMenuBar1);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addContainerGap())
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addContainerGap())
 );
 pack();
 }// </editor-fold>
 private void Option_BActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {

Add_subject obj=new Add_subject();
obj.setVisible(true);
this.setVisible(false);
 }
 private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {

 Main obj=new Main();
obj.setVisible(true);
this.setVisible(false);
 }
 private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {

 System.exit(0);

 }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


 try{

 Statement run_query=conn.createStatement();
 String query="INSERT INTO questions
VALUES("+null+","+subj_ID.getText()+",'"+Question.getText()+"','"+Option_A.getText()+"','"+Option_B.
getText()+"','"+Option_C.getText()+"','"+Option_D.getText()+"','"+Correct.getText()+"')";
 run_query.executeUpdate(query);
 Question.setText("");
 Option_A.setText("");
 Option_B.setText("");
 Option_C.setText("");
 Option_D.setText("");
 Correct.setText("");
 }
 catch(Exception e){

 JOptionPane.showMessageDialog(null,"You may have error in statment try code...!");
 }

 }
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {


 Question.setText("");
 Option_A.setText("");
 Option_B.setText("");
 Option_C.setText("");
 Option_D.setText("");
 Correct.setText("");



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

java.util.logging.Logger.getLogger(Add_question.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(Add_question.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(Add_question.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(Add_question.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Add_question().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JTextField Correct;
 private javax.swing.JTextField Option_A;
 private javax.swing.JTextField Option_B;
 private javax.swing.JTextField Option_C;
 private javax.swing.JTextField Option_D;
 private javax.swing.JTextArea Question;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JColorChooser jColorChooser1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JMenu jMenu1;
 private javax.swing.JMenuBar jMenuBar1;
 private javax.swing.JMenuItem jMenuItem1;
 private javax.swing.JMenuItem jMenuItem2;
 private javax.swing.JMenuItem jMenuItem3;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JScrollPane jScrollPane1;
 public static javax.swing.JTextField subj_ID;
 // End of variables declaration
}
