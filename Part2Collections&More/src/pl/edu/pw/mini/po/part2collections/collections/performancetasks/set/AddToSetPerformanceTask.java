package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set;

public abstract class AddToSetPerformanceTask extends SetPerformanceTask {

	public AddToSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		initCollection();
	}

}
