import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {

 //JButton Button = new JButton();
 JCheckBox checkBox = new JCheckBox();
 JRadioButton BUNSA = new JRadioButton("School of Nursing Sciences");
 JRadioButton BUAMS = new JRadioButton("Ben Carson School of Medicine");
 JRadioButton VASS = new JRadioButton("Veronica Adeleke School of Social Sciences");
 JRadioButton BUCC = new JRadioButton("School of Computing and Engineering Sciences ");
 JRadioButton SAT = new JRadioButton("School of Science and Technology");
 JRadioButton Law = new JRadioButton("School of Law and Security Studies");

 JRadioButton EAH = new JRadioButton("School of Education and Humanities");

 JButton Button = new JButton();
 String Message;
 ButtonGroup group = new ButtonGroup();//intitalizing button group

 //MyFrame MyFrame = new MyFrame();


 public MyFrame() {

  ImageIcon Logo = new ImageIcon("babcock-university-logo.jpg");

  this.setTitle("BU Cafeteria System");//set title of folder
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//make program to close using button
  this.setSize(620, 710);//set width and height of window
  this.setResizable(false);//make the window not resizable
  this.setVisible(true);//make window visible
  this.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));

  //setting layout

  Border border = BorderFactory.createLineBorder(Color.white);//creating a border for the frame

  ImageIcon WelcomeLogo = new ImageIcon("Project Logo 2 resized.jpg");//set Label Icon


  JLabel Label = new JLabel();//create label
  Label.setText("WELCOME TO BABCOCK UNIVERSITY");//setting text on label
  this.add(Label);
  Label.setIcon(WelcomeLogo);
  Label.setHorizontalTextPosition(JLabel.RIGHT);//set label to left center or right
  Label.setVerticalTextPosition(JLabel.CENTER);
  Label.setBorder(border);
  Label.setForeground(Color.white);//set color of font
  Label.setFont(new Font("Playfair Display", Font.PLAIN, 25));//set type of font and font size
  Label.setVerticalAlignment(JLabel.TOP);//set exact position of label
  Label.setHorizontalAlignment(JLabel.CENTER);
  Label.setBounds(0, 0, 700, 700);//set bounds of label

  JLabel Label2 = new JLabel();
  this.add(Label2);
  Label2.setText("Pick your department");
  Label2.setForeground(Color.white);
  Label2.setHorizontalTextPosition(JLabel.LEFT);
  Label2.setFont(new Font("Playfair Display", Font.PLAIN, 20));
  Label2.setVerticalTextPosition(JLabel.TOP);
  Label2.setVerticalAlignment(JLabel.TOP);
  Label2.setHorizontalAlignment(JLabel.LEFT);
  Label2.setBounds(0, 120, 400, 400);


  JPanel panel = new JPanel();
  panel.setPreferredSize(new Dimension(350, 325));
  panel.setBackground(Color.LIGHT_GRAY);
  panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));


  VASS.setActionCommand("Veronica Adeleke School of Social Sciences");
  panel.add(VASS);
  VASS.setVisible(true);
  VASS.setBounds(10, 65, 300, 300);
  VASS.setOpaque(false);
  VASS.setFocusable(false);
  VASS.addActionListener(this);

  BUCC.setActionCommand("School of Computing and Engineering Sciences ");
  panel.add(BUCC);
  BUCC.setVisible(true);
  BUCC.setOpaque(false);
  BUCC.setFocusable(false);
  BUCC.addActionListener(this);
  //BUCC.setBounds(20,120,300,300);

  BUAMS.setActionCommand("Ben Carson School of Medicine");
  panel.add(BUAMS);
  BUAMS.setOpaque(false);
  BUAMS.setFocusable(false);
  BUAMS.addActionListener(this);


  EAH.setActionCommand("School of Education and Humanities");
  panel.add(EAH);
  EAH.setFocusable(false);
  EAH.setOpaque(false);

  BUNSA.setActionCommand("School of Nursing Sciences");
  panel.add(BUNSA);
  BUNSA.setFocusable(false);
  BUNSA.setOpaque(false);
  BUNSA.addActionListener(this);

  SAT.setActionCommand("School of Science and Technology");
  panel.add(SAT);
  SAT.setFocusable(false);
  SAT.setOpaque(false);
  SAT.addActionListener(this);

  Law.setText("School of Law and Security Studies");
  panel.add(Law);
  Law.setFocusable(false);
  Law.setOpaque(false);
  Law.addActionListener(this);


  group.add(VASS);
  group.add(BUCC);
  group.add(BUAMS);
  group.add(Law);
  group.add(BUNSA);
  group.add(EAH);
  group.add(SAT);
  this.add(panel);

  JLabel Label3 = new JLabel();
  this.add(Label3);
  Label3.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 100));
  Label3.setText(".....A Seventh-Day Adventist Institution for higher learning");
  Label3.setHorizontalTextPosition(JLabel.CENTER);
  Label3.setVerticalTextPosition(JLabel.BOTTOM);
  Label3.setHorizontalAlignment(JLabel.CENTER);
  Label3.setVerticalAlignment(JLabel.BOTTOM);
  Label3.setFont(new Font("Italics", Font.ITALIC, 16));
  Label3.setForeground(Color.white);
  Label3.setHorizontalTextPosition(JLabel.RIGHT);//set label to left center or right
  Label3.setVerticalTextPosition(JLabel.CENTER);
  Label3.setBounds(40, 400, 500, 500);
  Label3.setVisible(true);


  this.add(Button);
  Button.setText("ACTION");
  Button.setForeground(Color.black);
  Button.setVisible(true);
  Button.setFocusable(false);
  Button.setSize(50, 50);
  Button.setBounds(10, 120, 300, 300);
  Button.addActionListener(this);


  this.setIconImage(Logo.getImage());//setting Logo on the window by fetching it from path
  this.getContentPane().setBackground(new Color(0x47AB));//setting background color
 }


 @Override

 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == Button) {
   if (e.getSource() == Button && (!group.isSelected(null))) {
    this.dispose();
    MealPlanFrame mealPlanFrame = new MealPlanFrame();
    this.dispose();
    this.dispose();
    Message = group.getSelection().getActionCommand();
    //JOptionPane.showMessageDialog(null, Message);
   } else {
    JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR DEPARTMENT");

   }

  }
 }
}


