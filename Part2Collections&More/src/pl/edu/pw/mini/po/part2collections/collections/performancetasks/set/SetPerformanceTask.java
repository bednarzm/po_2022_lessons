package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set;

import java.util.Collection;
import java.util.Set;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class SetPerformanceTask extends CollectionPerformanceTask {

	protected Set<Object> objectSet;

	public SetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract Set<Object> getSetImplementation();

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return objectSet = getSetImplementation();
	}
	
}
