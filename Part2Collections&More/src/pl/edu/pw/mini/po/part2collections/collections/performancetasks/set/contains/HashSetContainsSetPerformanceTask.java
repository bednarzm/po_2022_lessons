package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.ContainsObjectPerformanceTask;

public class HashSetContainsSetPerformanceTask extends ContainsObjectPerformanceTask {

	public HashSetContainsSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getCollectionImplementation() {
		return new HashSet<Object>();
	}

}
