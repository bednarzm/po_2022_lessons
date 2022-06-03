package pl.edu.pw.mini.po.assessedtask4a.solution.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel.GraphicPanel;

public class Cross extends Shape {

	protected int sideSize;
	protected Object lock;
	private Random random;

	public Cross(int x, int y, GraphicPanel graphicPanel, int sideSize, Object lock) {
		super(x, y, graphicPanel);
		this.sideSize = sideSize;
		this.random = new Random();
		this.lock = lock;
	}

	@Override
	public void apply(ShapeVisitor shapeVisitor) {}

	protected void manage() {
		if (random.nextInt(100) == 0) {
			synchronized (lock) {
				try {
					this.color = new Color(255, 0, 0);
					lock.wait();
					this.color = new Color(0, 0, 0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void paintMe(Graphics graphics) {
		graphics.setColor(color);
		graphics.drawLine(x, y - 20, x, y + 20);
		graphics.drawLine(x - 20, y, x + 20, y);
	}

}
