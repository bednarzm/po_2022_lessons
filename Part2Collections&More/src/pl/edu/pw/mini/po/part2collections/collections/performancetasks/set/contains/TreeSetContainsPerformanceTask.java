package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetContainsPerformanceTask extends ContainsObjectSetPerformanceTask {

	public TreeSetContainsPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new TreeSet<Object>();
	}
	
}
