package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignupPageTwo extends JFrame {

    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan,textAadhaar;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formNo;

    public SignupPageTwo(String formNo){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(25,10,100,100);
        add(image1);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(400,30,600,30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(350,60,600,30);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Ralway",Font.BOLD,20));
        l3.setBounds(100,190,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(255, 255, 255));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(300,190,400,30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Ralway",Font.BOLD,20));
        l4.setBounds(100,240,110,30);
        add(l4);

        String category[] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(255, 255, 255));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,240,400,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Ralway",Font.BOLD,20));
        l5.setBounds(100,290,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,290,400,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Ralway",Font.BOLD,20));
        l6.setBounds(100,340,135,30);
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,340,400,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        l7.setBounds(100,390,135,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,390,400,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Ralway",Font.BOLD,20));
        l8.setBounds(100,440,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(300,440,400,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhaar Number :");
        l9.setFont(new Font("Ralway",Font.BOLD,20));
        l9.setBounds(100,490,190,30);
        add(l9);

        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Raleway",Font.BOLD,14));
        textAadhaar.setBounds(300,490,400,30);
        add(textAadhaar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Ralway",Font.BOLD,20));
        l10.setBounds(100,540,190,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(255, 255, 255));
        r1.setBounds(300,540,400,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(255, 255, 255));
        r2.setBounds(450,540,400,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Ralway",Font.BOLD,20));
        l11.setBounds(100,590,190,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(255, 255, 255));
        e1.setBounds(300,590,400,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(255, 255, 255));
        e2.setBounds(450,590,400,30);
        add(e2);
        
        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Ralway",Font.BOLD,20));
        l12.setBounds(650,30,100,30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Ralway",Font.BOLD,20));
        l13.setBounds(700,30,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Ralewy",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setOpaque(true);
        next.setBorderPainted(false);
        next.setBounds(620,710,80,30);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupPageTwo("");
    }
}
