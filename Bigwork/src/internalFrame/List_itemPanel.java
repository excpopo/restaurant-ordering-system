package internalFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class List_itemPanel extends JPanel{
	JLabel jname;
	JLabel jprice;
	JTextField jnum;
	String id;
	String name;
	double price;
	double amount=0.0;//单独一道餐的数量和价格的乘积
	JButton addNum=new JButton("+1"),
			subNum=new JButton("-1"),
			delNum=new JButton("取 消"),
			remark=new JButton("备 注  ");
	int num=1;//默认初始菜数量为1
	
	List_itemPanel(String name,double price,String id){
		this.id=id;
		this.name=name;
		this.price=price;
		JPanel item_name=new JPanel();//内层菜品名称
		JPanel item_operation=new JPanel();//内层操作栏

		setLayout(new BorderLayout());

		
		item_name.setLayout(new BorderLayout());
		jname=new JLabel("无",JLabel.CENTER);

		
		jname.setText("   "+name);
		jname.setFont(new Font("微软雅黑", Font.BOLD, 14));
		item_name.add(jname,BorderLayout.WEST);
		item_name.setBackground(Color.white);
		
		item_operation.setLayout(new FlowLayout());
		item_operation.setBackground(Color.white);

		
		addNum.setFont(new Font("微软雅黑", Font.BOLD, 12));
		addNum.setBorderPainted(false);
		addNum.setBackground(new Color(255, 202, 24));

		
		subNum.setFont(new Font("微软雅黑", Font.BOLD, 12));
		subNum.setBorderPainted(false);
		subNum.setBackground(new Color(255, 202, 24));
		
		delNum.setFont(new Font("微软雅黑", Font.BOLD, 10));
		delNum.setBorderPainted(false);
		delNum.setForeground(new Color(226, 32, 24));
		delNum.setBackground( Color.white);
//		delNum.addActionListener(new DelAction());

		
		remark.setFont(new Font("微软雅黑", Font.BOLD, 10));
		remark.setBorderPainted(false);
		remark.setForeground(new Color(201, 201, 201));
		remark.setBackground( Color.white);
		remark.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new RemarkFrame();
			}
		});
		String Sprice=Double.toString(price);//将double强制类型转换为String
		String Snum=Integer.toString(num);//将int强制类型转换为String
		
		jprice=new JLabel("¥ "+Sprice+"     ");
		jprice.setFont(new Font("微软雅黑", Font.BOLD, 14));
		jnum=new JTextField(Snum,2);//宽度2字符
		jnum.setFont(new Font("微软雅黑", Font.BOLD, 14));
		
		/* 标记 */		setVisible(false);//设置外层面板不可见
		
		item_operation.add(jprice);
		item_operation.add(jnum);
		item_operation.add(addNum);
		item_operation.add(subNum);
		item_operation.add(delNum);
		item_name.add(remark,BorderLayout.EAST);
		
		add(item_name,BorderLayout.NORTH);
		add(item_operation,BorderLayout.CENTER);
	}

public void setID(String id) {
	this.id=id;
}
public void setName(String name) {
	this.name=name;
	jname.setText(name);
}
public void setPrice(double price) {
	this.price=price;
	String Sprice=Double.toString(price);
	jprice.setText(Sprice);
}
public void setNum(int num) {
	this.num=num;
	String Snum=Integer.toString(num);
	jnum.setText(Snum);
}
public String getName()
{
	return this.name;
}
public double  getPrice()
{
	return this.price;
}
public String getID()
{
	return this.id;
}
public double getAmount()
{	
	double amount=getPrice()*Integer.valueOf(jnum.getText());
	this.amount=amount;
	return amount;
}
}

