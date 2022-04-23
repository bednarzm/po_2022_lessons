package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.HashSet;
import java.util.Set;

public class HashSetContainsSetPerformanceTask extends ContainsObjectSetPerformanceTask {

	public HashSetContainsSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new HashSet<Object>();
	}

}
