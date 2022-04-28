package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add;

import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;

public class LinkedListAddPerformanceTask extends AddPerformanceTask {

	public LinkedListAddPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getCollectionImplementation() {
		return new LinkedList<Object>();
	}

}
