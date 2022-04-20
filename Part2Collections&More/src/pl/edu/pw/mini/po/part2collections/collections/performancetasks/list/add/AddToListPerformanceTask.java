package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add;

import java.util.List;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.ListPerformanceTask;

public abstract class AddToListPerformanceTask extends ListPerformanceTask {

	public AddToListPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract List<Object> getListImplementation();

	@Override
	public void doTask() {
		initCollection();
	}

}
