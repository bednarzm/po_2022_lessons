package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveFromLinkedHashSetPerformanceTask  extends RemoveFromSetPerformanceTask {
	
	public RemoveFromLinkedHashSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new LinkedHashSet<Object>();
	}
}
