package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove;

import java.util.Iterator;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class RemoveByIteratorPerformanceTask extends CollectionPerformanceTask {

	public RemoveByIteratorPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}
	
	@Override
	public void doTask() {
		int size = collection.size();
		int currentIndex = 0;
		
		Iterator<Object> iterator = collection.iterator();
		while(iterator.hasNext()) {
			if(currentIndex % 10 == 0) {//co dziesiaty
				iterator.next();
				iterator.remove();
			}
			currentIndex++;
		}
		
	}
	
}
