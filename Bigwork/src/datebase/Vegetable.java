package datebase;

public class Vegetable extends Cuisine{
	String attribute="vegetable";
	Vegetable( String name,int num,String icon,double price,String ID){
		this.seticon(icon);
		this.setID(ID);
		this.setname(name);
		this.setnum(num);
		this.setprice(price);
	}

	
}
