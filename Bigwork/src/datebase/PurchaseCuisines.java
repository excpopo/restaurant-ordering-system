package datebase;

import java.io.*;

import java.text.*;
import java.util.*;


public class PurchaseCuisines extends ArrayList<HasCuisine> {
//顾客已购买菜品
		public boolean addCuisine(HasCuisine hasc) {
			if(add(hasc))  
				return true ;
			else
				return false;
		}
		public void printFile(int peoples,double amount)  
		{
			Date date=new Date();
			SimpleDateFormat time=new SimpleDateFormat("yyMMddHHmmss");
			SimpleDateFormat time1=new SimpleDateFormat("yy年MM月dd日HH：mm：ss");
			try {
			FileWriter out = new FileWriter("F:/"+ time.format(date)+".txt");//以下单时间为文件名
					BufferedWriter buf=new BufferedWriter(out);
					buf.write("茶位费"+" "+"6.0"+"x"+peoples+" "+peoples*6.0);
					buf.newLine();
					for(int i=0;i<size();i++)
					{
						buf.write(get(i).getname()+" "+get(i).getprice()+"x"+get(i).getnum()+" "+get(i).getAmountPrice());
						buf.newLine();
					}
					double finAmount=amount+peoples*6.0;
					buf.write("总计："+finAmount);
					buf.newLine();
					buf.write(time1.format(date));
					buf.close();
					out.close();
					
				}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}

}
