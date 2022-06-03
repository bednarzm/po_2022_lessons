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

	public Oval(int x, int y, GraphicPanel graphicPanel, int ray) {
		super(x, y, graphicPanel);
		this.ray = ray;
	}

	@Override
	public void apply(ShapeVisitor shapeVisitor) {
		shapeVisitor.visitOval(this);
	}

	protected void manage() {}

	@Override
	public void paintMe(Graphics graphics) {
		graphics.setColor(color);
		graphics.drawOval(x - ray / 2, y - ray / 2, ray, ray);
	}

	public synchronized void setColor(Color color) {
		this.color = color;
	}

}
