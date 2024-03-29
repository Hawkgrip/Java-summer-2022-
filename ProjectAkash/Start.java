import javax.swing.ImageIcon;

public class Start{
public static void main(String[] args) {  
      Car [] c=new Car[]{new Car("Ferrari", "F20","1980","1982","4","210,000","Sports","3.75","London, Uk",32000.0, new ImageIcon("images/F20.jpg")),
      new Car("BMW", "320i","1990","1995","5","150,000","Sports","4","Manchester, Uk",40000.0, new ImageIcon("images/320i.jpg")),
      new Car("Mercedes", "Kompressor","1970","1976","5","295,000","Economic","3","Oldham, Uk",25000.0, new ImageIcon("images/kompressor.jpg"))};

      new HomePage(c);
 } 
}