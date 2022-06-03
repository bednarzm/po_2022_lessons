package pl.edu.pw.mini.po.assessedtask4a.solution.model;

import java.awt.Color;
import java.awt.Graphics;

import pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel.GraphicPanel;

public class Square extends Shape {

	private static final int WAIT_SIDE_SIZE = 60;
	protected int sideSize;

	public Square(int x, int y, GraphicPanel graphicPanel, int sideSize, Object lock) {
		super(x, y, graphicPanel, lock);
		this.sideSize = sideSize;
		this.color = new Color(0, 0, 100);
	}

	@Override
	public void apply(ShapeVisitor shapeVisitor) {

	}

	@Override
	public void run() {
		while (true) {
			try {
				sideSize++;
				graphicPanel.repaint();
				manageSizeSize();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void manageSizeSize() {

		synchronized (lock) {
			if (sideSize % WAIT_SIDE_SIZE == 0) {
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
		graphics.drawRect(x - sideSize / 2, y - sideSize / 2, sideSize, sideSize);
	}

}
