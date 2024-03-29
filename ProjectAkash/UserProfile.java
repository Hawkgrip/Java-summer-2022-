import javax.swing.*;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 

public class UserProfile implements ActionListener{ 
    Car[] car= new Car[3];
    ImageIcon i1;
	JFrame f;


    JLabel label1;	
    JLabel label2;	
    JLabel label3;	
    JLabel label4;	

	
    JButton button1;  
    JButton button2;
    JButton button3;  
    JButton buttonCar1;  
    JButton buttonb;  
    JButton buttonc;  

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
	
    UserProfile (Car[] car){  
        this.car=car;


        JLabel label1= new JLabel("User Profile");
        label1.setBounds(400,25, 600,50);
        label1.setFont(new Font("Stylus BT", Font.BOLD, 55));
        label1.setForeground(Color.white);

        JLabel label2= new JLabel(car[0].getCarImage());
        label2.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label2.setBounds(25,00, 90,30);
        label2.setForeground(Color.black);

        JLabel label3= new JLabel(car[1].getCarImage());
        label3.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label3.setBounds(25,50, 90,30);
        label3.setForeground(Color.white);

        JLabel label4= new JLabel(car[2].getCarImage());
        label4.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label4.setBounds(25,50, 90,30);
        label4.setForeground(Color.red);

        //-----------------------------------\\

        f = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();

        //--------------------Button----------------------\\


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

        button3 = new JButton("Home");
        button3.setForeground(Color.black);
        button3.setFont(new Font("Stylus BT", Font.BOLD, 16));
        button3.setBackground(new Color(70, 150,150));
        button3.setForeground(Color.white);
        button3.setBounds(470, 650, 200, 30);
        button3.addActionListener(this);
        button3.setFocusable(false);

      
        buttonCar1 = new JButton(car[0].getCarName());
        buttonCar1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonCar1.setBackground(new Color(23, 56,67));
        buttonCar1.setForeground(Color.white);
        buttonCar1.setBounds(50, 580, 200, 30);
        buttonCar1.addActionListener(this);
        buttonCar1.setFocusable(false);

        buttonb = new JButton(car[1].getCarName());
        buttonb.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonb.setBackground(new Color(23, 56,67));
        buttonb.setForeground(Color.white);
        buttonb.setBounds(470, 580, 200, 30);
        buttonb.addActionListener(this);
        buttonb.setFocusable(false);

        buttonc = new JButton(car[2].getCarName());
        buttonc.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonc.setBackground(new Color(23, 56,67));
        buttonc.setForeground(Color.white);
        buttonc.setBounds(850, 580, 200, 30);
        buttonc.addActionListener(this);
        buttonc.setFocusable(false);

        //----------------------Panel------------------------\\

        panel1 = new JPanel();
        panel1.setBounds(880,400,150,150);
        panel1.setBackground(new Color(155, 198, 227));
        panel1.add(label4);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBounds(500,400,150,150);
        panel2.setBackground(new Color(155, 198, 227));
        panel2.add(label3);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(80,400,150,150);
        panel3.setBackground(new Color(155, 198, 227)); 
        panel3.add(label2);
        panel3.setLayout(null);

        panel5 = new JPanel();
        panel5.setBounds(80,100,100,100);
        panel5.setBackground(new Color(255, 255, 255)); 
        panel5.setLayout(null);

        panel6 = new JPanel();
        panel6.setBounds(120,800,200,300);
        panel6.setBackground(new Color(200, 200, 200)); 
        panel6.setLayout(null);

        panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(1100, 700));
        //panel4.setBounds(10, 10,1100,700);
        panel4.setBackground(new Color(23, 56,67));
        panel4.add(panel1);   
        panel4.add(panel2);   
        panel4.add(panel3);   
        panel4.add(panel5);   
        panel4.add(panel6);   
        panel4.add(label1);
        panel4.add(button1);
        panel4.add(button2);
        panel4.add(button3);
        panel4.add(buttonCar1);
        panel4.add(buttonb);
        panel4.add(buttonc);
        panel4.setLayout(null);

        //----------------image---------\\
        JLabel labelimage=new JLabel();
        i1 = new ImageIcon("");
        
        labelimage.setIcon(i1);
        //l4.labelimage.setBackground;
        label2.setIcon(i1);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);

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
			new SignInPage(car);
        }

        if(e.getSource()==button2){   
            f.dispose();
        }

		if(e.getSource()==button3){
			f.setVisible(false);
            new HomePage(car);
		}

        if(e.getSource()==buttonCar1){
			f.setVisible(false);
            new CarDetails(car[0], car);

		}
        if(e.getSource()==buttonCar1){
			f.setVisible(false);
            new CarDetails(car[1], car);

		}
        if(e.getSource()==buttonCar1){
			f.setVisible(false);
            new CarDetails(car[1], car);

		}
    }  

} 