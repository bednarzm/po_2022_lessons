package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.ListPerformanceTask;

public abstract class GetByIndexPerformanceTask extends ListPerformanceTask {
	
	public GetByIndexPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}

	@Override
	public void doTask() {
		int index = objectList.size()/2;
		objectList.get(index);
	}

}
