import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PaymentFrameBLS extends JFrame implements ActionListener {

 MyFrame myFrame;
 JButton Pay = new JButton("PAY");

 JTextField textField = new JTextField();

 JFrame PaymentFrameBLS = new JFrame();

 PaymentFrameBLS() {

  this.myFrame = new MyFrame();
  myFrame.dispose();




  PaymentFrameBLS.setTitle("Payment Portal");//set title of folder
  PaymentFrameBLS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
  PaymentFrameBLS.setSize(390, 450);//set width and height of window
  PaymentFrameBLS.setResizable(false);//make the window not resizable
  PaymentFrameBLS.setVisible(true);//make window visible
  PaymentFrameBLS.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
  PaymentFrameBLS.getContentPane().setBackground(new Color(0x47AB));
  ImageIcon logo = new ImageIcon("Project Logo 2 resized.jpg");


  JLabel Label = new JLabel("BLS Payment Portal");
  Label.setVisible(true);
  Label.setIcon(logo);
  PaymentFrameBLS.add(Label);
  Label.setForeground(Color.white);
  Label.setFont(new Font("PlayFair Display", Font.BOLD, 23));
  Label.setBounds(50, 0, 200, 200);


  JLabel Fees = new JLabel("FEES TO PAY: 472,000");
  int fees = 472000;
  PaymentFrameBLS.add(Fees);
  Fees.setVisible(true);
  Fees.setFocusable(false);
  Fees.setForeground(Color.white);
  Fees.setFont(new Font("Playfair Display", Font.BOLD, 13));
  Fees.setBounds(0, 30, 100, 100);


  JLabel ETransact = new JLabel("Enter your E-transact Number");
  ETransact.setVisible(true);
  PaymentFrameBLS.add(ETransact);
  ETransact.setForeground(Color.white);
  ETransact.setFont(new Font("Playfair Display", Font.BOLD, 16));



  PaymentFrameBLS.add(textField);
  textField.setPreferredSize(new Dimension(250, 40));

  PaymentFrameBLS.add(Pay);
  Pay.setSize(50, 50);
  Pay.setBounds(10, 120, 300, 300);
  Pay.addActionListener(this);
  Pay.setForeground(Color.black);
  Pay.setVisible(true);
  Pay.setFocusable(false);


 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource() == Pay && textField.getText().isEmpty()){
   JOptionPane.showMessageDialog(null, "Please Enter a your E-Transact number");

  }
  else{
JOptionPane.showMessageDialog(null, "Payment Successful");
   int result = JOptionPane.showConfirmDialog(null, "Would you like to print out a receipt");
   Pay.setEnabled(false);
   if(result == 1){
    JOptionPane.showMessageDialog(null, "Thank you for your time!!");
   } else if (result == 0) {
    ReceiptBLS receipt = new ReceiptBLS();

   }

  }

 }
}


