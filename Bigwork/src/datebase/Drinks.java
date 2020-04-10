package datebase;

public class Drinks extends Cuisine {
	String attribute="drinks";
	Drinks( String name,int num,String icon,double price,String ID){
		this.seticon(icon);
		this.setID(ID);
		this.setname(name);
		this.setnum(num);
		this.setprice(price);
	}

}
