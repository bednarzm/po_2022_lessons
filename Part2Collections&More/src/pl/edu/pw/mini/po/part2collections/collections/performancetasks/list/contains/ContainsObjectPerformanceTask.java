package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains;

import pl.edu.pw.mini.po.part2collections.collections.performance.PerformanceMeterTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.ListPerformanceTask;

public abstract class ContainsObjectPerformanceTask extends ListPerformanceTask {
	
	private Object objectToCheckIfIsContained;
	
	public ContainsObjectPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void prepareTask() {
		initCollection();
	}

	@Override
	protected void initCollection() {
		objectList = getListImplementation();
		
		for (int i = 0; i < taskSize; i++) {
			Object objectToAdd = new Object();
			if(i == taskSize/2) {//mniej wiecej w polowie
				objectToCheckIfIsContained = objectToAdd;
			}
			objectList.add(objectToAdd);
		}

	}

	@Override
	public void doTask() {
		for(int i=0;i<100000;i++)
		objectList.contains(objectToCheckIfIsContained);
	}

}
