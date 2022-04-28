package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsObjectPerformanceTask extends ContainsObjectPerformanceTask {

	public ArrayListContainsObjectPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getCollectionImplementation() {
		return new ArrayList<Object>();
	}

}
