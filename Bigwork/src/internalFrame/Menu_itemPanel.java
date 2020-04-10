package internalFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu_itemPanel extends JPanel {
	JButton imgBtn=new JButton();
	JButton textBtn=new JButton();
	Menu_itemPanel(String id,String name,double price,String address){
		setLayout(new BorderLayout());
		
		
		Icon icon =new ImageIcon(address);
		imgBtn.setIcon(icon);
		imgBtn.setBorderPainted(false);//去边框
		imgBtn.setBackground(Color.white);
		
		textBtn.setText(id+"    "+name+"    "+"  ¥"+price);
		textBtn.setFont(new Font("微软雅黑", Font.BOLD, 14));//设置字体
		textBtn.setBorderPainted(false);//取消边框
		textBtn.setBackground(Color.white);//设置背景色


		
		
		add(imgBtn,BorderLayout.NORTH);
		add(textBtn,BorderLayout.CENTER);
		
		
	}
}

