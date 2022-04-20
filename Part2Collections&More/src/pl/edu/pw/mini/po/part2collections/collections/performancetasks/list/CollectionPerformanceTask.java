package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list;

import java.util.Collection;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;

public abstract class CollectionPerformanceTask extends PerformanceMeterTask {

	public CollectionPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract Collection<Object> getCollectionImplementation();
	
	protected void initCollection() {
		Collection<Object> objectsCollection = getCollectionImplementation();
		for (int i = 0; i < taskSize; i++) {
			objectsCollection.add(new Object());
		}
	}
	
}
