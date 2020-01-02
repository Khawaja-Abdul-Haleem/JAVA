package cS_Mouse_EVENT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI_Mouse_Event extends Frame implements MouseListener{
	GUI_Mouse_Event(){
		addMouseListener(this);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent evt) {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(evt.getX(), evt.getY(), 30, 30);
		
	}
	
	public void mouseEntered(MouseEvent evt) {
		System.out.println("Mouse Entered in Frame..");
	}
	
	public void mouseExited(MouseEvent evt) {
		System.out.println("Mouse Exit From frame");
	}
	
	public void mousePressed(MouseEvent evt) {
		System.out.println("Mouse Pressed over Frame");
	}
	public void mouseReleased(MouseEvent evt) {
		System.out.println("Mouse Released over Frame");
	}
	public static void main(String [] args) {
		new GUI_Mouse_Event();
	}
}
