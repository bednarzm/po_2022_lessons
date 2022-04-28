package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;

public abstract class CollectionPerformanceTask extends PerformanceMeterTask {

	protected Collection<Object> collection;
	
	private Random random = new Random();
	/*
	protected abstract List<Object> getListImplementation();
	protected abstract Set<Object> getSetImplementation();
	*/
	public CollectionPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract Collection<Object> getCollectionImplementation();
	
	protected void initCollection() {
		collection = getCollectionImplementation();
		for (int i = 0; i < taskSize; i++) {
			collection.add(Integer.valueOf(i));
		}
	}

}
