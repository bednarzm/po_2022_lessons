package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list;

import java.util.Collection;
import java.util.Random;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;

public abstract class CollectionPerformanceTask extends PerformanceMeterTask {

	private Random random = new Random();
	
	public CollectionPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract Collection<Object> getCollectionImplementation();
	
	protected void initCollection() {
		Collection<Object> objectsCollection = getCollectionImplementation();
		for (int i = 0; i < taskSize; i++) {
			objectsCollection.add(random.nextInt());
		}
	}

}
