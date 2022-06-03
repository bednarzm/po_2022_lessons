package pl.edu.pw.mini.po.assessedtask4a.solution.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel.GraphicPanel;

public abstract class Shape extends Thread {
	
	private static final int MAX_MOTION_FACTORS = 20;
	
	private static int idCounter;

	protected int id = idCounter += 10;
	protected int x;
	protected int y;
	protected GraphicPanel graphicPanel;
	private int motionCounter;
	private MotionFactorsPair motionFactorsPair = new MotionFactorsPair();
	protected Color color = new Color(0, 0, 0);
	
	private class MotionFactorsPair{
		
		private int xMotionFactor, yMotionFactor;

		public MotionFactorsPair() {
			Random random = new Random();
			xMotionFactor = random.nextInt(3)-1;
			yMotionFactor = random.nextInt(3)-1;
		}

		public int getxMotionFactor() {
			return xMotionFactor;
		}

		public int getyMotionFactor() {
			return yMotionFactor;
		}
		
	}
	
	public Shape(int x, int y, GraphicPanel graphicPanel) {
		super();
		this.x = x;
		this.y = y;
		this.graphicPanel = graphicPanel;
		start();
	}

	public abstract void apply(ShapeVisitor shapeVisitor);
	public abstract void paintMe(Graphics graphics);
	protected abstract void manage();

	@Override
	public void run() {
		while (true) {
			try {
				move();
				graphicPanel.repaint();
				manage();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void move() {
		if(motionCounter++ % MAX_MOTION_FACTORS == 0) {
			this.motionFactorsPair = new MotionFactorsPair();
		} else {
			this.x += motionFactorsPair.getxMotionFactor();
			this.y += motionFactorsPair.getyMotionFactor();
		}
	}
	
}
