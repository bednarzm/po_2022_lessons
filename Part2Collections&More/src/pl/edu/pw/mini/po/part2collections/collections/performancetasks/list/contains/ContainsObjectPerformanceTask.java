package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class ContainsObjectPerformanceTask extends CollectionPerformanceTask {

	private Object objectToCheckIfIsContained;

	public ContainsObjectPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}

	@Override
	public void prepareTask() {
		collection = getCollectionImplementation();

		for (int i = 0; i < taskSize; i++) {
			collection.add(Integer.valueOf(i));
		}
		// mniej wiecej w polowie
		int approxMiddle = collection.size() / 2;
		int count = 0;
		for (Object object : collection) {
			if (++count == approxMiddle) {
				objectToCheckIfIsContained = object;
				break;
			}
		}
	}

	@Override
	public void doTask() {
		for (int i = 0; i < 100000; i++)
			collection.contains(objectToCheckIfIsContained);
	}

}
