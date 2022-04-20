package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddPerformanceTask extends AddToListPerformanceTask {

	public ArrayListAddPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected List<Object> getListImplementation() {
		return new ArrayList<Object>();
	}

}
