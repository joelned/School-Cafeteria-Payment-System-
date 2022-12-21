import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentFrameBS implements ActionListener  {
    JButton Pay = new JButton("PAY");
    JTextField textField = new JTextField();

    JFrame PaymentFrameBS = new JFrame();
    PaymentFrameBS(){
        ImageIcon logo = new ImageIcon("Project Logo 2 resized.jpg");

        PaymentFrameBS.setTitle("Payment Portal BS");//set title of folder
        PaymentFrameBS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
        PaymentFrameBS.setSize(400, 450);//set width and height of window
        PaymentFrameBS.setResizable(false);//make the window not resizable
        PaymentFrameBS.setVisible(true);//make window visible
        PaymentFrameBS.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        PaymentFrameBS.getContentPane().setBackground(new Color (0x47AB));

        JLabel Label = new JLabel("PAYMENT PORTAL");
        Label.setVisible(true);
        PaymentFrameBS.add(Label);
        Label.setForeground(Color.white);
        Label.setIcon(logo);
        Label.setFont(new Font("PlayFair Display", Font.BOLD, 23));


        JLabel Fees = new JLabel("FEES TO PAY: 325,000");
        int fees = 325000;
        PaymentFrameBS.add(Fees);
        Fees.setVisible(true);
        Fees.setFocusable(false);
        Fees.setForeground(Color.white);
        Fees.setFont(new Font("Playfair Display", Font.BOLD, 13));


        JLabel ETransact = new JLabel("Enter your E-transact Number");
        ETransact.setVisible(true);
        PaymentFrameBS.add(ETransact);
        ETransact.setForeground(Color.white);
        ETransact.setFont(new Font("Playfair Display", Font.BOLD, 16));


        PaymentFrameBS.add(textField);
        textField.setPreferredSize(new Dimension(250, 40));

        PaymentFrameBS.add(Pay);
        Pay.setSize(50, 50);
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
                Receipt receipt = new Receipt();

            }

        }




    }
}
