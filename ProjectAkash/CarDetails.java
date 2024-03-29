import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*; 
import java.awt.*; 

public class CarDetails implements ActionListener{  
	Car car;
    Car [] carlist= new Car[3];
    JFrame f;

    JLabel label1;	
    JLabel label2;	
    JLabel label3;	
    JLabel label4;	
    JLabel label5;	
    JLabel label6;	
    JLabel label7;	
    JLabel label8;	
    JLabel label9;	
    JLabel label10;	
	
    JButton buttonp;  
    JButton buttone;
    JButton buttonM;  
    JButton buttona;  
    JButton buttonb;  

    JPanel Detailspanel;//Car Details
    JPanel Basepanel;//Base Panel
    JPanel Picturepanel;
    
	
    CarDetails (Car c, Car[] carList){  
        this.car=c;
        this.carlist=carList;

            //------------------Car-Details--------------------\\
        JLabel label1= new JLabel(car.getCarName()+"-"+car.getCarModel());
        label1.setBounds(400,25, 400,50);
        label1.setFont(new Font("Stylus BT", Font.BOLD, 55));
        label1.setForeground(Color.white);

        JLabel label2= new JLabel("Model : "+car.getCarModel());
        label2.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label2.setBounds(25,20, 300,30);
        label2.setForeground(Color.white);

        JLabel label3= new JLabel("Year : "+car.getCarYear());
        label3.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label3.setBounds(25,50, 300,30);
        label3.setForeground(Color.white);

        JLabel label4= new JLabel("Registration: "+car.getCarRegistration());
        label4.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label4.setBounds(25,80, 300,30);
        label4.setForeground(Color.white);

        JLabel label5= new JLabel("Milage: "+car.getCarMilage());
        label5.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label5.setBounds(25,110, 300,32);
        label5.setForeground(Color.white);

        JLabel label6= new JLabel("Paint and Body Grade: "+car.getCarColorGrade());
        label6.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label6.setBounds(25,160, 300,30);
        label6.setForeground(Color.white);

        JLabel label7= new JLabel("Auction Grade: A");
        label7.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label7.setBounds(25,190, 300,30);
        label7.setForeground(Color.white);

        JLabel label8= new JLabel("Location: "+car.getCarLocation());
        label8.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label8.setBounds(25,220, 500,30);
        label8.setForeground(Color.white);

        JLabel label10= new JLabel("Price: $"+car.getCarPrice());
        label10.setFont(new Font("Stylus BT", Font.BOLD, 25));
        label10.setBounds(25,280, 500,30);
        label10.setForeground(Color.red);
       ///--------------------------\\\

       
        JLabel label9= new JLabel("P");
        label9.setFont(new Font("Stylus BT", Font.ITALIC, 5));
        label9.setBounds(2,2, 20,30);
        label9.setForeground(Color.blue);

        //-----------------------------------\\

        f = new JFrame();

        Basepanel = new JPanel();
        Detailspanel = new JPanel();
        Picturepanel = new JPanel();
    

        //--------------------Button----------------------\\


        buttonp = new JButton("Previous");
        buttonp.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonp.setBackground(new Color(70, 150,150));
        buttonp.setBounds(50, 650, 200, 30);
        buttonp.setForeground(Color.white);
        buttonp.addActionListener(this);
        buttonp.setFocusable(false);

        buttone = new JButton("Exit");
        buttone.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttone.setBackground(new Color(70, 150,150));
        buttone.setForeground(Color.white);
        buttone.setBounds(850, 650, 200, 30);
        buttone.addActionListener(this);
        buttone.setFocusable(false);

        buttonM = new JButton("More");
        buttonM.setForeground(Color.black);
        buttonM.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonM.setBackground(new Color(70, 150,150));
        buttonM.setForeground(Color.white);
        buttonM.setBounds(470, 650, 200, 30);
        buttonM.addActionListener(this);
        buttonM.setFocusable(false);

      
        buttona = new JButton("Purchase");
        buttona.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttona.setBackground(new Color(23, 56,67));
        buttona.setForeground(Color.white);
        buttona.setBounds(50, 610, 200, 30);
        buttona.addActionListener(this);
        buttona.setFocusable(false);

        buttonb = new JButton("Contact");
        buttonb.setFont(new Font("Stylus BT", Font.BOLD, 16));
        buttonb.setBackground(new Color(23, 56,67));
        buttonb.setForeground(Color.white);
        buttonb.setBounds(850, 610, 200, 30);
        buttonb.addActionListener(this);
        buttonb.setFocusable(false);


        //----------------------Panel------------------------\\

        Detailspanel = new JPanel();
        Detailspanel.setBounds(200,100,800,320);
        Detailspanel.setBackground(new Color(155, 198, 227));
        //Car Details\\
        Detailspanel.add(label2);
        Detailspanel.add(label3);
        Detailspanel.add(label4);
        Detailspanel.add(label5);
        Detailspanel.add(label6);
        Detailspanel.add(label7);
        Detailspanel.add(label8);
        Detailspanel.add(label9);
        Detailspanel.add(label10);
        Detailspanel.setLayout(null);


        Picturepanel = new JPanel();
        Picturepanel.setBounds(80,100,100,100);
        Picturepanel.setBackground(new Color(255, 255, 255)); 
       // Picturepanel.add(label10);
        Picturepanel.setLayout(null);


        Basepanel = new JPanel();
        
        Basepanel.setPreferredSize(new Dimension(1100, 700));
        Basepanel.setBackground(new Color(23, 56,67));
        Basepanel.add(Detailspanel);   
        Basepanel.add(Picturepanel);   
        Basepanel.add(label1);
        Basepanel.add(buttonp);
        Basepanel.add(buttone);
        Basepanel.add(buttonM);
        Basepanel.add(buttona);
        Basepanel.add(buttonb);
        Basepanel.setLayout(null);

        //------------------------------------------------\\

        f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(Basepanel, new GridBagConstraints());
        f.setSize(new Dimension(1600, 850));
        f.getContentPane().setBackground(new Color(155, 198, 227));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(70, 150,150));
        f.setVisible(true);  
        
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==buttonp)
		{  
			f.setVisible(false);
		    new DealerCarProfile1(carlist);
        }
        if(e.getSource()==buttone){   
            f.dispose();
        }
		if(e.getSource()==buttonM){
			f.setVisible(false);
            new HomePage(carlist);
		}

        if(e.getSource()==buttonb){
			f.setVisible(false);
           new DealerProfile1(carlist);
		}
    }  
	public static void main(String[] args) {
       Car[] c= new Car[]{new Car("Mercedes", "Kompressor","1970","Economic","1976","5","200,000","3","Oldham, Uk",25000.0, new ImageIcon(""))};

	}
} 