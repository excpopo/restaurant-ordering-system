package internalFrame;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.*;

import datebase.Cuisine;
import datebase.Warehouse;


public class CenterPanel extends JPanel {
		 
		 AlterPanel j0;
		 AlterPanel j1;
		 AlterPanel j2;
		 AlterPanel j3;
		 AlterPanel j4;
		static CardLayout card=new CardLayout();
		public CenterPanel(Warehouse wh) {
			
			setLayout(card);
			setPreferredSize(new Dimension(250,2000));//强行设置面板大小
			Iterator<String> iter=wh.keySet().iterator();
			String s[]=new String[10];
		for(int i=0;i<wh.size();i++)	
		{	
			s[i]=(String)iter.next();
		}
		j0=new AlterPanel(wh.get(s[0]).size(), wh.get(s[0]));//传入仓库的分类菜品库
		j1=new AlterPanel(wh.get(s[1]).size(), wh.get(s[1]));//传入仓库的分类菜品库
		j2=new AlterPanel(wh.get(s[2]).size(), wh.get(s[2]));//传入仓库的分类菜品库
		j3=new AlterPanel(wh.get(s[3]).size(), wh.get(s[3]));//传入仓库的分类菜品库
		j4=new AlterPanel(wh.get(s[4]).size(), wh.get(s[4]));//传入仓库的分类菜品库
		add(j0,"a"+0);//添加组件并为组件命名
		add(j1,"a"+1);//添加组件并为组件命名
		add(j2,"a"+2);//添加组件并为组件命名
		add(j3,"a"+3);//添加组件并为组件命名
		add(j4,"a"+4);//添加组件并为组件命名
			
}
		}		

		

		
		

