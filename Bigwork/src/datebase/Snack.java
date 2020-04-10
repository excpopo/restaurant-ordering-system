package datebase;

public class Snack extends Cuisine{
	String attribute="snack";
	Snack( String name,int num,String icon,double price,String ID){
		this.seticon(icon);
		this.setID(ID);
		this.setname(name);
		this.setnum(num);
		this.setprice(price);
	}

}
