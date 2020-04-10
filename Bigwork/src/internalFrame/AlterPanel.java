package internalFrame;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import datebase.*;

public class AlterPanel extends JPanel {
	int size=0;
	Menu_itemPanel []mip=new Menu_itemPanel[30];
	
	AlterPanel(int n,HashMap<String, Cuisine> Menu)//n为传入菜品数
	{	
		this.size=n;
		setLayout(new FlowLayout(0));//左对齐
		setBackground(Color.white);
		Iterator<String> iter=Menu.keySet().iterator();//以菜品的id作为key，遍历map中所有的key
		setPreferredSize(new Dimension(250,2000));//强行设置面板大小
		for(int i=0;i<n;i++)
		{
			String id=(String)iter.next();
			mip[i]=new Menu_itemPanel(id, Menu.get(id).getname(), Menu.get(id).getprice(), Menu.get(id).geticon());
			add(mip[i]);
		}
		
	
	}
}
