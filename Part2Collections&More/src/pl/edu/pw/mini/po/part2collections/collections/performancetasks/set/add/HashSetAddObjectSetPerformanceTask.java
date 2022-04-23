package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddObjectSetPerformanceTask extends AddObjectSetPerformanceTask {

	public HashSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new HashSet<Object>();
	}

}
