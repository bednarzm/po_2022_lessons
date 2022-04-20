package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove;

import java.util.Iterator;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.ListPerformanceTask;

public abstract class RemoveFromListPerformanceTask extends ListPerformanceTask {

	public RemoveFromListPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}
	
	@Override
	public void doTask() {
		int size = objectList.size();
		int currentIndex = 0;
		
		Iterator<Object> iterator = objectList.iterator();
		while(iterator.hasNext()) {
			if(currentIndex % 10 == 0) {//co dziesiaty
				iterator.next();
				iterator.remove();
			}
			currentIndex++;
		}
		
	}
	
}
