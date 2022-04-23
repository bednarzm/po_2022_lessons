package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list;

import java.util.Collection;
import java.util.List;

public abstract class ListPerformanceTask extends CollectionPerformanceTask {

	protected List<Object> objectList;

	public ListPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract List<Object> getListImplementation();

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return objectList = getListImplementation();
	}

	@Override
	public void doTask() {
		
	}

}
