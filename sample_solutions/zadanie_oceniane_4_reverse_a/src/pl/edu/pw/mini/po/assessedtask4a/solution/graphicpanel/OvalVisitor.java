package pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel;

import pl.edu.pw.mini.po.assessedtask4a.solution.model.Oval;
import pl.edu.pw.mini.po.assessedtask4a.solution.model.ShapeVisitor;

public class OvalVisitor implements ShapeVisitor {

	private int sum;

	@Override
	public void visitOval(Oval oval) {
		sum += oval.getRay();
	}

	public int getSum() {
		return sum;
	}

}
