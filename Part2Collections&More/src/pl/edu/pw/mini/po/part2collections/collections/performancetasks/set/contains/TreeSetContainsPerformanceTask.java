package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import java.util.Set;
import java.util.TreeSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.ContainsObjectPerformanceTask;

public class TreeSetContainsPerformanceTask extends ContainsObjectPerformanceTask {

	public TreeSetContainsPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Set<Object> getCollectionImplementation() {
		return new TreeSet<Object>();
	}
	
}
