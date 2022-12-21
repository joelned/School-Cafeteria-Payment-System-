import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentFrameLUSU implements ActionListener {
    JFrame PaymentFrameLUSU = new JFrame();
    JButton Pay = new JButton("PAY");
    JTextField textField = new JTextField();

    PaymentFrameLUSU() {
        PaymentFrameLUSU.setTitle(" LS Payment Portal ");//set title of folder
        PaymentFrameLUSU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
        PaymentFrameLUSU.setSize(400, 450);//set width and height of window
        PaymentFrameLUSU.setResizable(false);//make the window not resizable
        PaymentFrameLUSU.setVisible(true);//make window visible
        PaymentFrameLUSU.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        PaymentFrameLUSU.getContentPane().setBackground(new Color(0x47AB));

        JLabel Label = new JLabel("PAYMENT PORTAL");
        Label.setVisible(true);
        PaymentFrameLUSU.add(Label);
        Label.setForeground(Color.white);
        Label.setFont(new Font("PlayFair Display", Font.BOLD, 23));
        Label.setBounds(50, 0, 200, 200);

        JLabel Fees = new JLabel("FEES TO PAY: 325,000");
        PaymentFrameLUSU.add(Fees);
        Fees.setVisible(true);
        Fees.setFocusable(false);
        Fees.setForeground(Color.white);
        Fees.setFont(new Font("Playfair Display", Font.BOLD, 13));
        Fees.setBounds(0, 30, 100, 100);


        JLabel ETransact = new JLabel("Enter your E-transact Number");
        ETransact.setVisible(true);
        PaymentFrameLUSU.add(ETransact);
        ETransact.setForeground(Color.white);
        ETransact.setFont(new Font("Playfair Display", Font.BOLD, 16));


        PaymentFrameLUSU.add(textField);
        textField.setPreferredSize(new Dimension(250, 40));

        PaymentFrameLUSU.add(Pay);
        Pay.setSize(50, 50);
        Pay.setBounds(10, 120, 300, 300);
        Pay.addActionListener(this);
        Pay.setForeground(Color.black);
        Pay.setVisible(true);
        Pay.setFocusable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Pay && textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter your E-Transact number");

        } else {
            JOptionPane.showMessageDialog(null, "Payment Successful");
            int result = JOptionPane.showConfirmDialog(null, "Would you like to print out a receipt");
            Pay.setEnabled(false);
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Thank you for your time!!");
            } else if (result == 0) {
                Receipt receipt = new Receipt();
            }
        }
    }
}