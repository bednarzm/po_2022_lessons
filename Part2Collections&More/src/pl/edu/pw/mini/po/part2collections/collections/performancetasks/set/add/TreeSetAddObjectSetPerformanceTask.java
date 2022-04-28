package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add;

import java.util.Collection;
import java.util.TreeSet;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.AddPerformanceTask;

public class TreeSetAddObjectSetPerformanceTask extends AddPerformanceTask {

	public TreeSetAddObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return new TreeSet<Object>();
	}

}
