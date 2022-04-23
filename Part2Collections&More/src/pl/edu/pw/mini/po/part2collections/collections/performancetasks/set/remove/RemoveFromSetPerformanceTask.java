package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.SetPerformanceTask;

public abstract class RemoveFromSetPerformanceTask extends SetPerformanceTask {

	private Object objectToCheckIfIsContained;

	public RemoveFromSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		objectSet.remove(objectToCheckIfIsContained);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}
	
}
