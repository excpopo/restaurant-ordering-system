package internalFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WestPanel  extends JPanel{
	JButton b1=new  JButton();
	JButton b2=new  JButton();
	JButton b3=new  JButton();
	JButton b4=new  JButton();
	JButton b5=new  JButton();
	JButton  []btns= {b1,b2,b3,b4,b5};
	WestPanel(){
		setLayout(new GridLayout(9,1,5,5));
		setBackground(new Color(244, 244, 244));

		b1.setText("   �� �� ��   ");
		b1.setFont(new Font("΢���ź�", Font.BOLD, 25));
		b1.setBorderPainted(false);//����ʾ�߿�
		b1.setBackground(new Color(238, 238, 238));
		b1.addFocusListener(new MenuBarAction());

		b2.setText("   С �� ��   ");
		b2.setFont(new Font("΢���ź�", Font.BOLD, 25));
		b2.setBorderPainted(false);//����ʾ�߿�
		b2.setBackground(new Color(238, 238, 238));
		b2.addFocusListener(new MenuBarAction());
		
		b3.setText("   �� �� ��   ");
		b3.setFont(new Font("΢���ź�", Font.BOLD, 25));
		b3.setBorderPainted(false);//����ʾ�߿�
		b3.setBackground(new Color(238, 238, 238));
		b3.addFocusListener(new MenuBarAction());
		
		b4.setText("   �� �� ��   ");
		b4.setFont(new Font("΢���ź�", Font.BOLD, 25));
		b4.setBorderPainted(false);//����ʾ�߿�
		b4.setBackground(new Color(238, 238, 238));
		b4.addFocusListener(new MenuBarAction());
		
		b5.setText("   �� ˮ ��   ");
		b5.setFont(new Font("΢���ź�", Font.BOLD, 25));
		b5.setBorderPainted(false);//����ʾ�߿�
		b5.setBackground(new Color(238, 238, 238));
		b5.addFocusListener(new MenuBarAction());
		

		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	
}
}



	

