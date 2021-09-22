public class Final_result extends javax.swing.JFrame {
 /**
 * Creates new form Final_result
 */
 public Final_result() {
 initComponents();
 }
 /**
 * This method is called from within the constructor to initialize the form.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jLabel1 = new javax.swing.JLabel();
 correct_ans = new javax.swing.JLabel();
 T_S1 = new javax.swing.JLabel();
 correct_ans1 = new javax.swing.JLabel();
 correct_ans2 = new javax.swing.JLabel();
 Percentage = new javax.swing.JTextField();
 T_Score = new javax.swing.JTextField();
 C_ANS = new javax.swing.JTextField();
 W_aNS = new javax.swing.JTextField();
 jLabel2 = new javax.swing.JLabel();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 setMinimumSize(new java.awt.Dimension(900, 600));
 getContentPane().setLayout(null);
 jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PinoyFIQ_Generic_Quiz07.png"))); // NOI18N
 jLabel1.setMinimumSize(new java.awt.Dimension(800, 1024));
 getContentPane().add(jLabel1);
 jLabel1.setBounds(0, 0, 610, 510);
 correct_ans.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
 correct_ans.setForeground(new java.awt.Color(0, 51, 102));
 correct_ans.setText("percentage_Of_success");
 correct_ans.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 getContentPane().add(correct_ans);
 correct_ans.setBounds(560, 440, 200, 20);
 T_S1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
 T_S1.setForeground(new java.awt.Color(0, 51, 102));
 T_S1.setText("Total_Score");
 T_S1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 getContentPane().add(T_S1);
 T_S1.setBounds(560, 350, 200, 20);
 correct_ans1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
 correct_ans1.setForeground(new java.awt.Color(0, 51, 102));
 correct_ans1.setText("Correct_Answsers");
 correct_ans1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 getContentPane().add(correct_ans1);
 correct_ans1.setBounds(560, 380, 200, 20);
 correct_ans2.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
 correct_ans2.setForeground(new java.awt.Color(0, 51, 102));
 correct_ans2.setText("Worng_Answsers");
 correct_ans2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 getContentPane().add(correct_ans2);
 correct_ans2.setBounds(560, 410, 200, 20);
 Percentage.setEditable(false);
 Percentage.setForeground(new java.awt.Color(0, 0, 102));
 Percentage.setAutoscrolls(false);

Percentage.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBord
er.RAISED));
 Percentage.setCaretColor(new java.awt.Color(102, 153, 255));
 Percentage.setEnabled(false);
 Percentage.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 PercentageActionPerformed(evt);
 }
 });
 getContentPane().add(Percentage);
 Percentage.setBounds(770, 440, 80, 18);
 T_Score.setEditable(false);
 T_Score.setForeground(new java.awt.Color(0, 0, 102));
 T_Score.setAutoscrolls(false);

T_Score.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.
RAISED));
 T_Score.setCaretColor(new java.awt.Color(102, 153, 255));
 T_Score.setEnabled(false);
 T_Score.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 T_ScoreActionPerformed(evt);
 }
 });
 getContentPane().add(T_Score);
 T_Score.setBounds(770, 350, 80, 18);
 C_ANS.setEditable(false);
 C_ANS.setForeground(new java.awt.Color(0, 0, 102));
 C_ANS.setAutoscrolls(false);

C_ANS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.R
AISED));
 C_ANS.setCaretColor(new java.awt.Color(102, 153, 255));
 C_ANS.setEnabled(false);
 C_ANS.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 C_ANSActionPerformed(evt);
 }
 });
 getContentPane().add(C_ANS);
 C_ANS.setBounds(770, 380, 80, 18);
 W_aNS.setEditable(false);
 W_aNS.setForeground(new java.awt.Color(0, 0, 102));
 W_aNS.setAutoscrolls(false);

W_aNS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.R
AISED));
 W_aNS.setCaretColor(new java.awt.Color(102, 153, 255));
 W_aNS.setEnabled(false);
 W_aNS.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 W_aNSActionPerformed(evt);
 }
 });
 getContentPane().add(W_aNS);
 W_aNS.setBounds(770, 410, 80, 18);
 jLabel2.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
 jLabel2.setForeground(new java.awt.Color(102, 0, 0));
 jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel2.setText("Click hereTry Aga!n");
 jLabel2.setBorder(new
javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null,
java.awt.Color.lightGray, new java.awt.Color(102, 0, 0), new java.awt.Color(0, 0, 0)));
 jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
 jLabel2MouseClicked(evt);
 }
 });
 getContentPane().add(jLabel2);
 jLabel2.setBounds(610, 150, 260, 110);
 pack();
 }// </editor-fold>
 private void PercentageActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void T_ScoreActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void C_ANSActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void W_aNSActionPerformed(java.awt.event.ActionEvent evt) {

 }
 private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {


 subject obj=new subject();
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

java.util.logging.Logger.getLogger(Final_result.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(Final_result.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(Final_result.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(Final_result.class.getName()).log(java.util.logging.Level.SEVERE,
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Final_result().setVisible(true);
 }
 });
 }
 // Variables declaration
 public static javax.swing.JTextField C_ANS;
 public static javax.swing.JTextField Percentage;
 private javax.swing.JLabel T_S1;
 public static javax.swing.JTextField T_Score;
 public static javax.swing.JTextField W_aNS;
 private javax.swing.JLabel correct_ans;
 private javax.swing.JLabel correct_ans1;
 private javax.swing.JLabel correct_ans2;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 // End of variables declaration
}
