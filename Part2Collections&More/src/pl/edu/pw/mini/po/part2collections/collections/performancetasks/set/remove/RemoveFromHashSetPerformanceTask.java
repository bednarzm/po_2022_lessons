package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.Collection;
import java.util.HashSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.RemoveByIteratorPerformanceTask;

public class RemoveFromHashSetPerformanceTask extends RemoveByIteratorPerformanceTask {

	public RemoveFromHashSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new HashSet<Object>();
	}

}
