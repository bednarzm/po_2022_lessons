package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.Collection;
import java.util.LinkedHashSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.AddPerformanceTask;

public class LinkedHashSetAddObjectSetPerformanceTask extends AddPerformanceTask {

	public LinkedHashSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new LinkedHashSet<Object>();
	}

}
