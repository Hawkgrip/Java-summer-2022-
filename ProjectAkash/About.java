import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 

public class About implements ActionListener{  
    Car[] car= new Car[3];
    
	JFrame f;

    JLabel l1;
	JLabel l2;	
	JLabel l3;	
	JLabel l4;	
	JLabel l5;	
	JLabel l6;	
	JLabel l7;	
	JLabel l8;	

    JButton b;


    JPanel panel;
	
    About(Car[] car){  
        this.car= car;

     //   JLabel label = new JLabel();
        
        l3= new JLabel("About: Euro Car Auction Developers");
        l3.setFont(new Font("Stylus BT", Font.BOLD, 30));   
        l3.setBounds(90, 50,700,40);
        l3.setForeground(Color.yellow);

        l1= new JLabel("Supervised By MD. Nazmul Hossain, (Lecturer, CS) ");
        l1.setFont(new Font("Stylus BT", Font.ITALIC, 25));
        l1.setBounds(50,120, 600,30);
        l1.setForeground(Color.red);

        l2= new JLabel("Contribution");
        l2.setFont(new Font("Stylus BT", Font.BOLD, 20));   
        l2.setBounds(300, 180,200,20);
        l2.setForeground(Color.white);

        //----------------------------------------------------------------------------------------------//
        //Group Members

        l4= new JLabel("Amit Barua (16-32547-2) Team Leader, Advisor");
        l4.setFont(new Font("Stylus BT", Font.BOLD, 18));   
        l4.setBounds(100, 220,700,25);
        l4.setForeground(Color.gray);

        l5= new JLabel("Safuan Ul Haque Arafat (19-39945-1) Designer, Editor");
        l5.setFont(new Font("Stylus BT", Font.BOLD, 18));   
        l5.setBounds(100, 250,700,25);
        l5.setForeground(Color.gray);

        l6= new JLabel("Shayan Sikta Ghosh (21-45846-3) In Text Writer and Researcher");
        l6.setFont(new Font("Stylus BT", Font.BOLD, 18));   
        l6.setBounds(100, 280,700,25);
        l6.setForeground(Color.gray);

        l7= new JLabel("Susham Moula Choudhury Akash (22-47168-1) Framework");
        l7.setFont(new Font("Stylus BT", Font.BOLD, 18));   
        l7.setBounds(100, 310,700,25);
        l7.setForeground(Color.gray);

        //---------------------------------------------------------------------------------------//


        l8= new JLabel("Thank You to all Group members and our respectful Sir for their Contribution");
        l8.setFont(new Font("Stylus BT", Font.ITALIC, 18));   
        l8.setBounds(40, 350,700,25);
        l8.setForeground(Color.gray);


        //Back to Home Page
        b = new JButton("Back");
        b.setFont(new Font("Stylus BT", Font.BOLD, 30));
        b.setBackground(new Color(70, 150,150));
        b.setForeground(Color.black);
        b.setBounds(240, 400, 250, 40);
        b.addActionListener(this);
        b.setFocusable(false);

        //---------------------panel-----------------------------\\

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(700, 500));
        panel.setBackground(new Color(23, 56,67)); 
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(l5);
        panel.add(l6);
        panel.add(l7);
        panel.add(l8);
        panel.add(b);
        panel.setLayout(null);

        f = new JFrame();
        f.setLayout(new GridBagLayout());
        f.add(panel, new GridBagConstraints());
        f.setSize(new Dimension(1600, 850));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(70, 150,150));
        f.setMinimumSize(new Dimension(400, 600));
        f.setVisible(true);  
        
        
    }         
    public void actionPerformed(ActionEvent e) {  
         
    
        
        if(e.getSource()==b){   
            f.setVisible(false);
            new HomePage(car);
        }
    }  

} 