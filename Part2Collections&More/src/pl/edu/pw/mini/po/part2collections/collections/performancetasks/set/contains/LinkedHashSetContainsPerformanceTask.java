package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetContainsPerformanceTask extends ContainsObjectSetPerformanceTask {

	public LinkedHashSetContainsPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new LinkedHashSet<Object>();
	}

}
