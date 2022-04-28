package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import java.util.Collection;
import java.util.LinkedHashSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.RemoveByIteratorPerformanceTask;

public class RemoveFromLinkedHashSetPerformanceTask  extends RemoveByIteratorPerformanceTask {
	
	public RemoveFromLinkedHashSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new LinkedHashSet<Object>();
	}
}
