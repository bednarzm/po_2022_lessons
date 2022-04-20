package pl.edu.pw.mini.po.part2collections.collections.performance;

public abstract class PerformanceMeterTask {

	protected int taskSize;
	private String taskTitle;

	public PerformanceMeterTask(int taskSize, String taskTitle) {
		this.taskSize = taskSize;
		this.taskTitle = taskTitle;
	}

	public abstract void doTask();
	public void prepareTask(){};

	@Override
	public String toString() {
		return "[" + "taskTitle=" + taskTitle + ", "+ "taskSize=" + taskSize + "]";
	}

}
