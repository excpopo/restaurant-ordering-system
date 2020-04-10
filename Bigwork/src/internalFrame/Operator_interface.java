package internalFrame;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

import datebase.Cuisine;
import datebase.HasCuisine;
import datebase.PurchaseCuisines;
import datebase.Warehouse;




 class Operator_interface extends JFrame{
	 	Warehouse wh=new Warehouse();
	 	CenterPanel cp=new CenterPanel(wh);
	 	TopPanel tp=new TopPanel();
	 	WestPanel wp=new WestPanel();
	 	EastPanel ep=new EastPanel();
	 	List_itemPanel[] order_form= new List_itemPanel[30];//点单列表
	 	double countPrice=0.0;//总价
	 	PurchaseCuisines pcc;//已购买菜品集合
		
	Operator_interface(){
		setBounds(180, 10, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("点餐");
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());//边缘布局
		
		


		for(int i=0;i<order_form.length;i++) {//添加菜单菜品
			
			order_form[i]=new List_itemPanel("无",0.0,"01"); 
			order_form[i].addNum.addActionListener(new ChangeNumberActionListener(i));
			order_form[i].delNum.addActionListener(new ChangeNumberActionListener(i));
			order_form[i].subNum.addActionListener(new ChangeNumberActionListener(i));
			
			ep.order_list.add(order_form[i]);//将定义完毕的单个已点菜品框加入到
			
		}
		ep.delAll.addActionListener(new DelActionListener(0));//传入0时仅清除全部已选菜品
		
		

		
		Iterator<String> iter=wh.keySet().iterator();//获取菜系名
		String []s=new String[10];
		for(int i=0;i<wh.size();i++)	
		{	
			s[i]=(String)iter.next();
		}

		
		Iterator<String> iter0=wh.get(s[0]).keySet().iterator();//获取相关菜系的菜品id
		Iterator<String> iter1=wh.get(s[1]).keySet().iterator();
		Iterator<String> iter2=wh.get(s[2]).keySet().iterator();
		Iterator<String> iter3=wh.get(s[3]).keySet().iterator();
		Iterator<String> iter4=wh.get(s[4]).keySet().iterator();
		
		Cuisine cuisine;
		for(int i=0;i<cp.j0.size;i++)
		{	
			String j=(String)iter0.next();//对每个菜系页面的具体菜品的展示按钮添加监听
			cuisine=wh.get(s[0]).get(j);
			cp.j0.mip[i].imgBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
			cp.j0.mip[i].textBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for(int i=0;i<cp.j1.size;i++)
		{
			String j=(String)iter1.next();
			cuisine=wh.get(s[1]).get(j);
			cp.j1.mip[i].imgBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
			cp.j1.mip[i].textBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for(int i=0;i<cp.j2.size;i++)
		{
			String j=(String)iter2.next();
			cuisine=wh.get(s[2]).get(j);
			cp.j2.mip[i].textBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
			cp.j2.mip[i].imgBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for(int i=0;i<cp.j3.size;i++)
		{
			String j=(String)iter3.next();
			cuisine=wh.get(s[3]).get(j);
			cp.j3.mip[i].imgBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
			cp.j3.mip[i].textBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));

		}
		for(int i=0;i<cp.j4.size;i++)
		{
			String j=(String)iter4.next();
			cuisine=wh.get(s[4]).get(j);
			cp.j4.mip[i].imgBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
			cp.j4.mip[i].textBtn.addActionListener(new ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));

		}
		for(int i=0;i<wp.getComponentCount();i++)//对左栏的按钮添加动作监听
		{
			wp.btns[i].addActionListener(new MyTurnPageActionListener(cp.card,cp));
		}
		ep.account_btn.addActionListener(new DelActionListener(1));
		
	JScrollPane jsCP=new JScrollPane(cp);
	jsCP.setBorder(BorderFactory.createEmptyBorder());//去除JscrollPanel的边框
		c.add(jsCP,BorderLayout.CENTER);
		c.add(tp,BorderLayout.NORTH);
		c.add(wp,BorderLayout.WEST);
		c.add(ep,BorderLayout.EAST);
		

		setVisible(true);
	}
	class ImgAction implements ActionListener{
		//点击图片使下单栏响应
		String name;
		double price;
		String id;
		ImgAction(String name,double price,String id){
			this.name=name;
			this.price=price;
			this.id=id;
		}

		public void actionPerformed(ActionEvent e) {
			int i;
			for(i=0;;i++)
			{
				if(order_form[i].isVisible()==false)

					break;
			}			
			order_form[i].setVisible(true);	
			order_form[i].setName(name);
			order_form[i].setPrice(price);
			order_form[i].setID(id);
			order_form[i].setNum(1);
			countPrice+=order_form[i].getAmount();//动态变换		
			ep.setCountPrice(countPrice);
		}
	}
	class ChangeNumberActionListener implements ActionListener{
//对以点菜品的单独面板上的增删改
		int i;//所改面板编号
		
		ChangeNumberActionListener(int i){
			this.i=i;
		}
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			
			if(btn.getText().equals("+1"))
			{
				order_form[i].num++;
				String Snum=Integer.toString(order_form[i].num);
				order_form[i].jnum.setText(Snum);
				countPrice+=order_form[i].price;
			}
			if(btn.getText().equals("-1"))
			{
				order_form[i].num--;
				if(order_form[i].num<1)
					order_form[i].num=1;//设置最低数量为1
				else//若菜品数量在合理范围内时
				{
					String Snum=Integer.toString(order_form[i].num);
					order_form[i].jnum.setText(Snum);//设置面板数量
					countPrice-=order_form[i].price;
				}
			}
			if(btn.getText().equals("取 消"))
			{
				order_form[i].setNum(1);//点击取消时使得数字恢复1
				order_form[i].setName("无");	
				order_form[i].setPrice(0.0);
				order_form[i].id="000";
				countPrice-=order_form[i].amount;
				order_form[i].amount=0.0;//点击取消时使该菜品的总价格清零
				/* 标记 */order_form[i].setVisible(false);
			}		
			ep.setCountPrice(countPrice);//最终菜单价格
		}		
	}
	class DelActionListener implements ActionListener{
//取消所有点单,当传入参数为1时      结账
		int i;
		DelActionListener(int i){
			this.i=i;
			pcc=new PurchaseCuisines();
		}
		public void actionPerformed(ActionEvent e) {
			
	
//			countPrice=0.0;
			if(i==1)
			{
					int j;
					for(j=0;j<order_form.length;j++)
					{
						if(order_form[j].isVisible()==false)
							break;
						pcc.add(new HasCuisine(order_form[j].name, order_form[j].num, order_form[j].price));
					}
					JDialog result =new JDialog();
					result.setBounds(600, 400, 350, 100);
					result.setLayout(new FlowLayout(1));
					JLabel k=new JLabel();
					k.setFont(new Font("微软雅黑", Font.BOLD, 20));
					result.add(k);
					result.setVisible(true);	
					
					char a=ep.jpnum.getText().charAt(0);
					try 
					{
					if(j==0||Integer.valueOf(ep.jpnum.getText())==0||Character.isDigit(a)==false)//当未点餐，人数未填写和填写异常时抛出异常
						{	
							throw new Exception();
						}
					else 
						{
							k.setText("打单成功！");
							pcc.printFile(Integer.valueOf(ep.jpnum.getText()),countPrice);
							for(int i=0;i<order_form.length;i++) 
							{
								order_form[i].setVisible(false);
								order_form[i].id="000";
								order_form[i].setPrice(0.0);
								order_form[i].setName("无");
								order_form[i].setNum(1);
							}
							ep.setCountPrice(0.0);
							ep.jpnum.setText("0");
						}
					}
					catch(Exception r)
						{
							k.setText("您尚未点单,"+'\n'+"或用餐人数填写异常！");
						}
			}
			else {
				for(int i=0;i<order_form.length;i++) 
				{
					order_form[i].setVisible(false);
					order_form[i].id="000";
					order_form[i].setPrice(0.0);
					order_form[i].setName("无");
					order_form[i].setNum(1);
				}
				ep.setCountPrice(0.0);
			
			}
				
			}
			}
				
	
	
	
	class MyTurnPageActionListener implements ActionListener{

		CardLayout card;
		JPanel jp;
		MyTurnPageActionListener(CardLayout card,JPanel jp){
			this.card=card;
			this.jp=jp;
			
		}
		public void actionPerformed(ActionEvent e) {
			JButton jb=(JButton)e.getSource();
			if(jb.getText().equals("   锅 底 类   "))
				card.show(jp, "a0");
			if(jb.getText().equals("   小 吃 类   "))
				card.show(jp, "a1");
			if(jb.getText().equals("   荤 菜 类   "))
				card.show(jp, "a2");
			if(jb.getText().equals("   素 菜 类   "))
				card.show(jp, "a3");
			if(jb.getText().equals("   酒 水 类   "))
				card.show(jp, "a4");
		}
		
		
	}
	
	public static void main(String[] args) {
		Operator_interface a=new Operator_interface();
		a.ep.confirm_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JDialog result =new JDialog(a,"下单反馈",true);
				result.setBounds(600, 400, 200, 100);
				result.setLayout(new FlowLayout(1));
				JLabel j=new JLabel("下单成功!");
				j.setFont(new Font("微软雅黑", Font.BOLD, 20));
				result.add(j);
				result.setVisible(true);
			}
		});


	}
	
}
 
 
 
 
 
 
 
 
 
 
 
 
 

 
