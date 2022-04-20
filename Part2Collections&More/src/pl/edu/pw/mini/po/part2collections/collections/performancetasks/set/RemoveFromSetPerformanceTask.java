package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set;

public abstract class RemoveFromSetPerformanceTask extends SetPerformanceTask {

	public RemoveFromSetPerformanceTask(int taskSize, String taskTitle) {
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
