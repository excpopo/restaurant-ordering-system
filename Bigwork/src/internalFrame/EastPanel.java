package internalFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class EastPanel extends JPanel{
	JPanel topTital;//顶部标题
	JPanel order_list;//已选订单
	JPanel confirm;//确认面板设置为边缘布局
	JLabel count;//显示总价
	JButton confirm_btn;//点击确认点单
	JButton account_btn;//结账
	JButton delAll;//取消全部
	JTextField jpnum;//人数
	
	JComboBox<String> combobox;//选座
	double countPrice;


	EastPanel(){
		setLayout(new BorderLayout());	
		topTital=new JPanel();
		topTital.setLayout(new BorderLayout());
		
		JPanel j1=new JPanel();//选择桌号面板
		
		String item[]= {"1号桌","2号桌","3号桌","4号桌","5号桌","6号桌","7号桌","8号桌"};
		
		
		combobox=new JComboBox<String>(item);
		combobox.setFont(new Font("微软雅黑", Font.BOLD, 15));
		combobox.setForeground(new Color(243, 88, 27));
		combobox.setPreferredSize(new Dimension(100,20));//强行设置面板大小
		combobox.setEditable(true);
		 
		
		JLabel pnum=new JLabel("人数");//用餐人数
		pnum.setFont(new Font("微软雅黑", Font.BOLD, 20));
		pnum.setForeground(new Color(243, 88, 27));
		pnum.setBounds(60,70,100,20);
		
		jpnum=new JTextField(2);//宽度2字符
		jpnum.setFont(new Font("微软雅黑", Font.BOLD, 14));
		jpnum.setText("0");

		
		delAll=new JButton("取消");
		delAll.setFont(new Font("微软雅黑", Font.BOLD, 15));	
		delAll.setForeground(Color.white);
		delAll.setBackground(new Color(255, 0, 0));
		delAll.setBorderPainted(false);//取消边框
		
		j1.add(combobox);
		j1.add(pnum);
		j1.add(jpnum);
		j1.add(delAll);
		
		
		JLabel j2=new JLabel("             已 点 菜 品         ");
		j2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		j2.setBounds(60,70,100,20);
		topTital.setBackground(Color.white);
		topTital.add(j1,BorderLayout.NORTH);
		topTital.add(j2,BorderLayout.SOUTH);
		
		order_list=new JPanel();
		order_list.setLayout(new FlowLayout());	
		order_list.setPreferredSize(new Dimension(130,1000));
		
	

		JScrollPane js=new JScrollPane(order_list);//添加滚动条
		js.setBorder(BorderFactory.createEmptyBorder());//去除JscrollPanel的边框
		
		confirm=new JPanel();
		confirm.setLayout(new BorderLayout());
		count=new JLabel("            "+"合 计   :  "+countPrice);
		count.setFont(new Font("微软雅黑", Font.BOLD, 22));
		
		account_btn=new JButton("         结账           ");
		account_btn.setFont(new Font("微软雅黑", Font.BOLD, 22));	
		account_btn.setForeground(Color.white);
		account_btn.setBackground(new Color(255, 0, 0));
		account_btn.setBorderPainted(false);//取消边框
		
		
		confirm_btn=new JButton("         确 认 订 单           ");
		confirm_btn.setFont(new Font("微软雅黑", Font.BOLD, 22));	
		confirm_btn.setForeground(Color.white);
		confirm_btn.setBackground(new Color(255, 202, 24));
		confirm_btn.setBorderPainted(false);//取消边框
		
		confirm.add(count,BorderLayout.NORTH);
		confirm.add(confirm_btn,BorderLayout.SOUTH);
		confirm.add(account_btn,BorderLayout.CENTER);
		

		
		add(topTital,BorderLayout.NORTH);
		add(confirm,BorderLayout.SOUTH);
		add(js,BorderLayout.CENTER);
	}
	public void setCountPrice(double countPrice) {
		this.countPrice=countPrice;
		count.setText("            "+"合 计   :  "+countPrice);
	}


}



