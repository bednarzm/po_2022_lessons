package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddPerformanceTask extends AddToSetPerformanceTask {

	public HashSetAddPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new HashSet<Object>();
	}
	
}
