package pl.edu.pw.mini.po.twelfth.mypanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class MyWorkPanel extends JPanel {
	
	private List<MyDot> myDots = new ArrayList<MyDot>();
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(255, 0, 0));
		g.drawLine(0, 0, 100, 100);
		paintWhiteDots(g);
		
	}
	
	private void paintWhiteDots(Graphics g) {
		g.setColor(new Color(255, 255, 255));
		for(MyDot myDot : myDots) {
			g.drawOval(myDot.getX(), myDot.getY(), 5, 5);
		}
	}
	
	public void addDot(int x, int y) {
		myDots.add(new MyDot(x, y));
	}
	
}
