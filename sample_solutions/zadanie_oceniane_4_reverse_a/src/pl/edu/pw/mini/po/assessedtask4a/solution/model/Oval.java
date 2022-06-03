package pl.edu.pw.mini.po.assessedtask4a.solution.model;

import java.awt.Color;
import java.awt.Graphics;

import pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel.GraphicPanel;

/**
 * @author mabd
 *
 */
public class Oval extends Shape {

	private static final int WAIT_RAY = 100;
	protected int ray;

	public Oval(int x, int y, GraphicPanel graphicPanel, int ray, Object lock) {
		super(x, y, graphicPanel, lock);
		this.ray = ray;
		this.color = new Color(0, 100, 0);
	}

	@Override
	public void apply(ShapeVisitor shapeVisitor) {
		shapeVisitor.visitOval(this);
	}

	@Override
	public void run() {
		while (true) {
			try {
				ray++;
				graphicPanel.repaint();
				manageRay();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void manageRay() {

		synchronized (lock) {
			if (ray % WAIT_RAY == 0) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void paintMe(Graphics graphics) {
		super.paintMe(graphics);
		graphics.setColor(color);
		graphics.drawOval(x - ray / 2, y - ray / 2, ray, ray);
	}

	public int getRay() {
		return ray;
	}

}
