package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRemovePerformanceTask extends RemoveByIteratorPerformanceTask {

	public LinkedListRemovePerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getCollectionImplementation() {
		return new LinkedList<Object>();
	}

}
