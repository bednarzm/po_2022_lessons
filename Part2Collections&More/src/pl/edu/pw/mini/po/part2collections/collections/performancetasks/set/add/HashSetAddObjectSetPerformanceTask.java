package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.Collection;
import java.util.HashSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.AddPerformanceTask;

public class HashSetAddObjectSetPerformanceTask extends AddPerformanceTask {

	public HashSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new HashSet<Object>();
	}

}
