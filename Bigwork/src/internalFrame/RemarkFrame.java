package internalFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class RemarkFrame extends JFrame {
	
	RemarkFrame(){
		setBounds(500, 300, 300, 200);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("��Ʒ��ע");
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JTextArea jt=new JTextArea(6,19);
		JButton jb=new JButton("ȷ��");
		jt.setFont(new Font("΢���ź�", Font.BOLD, 15)); 
		
		jb.setFont(new Font("΢���ź�", Font.BOLD, 17));
		jb.setBorderPainted(false);
		jt.setLineWrap(true);//�����Զ�����
		
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
