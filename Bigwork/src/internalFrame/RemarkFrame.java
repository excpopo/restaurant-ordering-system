package internalFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class RemarkFrame extends JFrame {
	
	RemarkFrame(){
		setBounds(500, 300, 300, 200);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("菜品备注");
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JTextArea jt=new JTextArea(6,19);
		JButton jb=new JButton("确认");
		jt.setFont(new Font("微软雅黑", Font.BOLD, 15)); 
		
		jb.setFont(new Font("微软雅黑", Font.BOLD, 17));
		jb.setBorderPainted(false);
		jt.setLineWrap(true);//设置自动换行
		
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println(jt.getText());
				setVisible(false);
			}
		});
		c.add(jt);
		c.add(jb);
		setVisible(true);
	}

}
