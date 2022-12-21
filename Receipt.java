import javax.swing.*;
import java.awt.*;
import java.time.ZonedDateTime;

public class Receipt {

        Receipt(){
            ZonedDateTime current = ZonedDateTime.now();
            ImageIcon logo = new ImageIcon("Project Logo 2 resized.jpg");
            String feesBS = "325,000";
            JOptionPane.showMessageDialog(null, "Please enter correct information to generate receipt");
            String name = JOptionPane.showInputDialog(null, "Enter your name");
            String matricNumber;
            matricNumber = JOptionPane.showInputDialog(null, "Enter your matric number");
            String hall = JOptionPane.showInputDialog(null, "Enter your hall of residence");
            String course = JOptionPane.showInputDialog(null, "Enter your Course of study");
            JOptionPane.showMessageDialog(null, "Hold on receipt generating......");



            JFrame Receipt = new JFrame();
            Receipt.setTitle("Receipt");//set title of folder
            Receipt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
            Receipt.setSize(500, 500);//set width and height of window
            Receipt.setResizable(false);//make the window not resizable
            Receipt.setVisible(true);//make window visible
            Receipt.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
            Receipt.getContentPane().setBackground(Color.white);

            JLabel header = new JLabel("RECEIPT");
            Receipt.add(header);
            header.setIcon(logo);
            header.setVisible(true);
            header.setFocusable(false);
            header.setForeground(Color.black);
            header.setFont(new Font("Playfair Display", Font.BOLD, 23));
            header.setBounds(200, 0, 100, 100);

            JLabel Name = new JLabel("Name: " + name.toUpperCase());
            Receipt.add(Name);
            Name.setVisible(true);
            Name.setFocusable(false);
            Name.setLayout(new FlowLayout());
            Name.setVerticalTextPosition(JLabel.TOP);
            Name.setHorizontalTextPosition(JLabel.LEFT);
            Name.setForeground(Color.black);
            Name.setFont(new Font("Playfair Display", Font.PLAIN, 14));
            Name.setBounds(0, 200, 100, 100);


            JLabel MatricNumber = new JLabel("Matric Number: " + matricNumber);
            Receipt.add(MatricNumber);
            MatricNumber.setVisible(true);
            MatricNumber.setFocusable(false);
            MatricNumber.setLayout(new FlowLayout());
            MatricNumber.setVerticalTextPosition(JLabel.TOP);
            MatricNumber.setHorizontalTextPosition(JLabel.LEFT);
            MatricNumber.setForeground(Color.black);
            MatricNumber.setFont(new Font("Playfair Display", Font.PLAIN, 13));
            MatricNumber.setBounds(0, 200, 100, 100);

            JLabel HallOfResidence = new JLabel("Hall of Residence: " + hall );
            Receipt.add(HallOfResidence);
            HallOfResidence.setVisible(true);
            HallOfResidence.setFocusable(false);
            HallOfResidence.setLayout(new FlowLayout());
            HallOfResidence.setVerticalTextPosition(JLabel.TOP);
            HallOfResidence.setHorizontalTextPosition(JLabel.LEFT);
            HallOfResidence.setForeground(Color.black);
            HallOfResidence.setFont(new Font("Playfair Display", Font.PLAIN, 13));
            HallOfResidence.setBounds(0, 200, 100, 100);

            JLabel Course = new JLabel("Course of Study: " + course );
            Receipt.add(Course);
            Course.setVisible(true);
            Course.setFocusable(false);
            Course.setLayout(new FlowLayout());
            Course.setVerticalTextPosition(JLabel.TOP);
            Course.setHorizontalTextPosition(JLabel.LEFT);
            Course.setForeground(Color.black);
            Course.setFont(new Font("Playfair Display", Font.PLAIN, 13));
            Course.setBounds(0, 200, 100, 100);

            JLabel FeesBLS = new JLabel("Total Amount Paid: " + feesBS );
            Receipt.add(FeesBLS);
            FeesBLS.setVisible(true);
            FeesBLS.setFocusable(false);
            FeesBLS.setLayout(new FlowLayout());
            FeesBLS.setForeground(Color.black);
            FeesBLS.setFont(new Font("Playfair Display", Font.PLAIN, 13));


            JLabel Copyright = new JLabel("Copyright @COSC 205 JAVA GROUP 2. All Rights Reserved.");
            Receipt.add(Copyright);
            Copyright.setVisible(true);
            Copyright.setFocusable(false);
            Copyright.setLayout(new FlowLayout());
            Copyright.setForeground(Color.black);
            Copyright.setFont(new Font("Playfair Display", Font.ITALIC, 13));

            JLabel Time= new JLabel("Time Generated: " + current);
            Receipt.add(Time);
            Time.setVisible(true);
            Time.setFocusable(false);
            Time.setLayout(new FlowLayout());
            Time.setVerticalTextPosition(JLabel.TOP);
            Time.setHorizontalTextPosition(JLabel.LEFT);
            Time.setForeground(Color.black);
            Time.setFont(new Font("Playfair Display", Font.PLAIN, 14));
            Time.setBounds(0, 200, 100, 100);

        }
    }
