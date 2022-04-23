package pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.SetPerformanceTask;

public abstract class ContainsObjectSetPerformanceTask extends SetPerformanceTask {

	private Object objectToCheckIfIsContained;
	
	public ContainsObjectSetPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void doTask() {
		for(int i=0;i<100000;i++)
		objectSet.contains(objectToCheckIfIsContained);
	}

	@Override
	protected void initCollection() {
		objectSet = getSetImplementation();
		
		for (int i = 0; i < taskSize; i++) {
			Object objectToAdd = Integer.valueOf(Integer.MAX_VALUE);
			if(i == taskSize/2) {//mniej wiecej w polowie
				objectToCheckIfIsContained = objectToAdd;
			}
			objectSet.add(objectToAdd);
		}

	}
	
	@Override
	public void prepareTask() {
		initCollection();
	}

}
