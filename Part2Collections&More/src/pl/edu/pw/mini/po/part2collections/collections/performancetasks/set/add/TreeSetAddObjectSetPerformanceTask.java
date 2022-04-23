package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAddObjectSetPerformanceTask extends AddObjectSetPerformanceTask {

	public TreeSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getSetImplementation() {
		return new TreeSet<Object>();
	}

}
