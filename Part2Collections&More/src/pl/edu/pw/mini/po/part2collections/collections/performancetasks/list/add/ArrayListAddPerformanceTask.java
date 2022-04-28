package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddPerformanceTask extends AddPerformanceTask {

	public ArrayListAddPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getCollectionImplementation() {
		return new ArrayList<Object>();
	}

}
