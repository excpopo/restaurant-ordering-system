package internalFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Login_interface extends JFrame {
	Login_interface(){
		setTitle("登陆");
		setBounds(450, 300, 580, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setBackground(new Color(255, 202, 24));//背景颜色
		c.setLayout(null);//设置绝对布局
		
		JLabel topImg=new JLabel();//添加图片标签
		
		Icon icon=new ImageIcon("src/image/login.png/");
		topImg.setIcon(icon);
		topImg.setBounds(0,-95,580,250);
		
		JLabel text=new JLabel("账号 ");
		text.setFont(new Font("宋体", Font.BOLD, 16));//设置账号标签字体
		text.setBounds(135, 85, 80, 20);
		
		
		JTextField inText=new JTextField(20);
		inText.setFont(new Font("MS Gothic", Font.BOLD, 16));
		inText.setText("admin");
		inText.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));//设置红色边框
		inText.setBounds(180, 85, 200, 20);


		
		JLabel psw=new JLabel("密码  ");
		psw.setFont(new Font("宋体", Font.BOLD, 16));//设置密码标签字体
		psw.setBounds(135, 115, 80, 20);
		
		JPasswordField inPsw=new JPasswordField();
		inPsw.setColumns(20);
		inPsw.setFont(new Font("MS Gothic", Font.BOLD, 16));
		inPsw.setEchoChar('*');//设置密码显示字符
		inPsw.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));//设置红色边框		
		inPsw.setBounds(180, 115, 200, 20);
		
		JButton submit=new JButton("登陆");
		submit.setFont(new Font("宋体", Font.BOLD, 20));//设置密码标签字体
		submit.setBorderPainted(false);
		submit.setBackground(new Color(255, 202, 24));
		submit.setBounds(230, 160, 80, 20);
		c.add(topImg);
		c.add(text);
		c.add(inText);
		c.add(psw);
		c.add(inPsw);
		c.add(submit);
		setResizable(false);
		setVisible(true);
	

	
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(inPsw.getText().equals("admin"))
				{
					setVisible(false);
					new Operator_interface();
				}
				else 
					inPsw.setText("");//清空密码框数据
					inPsw.requestFocus();//使光标移至密码框开头
			}
		});
	}
	public static void main(String[] args) {
		new Login_interface();
	}
}
