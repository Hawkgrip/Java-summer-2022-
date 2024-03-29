import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 


public class HomePage implements ActionListener{  
    Car[] car= new Car[3];

    ImageIcon i1;
    
	JFrame f;

    JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;

	
    JButton b1;  
    JButton b2;
    JButton b3;


    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
	
    HomePage(Car[] car){  
        this.car=car;

        //---------------------Label---------------------------------------//

        JLabel label = new JLabel();
        label.setBounds(55, 0, 320, 180);

        l1= new JLabel("Euro Car Auction");
        l1.setFont(new Font("Stylus BT", Font.BOLD, 30));
        l1.setBounds(1300,30, 500,40);
        l1.setForeground(Color.white);

        l2= new JLabel("Home Page");
        l2.setFont(new Font("Stylus BT", Font.BOLD, 40));   
        l2.setBounds(700, 20,350,50);
        l2.setForeground(Color.white);

        l3= new JLabel(new ImageIcon("images/intro.jpg"));
        l3.setFont(new Font("Stylus BT", Font.BOLD, 40));   
        l3.setBounds(20, -20,400,600);
        l3.setForeground(Color.white);

        l4= new JLabel(new ImageIcon("images/bidcar-auction-9.jpg"));
        l4.setFont(new Font("Stylus BT", Font.BOLD, 75));   
        l4.setBounds(150, 0,700,600);
        l4.setBackground(new Color(23, 56,67));
        
        //---------------------Button---------------------------------------//

        b1 = new JButton("Sign In");
        b1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b1.setBackground(new Color(70, 150,150));
        b1.setForeground(Color.white);
        b1.setBounds(1380,100, 150, 30);
        b1.addActionListener(this);
        b1.setFocusable(false);

        b2 = new JButton("Exit");
        b2.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b2.setBackground(new Color(70, 150,150));
        b2.setForeground(Color.white);
        b2.setBounds(50, 100, 200, 30);
        b2.addActionListener(this);
        b2.setFocusable(false);

        b3 = new JButton("About");
        b3.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b3.setBackground(new Color(70, 150,150));
        b3.setForeground(Color.white);
        b3.setBounds(700, 100, 200, 30);
        b3.addActionListener(this);
        b3.setFocusable(false);

        // --------------------Image-----------------------//
        
        

        l4.setHorizontalTextPosition(JLabel.CENTER);
        l4.setVerticalTextPosition(JLabel.TOP);

       //---------------------Panel------------------------------//
    
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(1580, 160));
        panel2.setBackground(new Color(23, 56,67)); 
        panel2.add(l1);
        panel2.add(l2);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(20,30,1000,550);
        panel3.setBackground(new Color(110, 180,105)); 
        panel3.add(l4);
        
        panel3.setLayout(null);
  
        panel4 = new JPanel();
        panel4.setBounds(1050,30,450,550);
        panel4.setBackground(new Color(110, 180,105)); 
        panel4.add(l3);
        panel4.setLayout(null);

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(1520, 600));
        panel1.setBackground(new Color(23, 56,67)); 
        panel1.add(panel3);
        panel1.add(panel4);
        panel1.setLayout(null);

     //---------------------Frame---------------------------------//

        f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(panel2, new GridBagConstraints());
        f.add(panel1,new GridBagConstraints());
        f.setSize(new Dimension(1600, 850));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(70, 150,150));
        f.setMinimumSize(new Dimension(400, 400));
        f.setVisible(true);  

    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==b1)
		{  
            f.dispose();
            new SignInPage(car);	
        }

        if(e.getSource()==b2){   
            f.dispose();
        }
        if(e.getSource()==b3)
        {
            f.dispose();
			new About(car);
        }

      
    }  

} 