import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;



public class MealPlanFrame implements ActionListener {


    JFrame mealPlanFrame = new JFrame();

    JRadioButton BLS = new JRadioButton("Breakfast, Lunch and Supper");
    JRadioButton BS = new JRadioButton("BreakFast and Supper");
    JRadioButton LS = new JRadioButton("Lunch and Supper");

    JButton Button = new JButton();
    ButtonGroup group = new ButtonGroup();


    public MealPlanFrame() {

        mealPlanFrame.setTitle("Meal Plan Selection");//set title of folder
        mealPlanFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//make program to close using button
        mealPlanFrame.setSize(450, 450);//set width and height of window
        mealPlanFrame.setResizable(false);//make the window not resizable
        mealPlanFrame.setVisible(true);//make window visible
        mealPlanFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        mealPlanFrame.getContentPane().setBackground(new Color(0x47AB));
        ImageIcon logo = new ImageIcon("Project Logo 2 resized.jpg");

        JLabel Header = new JLabel("MEAL PLAN SELECTION");
        Header.setVisible(true);
        Header.setIcon(logo);
        mealPlanFrame.add(Header);
        Header.setForeground(Color.white);
        Header.setFont(new Font("Playfair Display", Font.BOLD, 23));
        Header.setLayout(new FlowLayout(FlowLayout.CENTER));


        JLabel Label = new JLabel("Select your meal plan");
        Label.setVisible(true);
        mealPlanFrame.add(Label);
        Label.setForeground(Color.white);
        Label.setFont(new Font("Playfair Display", Font.HANGING_BASELINE, 16));
        Label.setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 100));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));


        BLS.setActionCommand("Breakfast, Lunch and Supper");
        mealPlanFrame.add(BLS);
        BLS.setOpaque(false);
        BLS.setFocusable(false);
        BLS.setLayout(new FlowLayout());
        panel.add(BLS);

        LS.setActionCommand("Lunch and Supper");
        mealPlanFrame.add(LS);
        LS.setOpaque(false);
        LS.setFocusable(false);
        LS.setLayout(new FlowLayout());
        panel.add(LS);

        BS.setActionCommand("Breakfast and Supper");
        mealPlanFrame.add(BS);
        BS.setOpaque(false);
        BS.setFocusable(false);
        BS.setLayout(new FlowLayout());
        panel.add(BS);


        Button.setText("ACTION");
        Button.setFocusable(false);
        Button.setForeground(Color.black);
        Button.addActionListener(this);


        mealPlanFrame.add(panel);
        mealPlanFrame.add(Button);

        group.add(BLS);
        group.add(LS);
        group.add(BS);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == Button) {
                if (e.getSource() == Button && group.getSelection().getActionCommand().equals("Breakfast, Lunch and Supper") && !group.isSelected(null)) {
                    mealPlanFrame.dispose();
                     PaymentFrameBLS PaymentFrameBLS = new PaymentFrameBLS();

                } else if (e.getSource() == Button && group.getSelection().getActionCommand().equals("Lunch and Supper") && !group.isSelected(null)) {
                    mealPlanFrame.dispose();
                    PaymentFrameLUSU frame = new PaymentFrameLUSU();
                } else if (e.getSource() == Button && group.getSelection().getActionCommand().equals("Breakfast and Supper") && !group.isSelected(null)) {
                    mealPlanFrame.dispose();
                    PaymentFrameBS frame = new PaymentFrameBS();
               // } else {
                //    JOptionPane.showMessageDialog(null, "Please Select the Meal Plan you would like to pay for");
                }
            }

        } finally {
            if(e.getSource() == Button && group.isSelected(null))
                JOptionPane.showMessageDialog(null, "Please Enter the Meal Plan you would like to pay for");

        }
    }
}

