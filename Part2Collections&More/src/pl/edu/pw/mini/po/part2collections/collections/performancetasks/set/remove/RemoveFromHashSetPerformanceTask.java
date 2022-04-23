package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.HashSet;
import java.util.Set;

public class RemoveFromHashSetPerformanceTask extends RemoveFromSetPerformanceTask {

	public RemoveFromHashSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new HashSet<Object>();
	}

}
