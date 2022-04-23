package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.Set;
import java.util.TreeSet;

public class RemoveFromTreeSetPerformanceTask extends RemoveFromSetPerformanceTask {
	
	public RemoveFromTreeSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new TreeSet<Object>();
	}
}
