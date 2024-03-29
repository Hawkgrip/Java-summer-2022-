import javax.swing.ImageIcon;

public class Car{
	String CarName;
	String CarModel;
	String CarYear;
	String CarRegistration;
	String CarColorGrade;
	String CarMilage;
	String CarRating;
	String CarLocation;
	String CarGenre;
	Double CarPrice;
	ImageIcon CarImage;
	
	public Car(String CarName, String CarModel,String CarYear, String CarGenre, String CarRegistration, String CarColorGrade, String CarMilage, String CarRating, String CarLocation,Double CarPrice, ImageIcon image){
		this.CarName=CarName;
		this.CarModel=CarModel;
		this.CarYear=CarYear;
		this.CarRegistration=CarRegistration;
		this.CarColorGrade=CarColorGrade;
		this.CarMilage=CarMilage;
		this.CarGenre=CarGenre;
		this.CarRating=CarRating;
		this.CarLocation=CarLocation;
		this.CarPrice=CarPrice;
		CarImage=image;
		
		
		
	}
	
	//-----------Seter and geter-------------\\
	
	public void setCarName(String CarName){
		this.CarName=CarName;
	}
	public void setCarLocation(String CarLocation){
		this.CarLocation=CarLocation;
	}
	public void setCarModel(String CarModel){
		this.CarModel=CarModel;
	}
	public void setCarRegistration(String CarRegistration){
		this.CarRegistration=CarRegistration;
	}
	public void setCarColorGrade(String CarColorGrade){
		this.CarColorGrade=CarColorGrade;
	}
	public void setCarMilage(String CarMilage){
		this.CarMilage=CarMilage;
	}
	public void setCarPrice(Double CarPrice){
		this.CarPrice=CarPrice;
	}
	public void setCarRating(String CarRating){
		this.CarRating=CarRating;
	}
	public void setCarGenre(String CarGenre){
		this.CarGenre=CarGenre;
	}
	public void setCarYear(String CarYear){
		this.CarYear=CarYear;
	}
	
	public String getCarName(){
			return CarName;
	}
	public String getCarLocation(){
			return CarLocation;
	}
	public String getCarModel(){
			return CarModel;
	}
	public String getCarRegistration(){
			return CarRegistration;
	}
	public String getCarColorGrade(){
			return CarColorGrade;
	}
	public String getCarMilage(){
			return CarMilage;
	}
	public Double getCarPrice(){
			return CarPrice;
	}
	public String getCarRating(){
			return CarRating;
	}
	public String getCarGenre(){
			return CarGenre;
	}
	public String getCarYear(){
			return CarYear;
	}
	public ImageIcon getCarImage(){
		return CarImage;
	}
	public static void main (String[] args){
	 Car [] c=new Car[]{new Car("Ferrari", "F20","1980","1982","4","210,000","Sports","3.75","London, Uk",32000.0, new ImageIcon("")),
	  new Car("BMW", "320i","1990","1995","5","150,000","Sports","4","Manchester, Uk",40000.0, new ImageIcon("")),new Car("Mercedes", "Kompressor","1970","1976","5","295,000","Economic","3","Oldham, Uk",25000.0, new ImageIcon(""))};
}
}