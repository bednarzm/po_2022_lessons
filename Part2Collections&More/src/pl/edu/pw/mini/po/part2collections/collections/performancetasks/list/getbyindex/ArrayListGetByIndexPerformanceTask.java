package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListGetByIndexPerformanceTask extends GetByIndexPerformanceTask {
	
	public ArrayListGetByIndexPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getListImplementation() {
		return new ArrayList<Object>();
	}

}
