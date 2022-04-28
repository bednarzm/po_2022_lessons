package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains;

import java.util.LinkedList;
import java.util.List;

public class LinkedListContainsObjectPerformanceTask extends ContainsObjectPerformanceTask {

	public LinkedListContainsObjectPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getCollectionImplementation() {
		return new LinkedList<Object>();
	}
	
}
