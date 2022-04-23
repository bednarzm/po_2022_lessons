package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetAddObjectSetPerformanceTask extends AddObjectSetPerformanceTask {

	public LinkedHashSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new LinkedHashSet<Object>();
	}

}
