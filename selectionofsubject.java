import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.pkcs11.Secmod;
import java.awt.*;
import javax.swing.*;
public class subject extends javax.swing.JFrame {
Connection conn;
 /**
 * Creates new form subject
 */
 public subject() {
 initComponents();
 try {
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
 Statement run_query=conn.createStatement();
 String query="SELECT sub_name FROM subject";
 ResultSet rs;
 rs=run_query.executeQuery(query);
 DefaultListModel ob=new DefaultListModel();
 while(rs.next()){

 query=rs.getString("sub_name");
 ob.addElement(query);
 }
 Subject_list.setModel(ob);



 
 } catch (SQLException ex) {

 JOptionPane.showMessageDialog(null,"Plz check your connection ...!");

 }

 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 label1 = new java.awt.Label();
 jLabel1 = new javax.swing.JLabel();
 jDesktopPane1 = new javax.swing.JDesktopPane();
 jScrollPane1 = new javax.swing.JScrollPane();
 Subject_list = new javax.swing.JList();
 jButton1 = new javax.swing.JButton();
 jMenuBar1 = new javax.swing.JMenuBar();
 jMenu1 = new javax.swing.JMenu();
 jMenuItem1 = new javax.swing.JMenuItem();
 jMenuItem2 = new javax.swing.JMenuItem();
 jMenu2 = new javax.swing.JMenu();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 setType(java.awt.Window.Type.POPUP);

jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAIS
ED));
 label1.setFont(new java.awt.Font("DokChampa", 1, 24)); // NOI18N
 label1.setForeground(new java.awt.Color(102, 102, 0));
 label1.setText("Select Subject");
 jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DocLibrary.jpg"))); //
NOI18N
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(26, 26, 26))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(33, 33, 33)
 .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(32, Short.MAX_VALUE))
 );
 jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 Subject_list.setModel(new javax.swing.AbstractListModel() {
 String[] strings = { "Computer_science", "English", "Maths" };
 public int getSize() { return strings.length; }
 public Object getElementAt(int i) { return strings[i]; }
 });
 Subject_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
 public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
 Subject_listValueChanged(evt);
 }
 });
 jScrollPane1.setViewportView(Subject_list);
 javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
 jDesktopPane1.setLayout(jDesktopPane1Layout);
 jDesktopPane1Layout.setHorizontalGroup(
 jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jDesktopPane1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208,
Short.MAX_VALUE)
 .addContainerGap())
 );
 jDesktopPane1Layout.setVerticalGroup(
 jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jDesktopPane1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123,
Short.MAX_VALUE)
 .addContainerGap())
 );
 jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
 jButton1.setBackground(new java.awt.Color(255, 255, 255));
 jButton1.setText("Start");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jMenu1.setText("File");
 jMenuItem1.setText("Discard");
 jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem1ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem1);
 jMenuItem2.setText("Exit");
 jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jMenuItem2ActionPerformed(evt);
 }
 });
 jMenu1.add(jMenuItem2);
 jMenuBar1.add(jMenu1);
 jMenuBar1.add(jMenu2);
 setJMenuBar(jMenuBar1);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(21, 21, 21)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addContainerGap(35, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(21, 21, 21)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jButton1))
 .addContainerGap(22, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold>
 private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {


 user_login obj=new user_login();
 obj.setVisible(true);
 this.setVisible(false);







 }
 private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {


 System.exit(0);
 }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


 String selected=Subject_list.getSelectedValue().toString();
 // JOptionPane.showMessageDialog(null,selected);

 String hold=null; //this will hold value
 try{
 Statement run_query=conn.createStatement();
 String query="SELECT sub_id FROM subject WHERE sub_name='"+selected+"'";
 ResultSet rs;
 rs=run_query.executeQuery(query);

 while(rs.next()){
 hold= rs.getString("sub_id");
 
 }

 }
 catch(Exception e){
 JOptionPane.showMessageDialog(null, e);

 }
 Quiz obj=new Quiz();
 obj.setValue(hold);
 obj.setVisible(true);
 this.setVisible(false);





 }
 private void Subject_listValueChanged(javax.swing.event.ListSelectionEvent evt) {


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
 java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new subject().setVisible(true);
 }
 });




 }
 // Variables declaration
 private javax.swing.JList Subject_list;
 private javax.swing.JButton jButton1;
 private javax.swing.JDesktopPane jDesktopPane1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JMenu jMenu1;
 private javax.swing.JMenu jMenu2;
 private javax.swing.JMenuBar jMenuBar1;
 private javax.swing.JMenuItem jMenuItem1;
 private javax.swing.JMenuItem jMenuItem2;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane1;
 private java.awt.Label label1;
 // End of variables declaration
}
