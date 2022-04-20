package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;

public class ArrayListRemovePerformanceTask extends RemoveFromListPerformanceTask {

	public ArrayListRemovePerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getListImplementation() {
		return new ArrayList<Object>();
	}
	
}
