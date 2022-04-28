package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListGetByIndexPerformanceTask extends GetByIndexPerformanceTask {

	public LinkedListGetByIndexPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getListImplementation() {
		return new LinkedList<Object>();
	}

}
