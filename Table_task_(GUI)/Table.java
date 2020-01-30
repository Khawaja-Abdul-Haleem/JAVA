package table_pkg;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame{
	JLabel loantype,loanamnt,duration,amounttopay,monthlypay;
	JRadioButton hloan,cloan,eloan;
	JTextField la,atp,mp;
	JButton compute;
	JComboBox box;
	ButtonGroup group;
	
	public Table() {
		loantype = new JLabel("Loan Type");
		hloan = new JRadioButton("House Loan", true);
		cloan = new JRadioButton("Car Loan");
		eloan = new JRadioButton("Education Loan");
		
		loanamnt = new JLabel("Loan Amount");
		la = new JTextField(15);
		
		duration = new JLabel("Duration of Loan(in months)");
		String [] str = {"6","12","18","24","36","42","48","54","60"};
		box = new JComboBox(str);
				
		amounttopay = new JLabel("Total Amount to Pay");
		atp = new JTextField(15);
		
		monthlypay = new JLabel("Monthly Payment");
		mp = new JTextField(15);
		
		compute = new JButton("Compute");
		
		group = new ButtonGroup();
		group.add(hloan);
		group.add(cloan);
		group.add(eloan);
	
		add(loantype);
		add(hloan); add(cloan); add(eloan);
		add(loanamnt); add(la);
		add(duration); add(box);
		add(amounttopay); add(atp);
		add(monthlypay); add(mp);
		add(compute);
		
		setLayout(new FlowLayout(100,100,getDefaultCloseOperation()));
		setVisible(true);
		
		compute.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				String stla = la.getText();
				int lamnt = Integer.parseInt(stla);
				int bx = box.getSelectedIndex();
				if (hloan.isSelected()) {
					if (bx == 0 || bx == 1) {
						int interest = (lamnt/100)*5;
						int amtopay = interest + lamnt;
						
						atp.setText(Integer.toString(amtopay));
						if (bx == 0) {
							mp.setText(Integer.toString(amtopay/6));
						}
					}
				}
			}
		});
		}
	
	public static void main(String [] args) {
		Table td = new Table();
	}
	
};

