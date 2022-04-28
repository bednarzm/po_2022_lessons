package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.ContainsObjectPerformanceTask;

public class LinkedHashSetContainsPerformanceTask extends ContainsObjectPerformanceTask {

	public LinkedHashSetContainsPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getCollectionImplementation() {
		return new LinkedHashSet<Object>();
	}

}
