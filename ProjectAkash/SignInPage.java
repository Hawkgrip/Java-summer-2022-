import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 
import static javax.swing.JOptionPane.showMessageDialog;


public class SignInPage implements ActionListener{  
    Car[] car= new Car[3];
    
    
	JFrame f;

    JLabel l1;
	JLabel l2;	
	JLabel l3;	
	
	JTextField tf1;  
	
    JButton b1;  
    JButton b2;
    JButton b3;
    JButton b4;

    JPasswordField tf2;

    JPanel panel;
	
    SignInPage(Car[] car){  
        this.car=car;

       
        l1= new JLabel("Username");
        l1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        l1.setBounds(50,180, 200,20);
        l1.setForeground(Color.white);

        l2= new JLabel("Password");
        l2.setFont(new Font("Stylus BT", Font.BOLD, 16));   
        l2.setBounds(50, 240,200,20);
        l2.setForeground(Color.white);

        l3= new JLabel("Sign In Page");
        l3.setFont(new Font("Stylus BT", Font.ITALIC, 30));   
        l3.setBounds(70, 50,200,40);
        l3.setForeground(Color.white);



         
        tf1=new JTextField();  
        tf1.setBounds(50,200, 200,30); 
        tf1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        tf1.setBackground(new Color(70, 150,150));

        tf2 = new JPasswordField();  
        tf2.setBounds(50,260, 200,30); 
        tf2.setFont(new Font("Stylus BT", Font.BOLD, 16));
        tf2.setBackground(new Color(70, 150,150)); 

        b1 = new JButton("Sign In");
        b1.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b1.setBackground(new Color(70, 150,150));
        b1.setForeground(Color.black);
        b1.setBounds(50, 320, 200, 30);
        b1.addActionListener(this);
        b1.setFocusable(false);

        b2 = new JButton("Exit");
        b2.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b2.setBackground(new Color(70, 150,150));
        b2.setForeground(Color.black);
        b2.setBounds(50, 370, 200, 30);
        b2.addActionListener(this);
        b2.setFocusable(false);

        b3 = new JButton("Back");
        b3.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b3.setBackground(new Color(70, 150,150));
        b3.setForeground(Color.black);
        b3.setBounds(50, 420, 200, 30);
        b3.addActionListener(this);
        b3.setFocusable(false);
        
        b4 = new JButton("Admin");
        b4.setFont(new Font("Stylus BT", Font.BOLD, 16));
        b4.setBackground(new Color(255, 255,255));
        b4.setForeground(Color.black);
        b4.setBounds(50, 490, 200, 30);
        b4.addActionListener(this);
        b4.setFocusable(false);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(310, 600));
        panel.setBackground(new Color(23, 56,67)); 
        //panel.add(label);
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(tf1);
        panel.add(tf2);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
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
         
        if(e.getSource()==b1)
		{  
			String user = tf1.getText();
			String pass = tf2.getText();
           
            if(user.equals("dealer") && pass.equals("1"))
			{
				f.setVisible(false);
				new AdminPage(car);
            } 
                
            else if(user.equals("user") && pass.equals("2"))
            {
                f.setVisible(false);
				new UserProfile(car);
            }
            
			else
			{
				showMessageDialog(null, "Invalid Username and password!");
			}
            
        }
        
        if(e.getSource()==b2){   
            f.setVisible(false);
        }
        if(e.getSource()==b3){
            f.setVisible(false);
            new HomePage(car);
        }
        if(e.getSource()==b4){
            f.setVisible(false);
            new AdminLogin(car);
        }
    }  


} 