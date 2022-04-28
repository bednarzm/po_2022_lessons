package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex;

import java.util.Collection;
import java.util.List;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class GetByIndexPerformanceTask extends CollectionPerformanceTask /*ListPerformanceTask*/ {
	
	protected List<Object> collection;
	
	public GetByIndexPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	protected abstract List<Object> getListImplementation();

	@Override
	protected Collection<Object> getCollectionImplementation() {
		return collection = getListImplementation();
	}

	@Override
	public void prepareTask() {
		initCollection();
	}

	@Override
	public void doTask() {
		int index = collection.size()/2;
		collection.get(index);
	}

}
