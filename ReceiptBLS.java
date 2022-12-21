import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;


public class ReceiptBLS  {


    ReceiptBLS(){
        ZonedDateTime current = ZonedDateTime.now();
        ImageIcon logo = new ImageIcon("Project Logo 2 resized.jpg");
        String feesBLS = "472,000";
        JOptionPane.showMessageDialog(null, "Please enter correct information to generate receipt");
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        String matricNumber;
        matricNumber = JOptionPane.showInputDialog(null, "Enter your matric number");
        String hall = JOptionPane.showInputDialog(null, "Enter your hall of residence");
        String course = JOptionPane.showInputDialog(null, "Enter your Course of study");
        JOptionPane.showMessageDialog(null, "Hold on receipt generating......");



        JFrame ReceiptBLS = new JFrame();
        ReceiptBLS.setTitle("Receipt");//set title of folder
        ReceiptBLS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
        ReceiptBLS.setSize(500, 500);//set width and height of window
        ReceiptBLS.setResizable(false);//make the window not resizable
        ReceiptBLS.setVisible(true);//make window visible
        ReceiptBLS.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        ReceiptBLS.getContentPane().setBackground(new Color(0x47AB));

        JLabel header = new JLabel("RECEIPT");
        ReceiptBLS.add(header);
        header.setIcon(logo);
        header.setVisible(true);
        header.setFocusable(false);
        header.setForeground(Color.white);
        header.setFont(new Font("Playfair Display", Font.BOLD, 23));
        header.setBounds(200, 0, 100, 100);

        JLabel Name = new JLabel("Name: " + name.toUpperCase());
        ReceiptBLS.add(Name);
        Name.setVisible(true);
        Name.setFocusable(false);
        Name.setLayout(new FlowLayout());
        Name.setVerticalTextPosition(JLabel.TOP);
        Name.setHorizontalTextPosition(JLabel.LEFT);
        Name.setForeground(Color.white);
        Name.setFont(new Font("Playfair Display", Font.PLAIN, 14));
        Name.setBounds(0, 200, 100, 100);
        //current.toString();

        JLabel Time= new JLabel("Time Generated: " + current);
        ReceiptBLS.add(Time);
        Time.setVisible(true);
        Time.setFocusable(false);
        Time.setLayout(new FlowLayout());
        Time.setVerticalTextPosition(JLabel.TOP);
        Time.setHorizontalTextPosition(JLabel.LEFT);
        Time.setForeground(Color.white);
        Time.setFont(new Font("Playfair Display", Font.PLAIN, 14));
        Time.setBounds(0, 200, 100, 100);




        JLabel MatricNumber = new JLabel("Matric Number: " + matricNumber);
        ReceiptBLS.add(MatricNumber);
        MatricNumber.setVisible(true);
        MatricNumber.setFocusable(false);
        MatricNumber.setLayout(new FlowLayout());
        MatricNumber.setVerticalTextPosition(JLabel.TOP);
        MatricNumber.setHorizontalTextPosition(JLabel.LEFT);
        MatricNumber.setForeground(Color.white);
        MatricNumber.setFont(new Font("Playfair Display", Font.PLAIN, 13));
        MatricNumber.setBounds(0, 200, 100, 100);

        JLabel HallOfResidence = new JLabel("Hall of Residence: " + hall );
        ReceiptBLS.add(HallOfResidence);
        HallOfResidence.setVisible(true);
        HallOfResidence.setFocusable(false);
        HallOfResidence.setLayout(new FlowLayout());
        HallOfResidence.setVerticalTextPosition(JLabel.TOP);
        HallOfResidence.setHorizontalTextPosition(JLabel.LEFT);
        HallOfResidence.setForeground(Color.white);
        HallOfResidence.setFont(new Font("Playfair Display", Font.PLAIN, 13));
        HallOfResidence.setBounds(0, 200, 100, 100);

        JLabel Course = new JLabel("Course of Study: " + course );
        ReceiptBLS.add(Course);
        Course.setVisible(true);
        Course.setFocusable(false);
        Course.setLayout(new FlowLayout());
        Course.setVerticalTextPosition(JLabel.TOP);
        Course.setHorizontalTextPosition(JLabel.LEFT);
        Course.setForeground(Color.white);
        Course.setFont(new Font("Playfair Display", Font.PLAIN, 13));
        Course.setBounds(0, 200, 100, 100);

        JLabel FeesBLS = new JLabel("Total Amount Paid: " + feesBLS );
        ReceiptBLS.add(FeesBLS);
        FeesBLS.setVisible(true);
        FeesBLS.setFocusable(false);
        FeesBLS.setLayout(new FlowLayout());
        FeesBLS.setForeground(Color.white);
        FeesBLS.setFont(new Font("Playfair Display", Font.PLAIN, 13));


        JLabel Copyright = new JLabel("Copyright @COSC 205 JAVA GROUP 2. All Rights Reserved.");
        ReceiptBLS.add(Copyright);
        Copyright.setVisible(true);
        Copyright.setFocusable(false);
        Copyright.setLayout(new FlowLayout());
        Copyright.setForeground(Color.white);
        Copyright.setFont(new Font("Playfair Display", Font.ITALIC, 13));









    }
}