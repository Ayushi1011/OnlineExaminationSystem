import com.sun.prism.Texture;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Quiz extends javax.swing.JFrame {
private String value;

 Connection conn;
 ResultSet rs,recive,dd;
 int count_question=0,ToTal_Socre=0,correct_ANS_conut=0;
 String answer;

 public Quiz() {
 initComponents();
 result.setVisible(false);
 try {

 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");

 }
 catch (SQLException ex) {

 JOptionPane.showMessageDialog(null,"Plz check your connection");
 }

 }

 /**
 * This method is called from within the constructor to initialize the form.

 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jLabel1 = new javax.swing.JLabel();
 jPanel2 = new javax.swing.JPanel();
 view_Question = new javax.swing.JTextField();
 jPanel1 = new javax.swing.JPanel();
 view_D = new javax.swing.JButton();
 View_c = new javax.swing.JButton();
 view_A = new javax.swing.JButton();
 View_B = new javax.swing.JButton();
 F_score = new javax.swing.JTextField();
 jTextField1 = new javax.swing.JTextField();
 result = new javax.swing.JTextField();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jLabel1.setBackground(new java.awt.Color(0, 0, 0));
 jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
 jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel1.setText("Quiz Management System");
 jLabel1.setBorder(new
javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
 jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 view_Question.setEditable(false);
 view_Question.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
 view_Question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
 view_Question.setText("click any below button to start quiz");
 view_Question.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 view_Question.setDisabledTextColor(new java.awt.Color(0, 0, 0));
 view_Question.setEnabled(false);
 view_Question.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 view_QuestionActionPerformed(evt);
 }
 });
 jPanel1.setBackground(new java.awt.Color(102, 102, 102));
 view_D.setBackground(new java.awt.Color(153, 153, 153));
 view_D.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
 view_D.setText("Click_Start");
 view_D.setFocusable(false);
 view_D.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 view_DActionPerformed(evt);
 }
 });
 View_c.setBackground(new java.awt.Color(153, 153, 153));
 View_c.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
 View_c.setText("Click_Start");
 View_c.setFocusable(false);
 View_c.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 View_cActionPerformed(evt);
 }
 });
 view_A.setBackground(new java.awt.Color(153, 153, 153));
 view_A.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
 view_A.setText("Click_Start");
 view_A.setFocusable(false);
 view_A.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 view_AActionPerformed(evt);
 }
 });
 View_B.setBackground(new java.awt.Color(153, 153, 153));
 View_B.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
 View_B.setText("Click_Start");
 View_B.setFocusable(false);
 View_B.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 View_BActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
false)
 .addComponent(view_A, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(View_c, javax.swing.GroupLayout.DEFAULT_SIZE, 160,
Short.MAX_VALUE))
 .addGap(18, 18, 18)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(view_D, javax.swing.GroupLayout.DEFAULT_SIZE, 216,
Short.MAX_VALUE)
 .addComponent(View_B, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addContainerGap())
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(view_A, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(View_B, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(view_D, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(View_c, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap())
 );
 F_score.setEditable(false);
 F_score.setText("0");
 F_score.setAutoscrolls(false);
 F_score.setEnabled(false);
 F_score.setFocusable(false);
 jTextField1.setEditable(false);
 jTextField1.setText("Score");
 jTextField1.setAutoscrolls(false);
 jTextField1.setBorder(new
javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new
java.awt.Color(0, 51, 102), null, null));
 jTextField1.setEnabled(false);
 javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
 jPanel2.setLayout(jPanel2Layout);
 jPanel2Layout.setHorizontalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addComponent(view_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 411,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(F_score)
 .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 74,
Short.MAX_VALUE)))
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 jPanel2Layout.setVerticalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(view_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(F_score, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(39, Short.MAX_VALUE))
 );
 result.setEditable(false);
 result.setText("answer");
 result.setAutoscrolls(false);
 result.setEnabled(false);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addGap(0, 0, Short.MAX_VALUE)
 .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(171, 171, 171))
 .addGroup(layout.createSequentialGroup()
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
 .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(18, 18, 18)
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold>
 public ResultSet funtion(){

 try{
 Statement run_query=conn.createStatement();
 int sub_id=Integer.parseInt(getValue());
 String query="SELECT * FROM questions WHERE sub_id="+sub_id;
 rs=run_query.executeQuery(query);

 dd=rs;
 /*
 if(dd.next()){

 view_Question.setText(rs.getString("question"));
 view_A.setText(rs.getString("A"));
 View_B.setText(rs.getString("B"));
 View_c.setText(rs.getString("C"));
 view_D.setText(rs.getString("D"));

 }

 */



 }
 catch(Exception e){
 JOptionPane.showMessageDialog(null,"you have error in function code");

 }
 return dd;
 }

 public String movenext(int Question_No){
recive=funtion();
 try {
 int index=0,passed_value=Question_No;
 while(recive.next()){
 index=recive.getRow();
 if(passed_value==index){
 view_A.setText(recive.getString("A"));
 View_B.setText(recive.getString("B"));
 View_c.setText(recive.getString("C"));
 view_D.setText(recive.getString("D"));
 view_Question.setText(recive.getString("question"));
 answer=recive.getString("correct");

 }



 }
 if(passed_value>index){

 JOptionPane.showMessageDialog(null, "Test_ended");

 Final_result obj=new Final_result();
 obj.setVisible(true);
 Final_result.T_Score.setText(""+ToTal_Socre);
 Final_result.C_ANS.setText(""+correct_ANS_conut);
 Final_result.W_aNS.setText(""+(index-correct_ANS_conut));
 Final_result.Percentage.setText(""+((correct_ANS_conut*100)/index));
 this.setVisible(false);
 }

 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"error in movenext_function code");
 }

return answer;
 }
 public int result_concluded(String button_name){
 String b_Name=button_name;
 if(result.getText().equals(b_Name))
 {
 correct_ANS_conut++;
 ToTal_Socre=ToTal_Socre+5;
 }


 return ToTal_Socre;

 }

 private void view_QuestionActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void view_DActionPerformed(java.awt.event.ActionEvent evt) {


 count_question++;
 String button="D";
 F_score.setText(""+ result_concluded(button));
 result.setText(""+movenext(count_question));


 }

 private void View_cActionPerformed(java.awt.event.ActionEvent evt) {

 count_question++;
 String button="C";
 F_score.setText(""+ result_concluded(button));
 result.setText(""+movenext(count_question));



 }
 private void view_AActionPerformed(java.awt.event.ActionEvent evt) {

 count_question++;
 String button="A";
 F_score.setText(""+ result_concluded(button));
 result.setText(""+movenext(count_question));
 
 }
 private void View_BActionPerformed(java.awt.event.ActionEvent evt) {

 count_question++;
 String button="B";
 F_score.setText(""+ result_concluded(button));
 result.setText(""+movenext(count_question));
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
 java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>

 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Quiz().setVisible(true);
 }
 });
 }
 // Variables declaration
 private javax.swing.JTextField F_score;
 private javax.swing.JButton View_B;
 private javax.swing.JButton View_c;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JTextField jTextField1;
 private javax.swing.JTextField result;
 private javax.swing.JButton view_A;
 private javax.swing.JButton view_D;
 private javax.swing.JTextField view_Question;
 // End of variables declaration

 public String getValue() {
 return value;
 }

 public void setValue(String value) {
 this.value = value;
 }
}
