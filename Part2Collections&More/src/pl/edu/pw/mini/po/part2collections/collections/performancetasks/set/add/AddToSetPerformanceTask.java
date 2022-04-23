package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.SetPerformanceTask;

public abstract class AddToSetPerformanceTask extends SetPerformanceTask {

	public AddToSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		initCollection();
	}

}
