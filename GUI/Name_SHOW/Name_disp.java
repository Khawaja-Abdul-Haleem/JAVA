package cs4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Name_disp implements ActionListener{
	JFrame frame;
	JTextField tf;
	JLabel label1;
	JTextArea area;
	JLabel label2;
	JButton clr;
	JButton show;
	
	public void render() {
		frame = new JFrame();
		label1 = new  JLabel("Name"); 
		tf = new JTextField(20);
		label2 = new JLabel("Output");
		area = new JTextArea(15,15);
		show = new JButton("Show");
		clr = new JButton("Clear");
	
		Container c = frame.getContentPane();
		c.add(label1); c.add(tf);
		c.add(show); c.add(clr);
		c.add(label2); 
		c.add(area);
		frame.setSize(250,250);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		show.addActionListener(this);
		clr.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

	public Name_disp() {
		render();
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		String st = tf.getText(); 
		
		if (evt.getSource() == show) {
			
			area.setText(area.getText() + "\n" + st);
		}
		else if (evt.getSource() == clr) {
			area.setText(" ");
		}
	}
	
	public static void main(String [] args) {
		Name_disp name = new Name_disp(); 
	}
}

