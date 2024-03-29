import javax.swing.*;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 


public class Admin_Interface implements ActionListener{  
    Car [] car= new Car[3];
	JFrame f;

    JLabel label1;	
    JLabel label2;	
    JLabel label3;	
    JLabel label4;	

	
    JButton button1;  
    JButton button2;
    JButton button3;  
    JButton buttona;  
    JButton buttonb;  
    JButton buttonc;  

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
	
    Admin_Interface (Car[] car){  
        this.car=car;


        JLabel label1= new JLabel("Admin User Interface");
        label1.setBounds(300,25, 700,50);
        label1.setFont(new Font("Stylus BT", Font.BOLD, 55));
        label1.setForeground(Color.white);

        JLabel label2= new JLabel("Picture");
        label2.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label2.setBounds(25,50, 90,30);
        label2.setForeground(Color.white);

        JLabel label3= new JLabel("Picture");
        label3.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label3.setBounds(25,50, 90,30);
        label3.setForeground(Color.white);

        JLabel label4= new JLabel("Picture");
        label4.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label4.setBounds(25,50, 90,30);
        label4.setForeground(Color.white);

        //-----------------------------------\\

        f = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        //--------------------Button----------------------\\

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        buttona = new JButton();

        button1 = new JButton("Previous");
        button1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        button1.setBackground(new Color(70, 150,150));
        button1.setBounds(50, 650, 200, 30);
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        button1.setFocusable(false);

        button2 = new JButton("Exit");
        button2.setFont(new Font("Stylus BT", Font.BOLD, 16));
        button2.setBackground(new Color(70, 150,150));
        button2.setForeground(Color.white);
        button2.setBounds(850, 650, 200, 30);
        button2.addActionListener(this);
        button2.setFocusable(false);

        button3 = new JButton("Log Out");
        button3.setFont(new Font("Stylus BT", Font.BOLD, 16));
        button3.setBackground(new Color(70, 150,150));
        button3.setForeground(Color.white);
        button3.setBounds(470, 650, 200, 30);
        button3.addActionListener(this);
        button3.setFocusable(false);

        buttona = new JButton("1.Dealer(");
        buttona.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttona.setBackground(new Color(23, 56,67));
        buttona.setForeground(Color.white);
        buttona.setBounds(50, 300, 200, 30);
        buttona.addActionListener(this);
        buttona.setFocusable(false);

        buttonb = new JButton("2.User");
        buttonb.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonb.setBackground(new Color(23, 56,67));
        buttonb.setForeground(Color.white);
        buttonb.setBounds(470, 300, 200, 30);
        buttonb.addActionListener(this);
        buttonb.setFocusable(false);

        buttonc = new JButton("3.User");
        buttonc.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonc.setBackground(new Color(23, 56,67));
        buttonc.setForeground(Color.white);
        buttonc.setBounds(850, 300, 200, 30);
        buttonc.addActionListener(this);
        buttonc.setFocusable(false);
     
        //----------------------Panel------------------------\\

        panel1 = new JPanel();
        panel1.setBounds(880,120,150,150);
        panel1.setBackground(new Color(155, 198, 227));
        panel1.add(label4);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBounds(500,120,150,150);
        panel2.setBackground(new Color(155, 198, 227));
        panel2.add(label3);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(80,120,150,150);
        panel3.setBackground(new Color(155, 198, 227)); 
        panel3.add(label2);
        panel3.setLayout(null);

        panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(1100, 700));
        panel4.setBackground(new Color(23, 56,67));
        panel4.add(panel1);   
        panel4.add(panel2);   
        panel4.add(panel3);   
        panel4.add(label1);
        //panel4.add(button1);
        panel4.add(button2);
        panel4.add(button3);
        panel4.add(buttona);
        panel4.add(buttonb);
        panel4.add(buttonc);
        panel4.setLayout(null);

        //------------------------------------------------\\

        f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(panel4, new GridBagConstraints());
        f.setSize(new Dimension(1600, 850));
        f.getContentPane().setBackground(new Color(155, 198, 227));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(70, 150,150));
        f.setVisible(true);  
        
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==button1)
		{  
			f.setVisible(false);
			//new HomePage();
        }
        if(e.getSource()==button2)
        {   
            f.dispose();
        }

        if(e.getSource()==button3)
        {   
            f.setVisible(false);
           new AdminLogin(car);
        }

        if(e.getSource()==buttona)
        {
           f.setVisible(false);
           //new DealerCarProfile1();
        }

        // if(e.getSource()==buttonb)
        // {
        //     f.setVisible(false);
        //     new UserCarInventry1 ();
        // }
		
    }  

} 