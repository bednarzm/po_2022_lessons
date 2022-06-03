package pl.edu.pw.mini.po.assessedtask4a.solution.model;

import java.awt.Color;
import java.awt.Graphics;

import pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel.GraphicPanel;

public abstract class Shape extends Thread {

	private static int idCounter;

	protected int id = idCounter += 10;
	protected int x;
	protected int y;
	protected Object lock;
	protected GraphicPanel graphicPanel;
	protected Color color;

	public Shape(int x, int y, GraphicPanel graphicPanel, Object lock) {
		super();
		this.x = x;
		this.y = y;
		this.graphicPanel = graphicPanel;
		this.lock = lock;
		start();
	}

	public abstract void apply(ShapeVisitor shapeVisitor);

	public void paintMe(Graphics graphics) {
		graphics.drawString("My id: " + id, x, y);
	}

}
