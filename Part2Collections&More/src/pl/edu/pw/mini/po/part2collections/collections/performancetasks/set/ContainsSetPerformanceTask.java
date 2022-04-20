package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set;

public abstract class ContainsSetPerformanceTask extends SetPerformanceTask {

	public ContainsSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		
	}

	@Override
	public void prepareTask() {
		initCollection();
	}

}
