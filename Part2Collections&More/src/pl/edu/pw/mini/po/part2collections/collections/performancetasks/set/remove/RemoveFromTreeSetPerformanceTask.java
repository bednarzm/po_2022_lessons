package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.Collection;
import java.util.TreeSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.RemoveByIteratorPerformanceTask;

public class RemoveFromTreeSetPerformanceTask extends RemoveByIteratorPerformanceTask {
	
	public RemoveFromTreeSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new TreeSet<Object>();
	}
}
