package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.SetPerformanceTask;

public abstract class AddObjectSetPerformanceTask extends SetPerformanceTask {

	public AddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		objectSet.add(Integer.valueOf(Integer.MAX_VALUE));
	}

	@Override
	public void prepareTask() {
		initCollection();
	}
	
}
