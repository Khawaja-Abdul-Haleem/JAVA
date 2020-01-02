package cs_4A;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator_CB implements ActionListener {
	JFrame frame;
	JLabel label1,label2,label3;
	JRadioButton btnplus,btnmul,btnsub,btndiv;
	ButtonGroup gb;
	JTextField result;
	JTextField jf,jf2;
	JButton btn;
	
	public Calculator_CB() {
		
		frame = new JFrame("calculator");
		label1=new JLabel("no1");
		label2=new JLabel("no2");
		label3=new JLabel("result");
		gb =  new ButtonGroup();
		btnplus = new JRadioButton("+",true);
		btnmul = new JRadioButton("*");
		btnsub = new JRadioButton("-");
		btndiv = new JRadioButton("/");
		jf = new JTextField(25);
		jf2 = new JTextField(25);
		result= new JTextField(25);	
		btn = new JButton("CLICK");
		gb.add(btnplus);
		gb.add(btnmul);
		gb.add(btnsub);
		gb.add(btndiv);
		
		frame.setLayout(new FlowLayout());
		frame.add(label1); frame.add(jf);
		frame.add(label2); frame.add(jf2);
		frame.add(btnplus); frame.add(btnmul);frame.add(btnsub);frame.add(btndiv);
		frame.add(label3); frame.add(result);
		frame.add(btn); 
		
		frame.setVisible(true);
		frame.setSize(300,300);
		
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		String str1;
		String str2;
		
		if (btnplus.isSelected()) {
		str1 =	jf.getText();
		str2 = jf2.getText();
		double n1=Integer.parseInt(str1);
		double n2 = Integer.parseInt(str2);
		double sum = n1+n2;
		//String rz= Integer.parse(sum);
		result.setText(sum+"");
		}
		else if(btnmul.isSelected()) {
				str1 =	jf.getText();
				str2 = jf2.getText();
				double n1=Integer.parseInt(str1);
				double n2 = Integer.parseInt(str2);
				double mul = n1*n2;
				result.setText(mul+"");
		}
		else if(btnsub.isSelected()) {
			str1 =	jf.getText();
			str2 = jf2.getText();
			double n1=Integer.parseInt(str1);
			double n2 = Integer.parseInt(str2);
			double sub = n1-n2;
			result.setText(sub+"");
		}
		
		else if(btndiv.isSelected()) {
			str1 =	jf.getText();
			str2 = jf2.getText();
			double n1=Integer.parseInt(str1);
			double n2 = Integer.parseInt(str2);
			double div = n1/n2;
			result.setText(div+" " );
		}
		
	}
public static void main(String args[]) {
	Calculator_CB obj= new Calculator_CB();
}	
	
}
