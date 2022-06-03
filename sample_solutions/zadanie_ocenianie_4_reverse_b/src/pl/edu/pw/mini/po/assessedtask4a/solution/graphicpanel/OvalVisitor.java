package pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel;

import java.awt.Color;
import java.util.Random;

import pl.edu.pw.mini.po.assessedtask4a.solution.model.Oval;
import pl.edu.pw.mini.po.assessedtask4a.solution.model.ShapeVisitor;

public class OvalVisitor implements ShapeVisitor {

	private Color color;

	public OvalVisitor() {
		Random random = new Random();
		this.color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}

	@Override
	public void visitOval(Oval oval) {
		oval.setColor(color);
	}

}
