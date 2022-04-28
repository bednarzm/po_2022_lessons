package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class RemoveFromSetPerformanceTask extends CollectionPerformanceTask {

	private Object objectToCheckIfIsContained;

	public RemoveFromSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		collection.remove(objectToCheckIfIsContained);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}

}
