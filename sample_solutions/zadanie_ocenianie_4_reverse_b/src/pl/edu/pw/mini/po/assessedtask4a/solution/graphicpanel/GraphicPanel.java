package pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import pl.edu.pw.mini.po.assessedtask4a.solution.model.Cross;
import pl.edu.pw.mini.po.assessedtask4a.solution.model.Oval;
import pl.edu.pw.mini.po.assessedtask4a.solution.model.Shape;
import pl.edu.pw.mini.po.assessedtask4a.solution.model.ShapeVisitor;

public class GraphicPanel extends JPanel {

	private static final long serialVersionUID = -5133569981036094293L;

	private List<Shape> shapes = new LinkedList<Shape>();

	private static class MyMouseListener implements MouseListener {

		private GraphicPanel graphicPanel;
		private List<Shape> shapes;
		private Object lock;

		public MyMouseListener(GraphicPanel graphicPanel, List<Shape> shapes, Object lock) {
			super();
			this.graphicPanel = graphicPanel;
			this.shapes = shapes;
			this.lock = lock;
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				addShape(new Cross(e.getX(), e.getY(), graphicPanel, 50, lock));
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				addShape(new Oval(e.getX(), e.getY(), graphicPanel, 50));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		public void addShape(Shape shape) {
			shapes.add(shape);
		}
	}

	public GraphicPanel(Object lock) {
		setPreferredSize(new Dimension(600, 600));
		addMouseListener(new MyMouseListener(this, shapes, lock));
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);

		for (Shape shape : shapes) {
			shape.paintMe(graphics);
		}

	}

	@Override
	public synchronized void repaint() {
		super.repaint();
	}

	public void setRandomColorForAllOvals() {
		ShapeVisitor shapeVisitor = new OvalVisitor();
		for(Shape shape : shapes) {
			shape.apply(shapeVisitor);
		}
	}

}
