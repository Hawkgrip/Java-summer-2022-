
import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument.LeafElement;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class AdminPage implements ActionListener{

    static Car [] car=new Car[3];
    JFrame frame;
	JButton button1,button2,button3,button4,select1,select2,select3,previousButton;
	ImageIcon img;
	JLabel label,userLabel1,userLabel2,userLabel3,userLabel4,showMLabel;
	JPanel panel1;
    Font font = new Font("Avenir Next LT Pro", Font.PLAIN, 25);
    Font myFont = new Font("Avenir Next LT Pro", Font.PLAIN, 15);
    Border border= BorderFactory.createEtchedBorder(Color.white, Color.BLACK);
    TitledBorder border2=new TitledBorder("j");
    JTextField deleteTF1, searchTF1, addCarTF1, addCarTF2, addCarTF3, addCarTF4, addCarTF5, addCarTF6, addCarTF7, addCarTF8, removeCarTF1 ;

    public AdminPage(Car [] car){

        this.car=car;

        JLabel imgLabel=new JLabel(new ImageIcon("images/bg2.png"));
		imgLabel.setBounds(0,0,1920,1080);
        imgLabel.setOpaque(false);

        JLabel deleteUserLabel=new JLabel();
        deleteUserLabel.setText("Remove Car");
        deleteUserLabel.setBounds(145,310,200,30);
        deleteUserLabel.setFont(font);
        deleteUserLabel.setForeground(Color.white);
        // deleteUserLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0xFFFFFF)));


         deleteTF1 = new JTextField();
        deleteTF1.setLayout(null);
        deleteTF1.setBounds(145,350, 200, 45);
        deleteTF1.setFont(myFont);
        deleteTF1.setOpaque(false);
        deleteTF1.setForeground(new Color(0xFFFFFF));
        deleteTF1.setBorder(BorderFactory.createTitledBorder(null, "Chasis number", javax.swing.border. TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));


        button1=new JButton("Submit");
		button1.setBounds(355,360,120,30);
		button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBackground(new Color(0x292929));
//
      
        JLabel searchUserLabel=new JLabel();
        searchUserLabel.setText("Search Car");
        searchUserLabel.setBounds(145,410,200,30);
        searchUserLabel.setFont(font);
        searchUserLabel.setForeground(Color.white);

         searchTF1 = new JTextField();
        searchTF1.setLayout(null);
        searchTF1.setBounds(145,450, 200, 45);
        searchTF1.setFont(myFont);
        searchTF1.setOpaque(false);
        searchTF1.setForeground(new Color(0xFFFFFF));
        searchTF1.setBorder(BorderFactory.createTitledBorder(null, "Chasis Number", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        button2=new JButton("Submit");
		button2.setBounds(355,460,120,30);
		button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBackground(new Color(0x292929));
//  
        JLabel addCarLabel=new JLabel();
        addCarLabel.setText("Add Car");
        addCarLabel.setBounds(145,550,200,30);
        addCarLabel.setFont(font);
        addCarLabel.setForeground(Color.white);

         addCarTF1 = new JTextField();
        addCarTF1.setLayout(null);
        addCarTF1.setBounds(145,590, 200, 45);
        addCarTF1.setFont(myFont);
        addCarTF1.setOpaque(false);
        addCarTF1.setForeground(new Color(0xFFFFFF));
        addCarTF1.setBorder(BorderFactory.createTitledBorder(null, "Car Name", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
         addCarTF2 = new JTextField();
        addCarTF2.setLayout(null);
        addCarTF2.setBounds(355,590, 200, 45);
        addCarTF2.setFont(myFont);
        addCarTF2.setOpaque(false);
        addCarTF2.setForeground(new Color(0xFFFFFF));
        addCarTF2.setBorder(BorderFactory.createTitledBorder(null, "Year", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
         addCarTF3 = new JTextField();
        addCarTF3.setLayout(null);
        addCarTF3.setBounds(565,590, 200, 45);
        addCarTF3.setFont(myFont);
        addCarTF3.setOpaque(false);
        addCarTF3.setForeground(new Color(0xFFFFFF));
        addCarTF3.setBorder(BorderFactory.createTitledBorder(null, "Car Model", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
         addCarTF4 = new JTextField();
        addCarTF4.setLayout(null);
        addCarTF4.setBounds(145,640, 200, 45);
        addCarTF4.setFont(myFont);
        addCarTF4.setOpaque(false);
        addCarTF4.setForeground(new Color(0xFFFFFF));
        addCarTF4.setBorder(BorderFactory.createTitledBorder(null, "Genre", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
         addCarTF5 = new JTextField();
        addCarTF5.setLayout(null);
        addCarTF5.setBounds(355,640, 200, 45);
        addCarTF5.setFont(myFont);
        addCarTF5.setOpaque(false);
        addCarTF5.setForeground(new Color(0xFFFFFF));
        addCarTF5.setBorder(BorderFactory.createTitledBorder(null, "Car Registration", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        addCarTF6 = new JTextField();
        addCarTF6.setLayout(null);
        addCarTF6.setBounds(565,640, 200, 45);
        addCarTF6.setFont(myFont);
        addCarTF6.setOpaque(false);
        addCarTF6.setForeground(new Color(0xFFFFFF));
        addCarTF6.setBorder(BorderFactory.createTitledBorder(null, "location", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white)); 

        addCarTF7 = new JTextField();
        addCarTF7.setLayout(null);
        addCarTF7.setBounds(775,590, 200, 45);
        addCarTF7.setFont(myFont);
        addCarTF7.setOpaque(false);
        addCarTF7.setForeground(new Color(0xFFFFFF));
        addCarTF7.setBorder(BorderFactory.createTitledBorder(null, "Milage", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));


         addCarTF8 = new JTextField();
        addCarTF8.setLayout(null);
        addCarTF8.setBounds(775,640, 200, 45);
        addCarTF8.setFont(myFont);
        addCarTF8.setOpaque(false);
        addCarTF8.setForeground(new Color(0xFFFFFF));
        addCarTF8.setBorder(BorderFactory.createTitledBorder(null, "Grade", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
       
        select1=new JButton("<html>Select Picture<br>(4*3)</html>");
        select1.setBounds(260,710,120,120);
        select1.setFocusable(false);
        select1.addActionListener(this);
        select1.setForeground(new Color(0xFFFFFF));
        select1.setBackground(new Color(0x292929));
        select1.setIcon(new ImageIcon("images/icons2.png"));
        select1.setHorizontalTextPosition(JButton.CENTER);
        select1.setVerticalTextPosition(JButton.BOTTOM);
  
        select2=new JButton("<html>Select Picture<br>(5*3)</html>");
        select2.setBounds(390,710,120,120);
        select2.setFocusable(false);
        select2.addActionListener(this);
        select2.setForeground(new Color(0xFFFFFF));
        select2.setBackground(new Color(0x292929));
        select2.setIcon(new ImageIcon("images/icons2.png"));
        select2.setHorizontalTextPosition(JButton.CENTER);
        select2.setVerticalTextPosition(JButton.BOTTOM);
  
  
        select3=new JButton("<html>Select Picture<br>(6*4)</html>");
        select3.setBounds(520,710,120,120);
        select3.setFocusable(false);
        select3.addActionListener(this);
        select3.setForeground(new Color(0xFFFFFF));
        select3.setBackground(new Color(0x292929));
        select3.setIcon(new ImageIcon("images/icons2.png"));
        select3.setHorizontalTextPosition(JButton.CENTER);
        select3.setVerticalTextPosition(JButton.BOTTOM);
  


        button3=new JButton("Submit");
        button3.setBounds(670,750,120,30);
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setForeground(new Color(0xFFFFFF));
        button3.setBackground(new Color(0x292929));
// 
        JLabel removeCarLabel=new JLabel();
        removeCarLabel.setText("Remove Car");
        removeCarLabel.setBounds(145,880,200,30);
        removeCarLabel.setFont(font);
        removeCarLabel.setForeground(Color.white);

         removeCarTF1 = new JTextField();
        removeCarTF1.setLayout(null);
        removeCarTF1.setBounds(145,920, 200, 45);
        removeCarTF1.setFont(myFont);
        removeCarTF1.setOpaque(false);
        removeCarTF1.setForeground(new Color(0xFFFFFF));
        removeCarTF1.setBorder(BorderFactory.createTitledBorder(null, "Car ID", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        button4=new JButton("Submit");
		button4.setBounds(355,930,120,30);
		button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setForeground(new Color(0xFFFFFF));
        button4.setBackground(new Color(0x292929));
//  
  
        previousButton=new JButton();
        previousButton.setBounds(1775,20,80,80);
        previousButton.setFocusable(false);
        previousButton.addActionListener(this);
        previousButton.setIcon(new ImageIcon("images/logOut4.png"));
        previousButton.setForeground(new Color(0xFFFFFF));
        previousButton.setBackground(new Color(0x292929));
        // previousButton.setOpaque(false);

//

        JLabel diaLabel=new JLabel();
        diaLabel.setText("<html><h1>Message Box</h1></html>");
        diaLabel.setBounds(1500,310,200,30);
        diaLabel.setFont(font);
        diaLabel.setForeground(Color.white);
//
        JLabel adminLabel=new JLabel();
        adminLabel.setText("                Dealer");
        adminLabel.setFont(new Font("Times new roman", Font.BOLD, 100));
        adminLabel.setBounds(700,20,300,70);
        adminLabel.setBackground(Color.black);
        adminLabel.setOpaque(true);
        adminLabel.setFont(font);
        adminLabel.setForeground(Color.white);

        userLabel1=new JLabel();
        userLabel1.setBounds(1370,350,400,30);
        userLabel1.setFont(font);
        userLabel1.setForeground(Color.white);

        userLabel2=new JLabel();
        userLabel2.setBounds(1370,390,400,30);
        userLabel2.setFont(font);
        userLabel2.setForeground(Color.white);

        userLabel3=new JLabel();
        userLabel3.setBounds(1370,430,400,30);
        userLabel3.setFont(font);
        userLabel3.setForeground(Color.white);

        userLabel4=new JLabel();
        userLabel4.setBounds(1370,470,400,30);
        userLabel4.setFont(font);
        userLabel4.setForeground(Color.white);

        showMLabel=new JLabel();
        showMLabel.setBounds(1370,620,200,30);
        showMLabel.setFont(font);
        showMLabel.setForeground(Color.white);
//


        panel1=new JPanel();
		panel1.setLayout(null);
        panel1.add(adminLabel);
        panel1.add(deleteUserLabel);
        panel1.add(deleteTF1);
		panel1.add(button1);
        panel1.add(searchUserLabel);
        panel1.add(searchTF1);
        panel1.add(button2);
        panel1.add(addCarLabel);
        panel1.add(addCarTF1);
        panel1.add(addCarTF2);
        panel1.add(addCarTF3);
        panel1.add(addCarTF4);
        panel1.add(addCarTF5);
        panel1.add(addCarTF6);
        panel1.add(addCarTF7);
        panel1.add(addCarTF8);
        panel1.add(select1);
        panel1.add(select2);
        panel1.add(select3);
        panel1.add(button3);
        panel1.add(removeCarLabel);
        panel1.add(removeCarTF1);
        panel1.add(button4);
        panel1.add(previousButton);
        panel1.add(diaLabel);
        panel1.add(userLabel1);
        panel1.add(userLabel2);
        panel1.add(userLabel3);
        panel1.add(userLabel4);
        panel1.add(showMLabel);
        panel1.add(imgLabel);
        panel1.setOpaque(false);

        frame=new JFrame();
        frame.setTitle("Admin Page");
		frame.setSize(1920,1080);
        frame.add(panel1);

        frame.setMinimumSize(new Dimension(1169,640));
            Toolkit tk=Toolkit.getDefaultToolkit();
            int x=(int) tk.getScreenSize().getWidth();
            int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-1920/2, y/2-1080/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xe8ab00));
        frame.setIconImage(new ImageIcon("images/admin1.png").getImage());

        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String i="";


        if(e.getSource()==button1){
            String d=deleteTF1.getText();
           if(true){
            userLabel1.setText("");
            userLabel2.setText("");
            userLabel3.setText("");
            userLabel4.setText("");
            showMLabel.setText("Car removed!");
           }else{
            userLabel1.setText("");
            userLabel2.setText("");
            userLabel3.setText("");
            userLabel4.setText("");
            showMLabel.setText("No such car exist");}
        }
        if(e.getSource()==button2){
            String n=searchTF1.getText();
            if(false){

                showMLabel.setText("");
            }else{
                userLabel1.setText("");
                userLabel2.setText("");
                userLabel3.setText("");
                userLabel4.setText("");
                showMLabel.setText("No such car exist");}
        }
        if(e.getSource()==button3){
            String a=addCarTF1.getText();
            String b=addCarTF2.getText();
            String c=addCarTF3.getText();
            String d=addCarTF4.getText();
            String e1=addCarTF5.getText();
            String f=addCarTF6.getText();
            String g=addCarTF7.getText();
            String h=addCarTF8.getText();
            String j="";
            ImageIcon images = new ImageIcon(i);
            Car cc1 = new Car(a, b, c, d, e1,f, g, h, i, 3245.6, images);
            if(AdminPage.insertCar(cc1)){
                userLabel1.setText("");
                userLabel2.setText("");
                userLabel3.setText("");
                userLabel4.setText("");
                showMLabel.setText("Car Added Succesfully!");
            }else{
                userLabel1.setText("");
                userLabel2.setText("");
                userLabel3.setText("");
                userLabel4.setText("");
                showMLabel.setText("Couldn't add the Car!");}

        }
        if(e.getSource()==button4){
            String s= removeCarTF1.getText();
            if(removeCar(s)){
                userLabel1.setText("");
                userLabel2.setText("");
                userLabel3.setText("");
                userLabel4.setText("");
                showMLabel.setText("Car Deleted Succesfully!");
            }else{
                userLabel1.setText("");
                userLabel2.setText("");
                userLabel3.setText("");
                userLabel4.setText("");
                showMLabel.setText("Couldn't find the Car!");}

        }
        if(e.getSource()==previousButton){
            frame.setVisible(false);
            new DealerCarProfile1(car);
        }



        if(e.getSource()==select1)
        {
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showOpenDialog(null);


            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file1=new File(fileChooser.getSelectedFile().getAbsolutePath());
                i=file1.getAbsolutePath();
            }
        } 
         
       
    }


    public static boolean insertCar(Car Car){
        for(int i=0; i<car.length; i++){
            if(car[i] == null) {
                car[i] = Car;
                return true;
            }
        }    
        return false;
    }

    public boolean removeCar(String id){
        for(int i=0; i<car.length; i++){
            if(id.equalsIgnoreCase(car[i].getCarName())){
                for(int j=i; j<car.length-1; j++) {
                    car[j] = car[j+1];
                }
            return true;
            }
        }  
        return false;
    }
    public Car searchCar(String CarName){
        for(int i=0; i<car.length; i++){
            if(car[i] != null){
                if(car[i].getCarName().equals(CarName)){
                    System.out.println("Car Found!");
                    return car[i];
                }
            }
        }
        return null;


    }
    public static void main(String[] args) {  
        Car [] c=new Car[]{new Car("Ferrari", "F20","1980","1982","4","210,000","Sports","3.75","London, Uk",32000.0, new ImageIcon("images/F20.jpg")),
        new Car("BMW", "320i","1990","1995","5","150,000","Sports","4","Manchester, Uk",40000.0, new ImageIcon("images/320i.jpg")),
        new Car("Mercedes", "Kompressor","1970","1976","5","295,000","Economic","3","Oldham, Uk",25000.0, new ImageIcon("images/kompressor.jpg"))};
  
        new AdminPage(c);
   } 

}