package pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.print.attribute.IntegerSyntax;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.CollectionPerformanceTask;

public abstract class AddPerformanceTask extends CollectionPerformanceTask {

	private List<Object> objectsToAdd = new ArrayList<Object>();
	
	public AddPerformanceTask(int taskSize, String taskTitle) {
		super(taskSize, taskTitle);
	}
	class X implements Comparable {
		private Integer integer;
		private int hashCode;
		
		@Override
		public int compareTo(Object o) {
			
			return integer.compareTo(((X)o).integer);
		}

		public X(Integer integer) {
			this.integer = integer;
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			hashCode = prime * result + Objects.hash(integer)/1000;
		}

		@Override
		public int hashCode() {
			return hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			X other = (X) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(integer, other.integer);
		}

		private AddPerformanceTask getEnclosingInstance() {
			return AddPerformanceTask.this;
		};
		
	}
	// protected abstract List<Object> getListImplementation();

	@Override
	public void doTask() {
		collection.addAll(objectsToAdd);
	}

	@Override
	public void prepareTask() {
		collection = getCollectionImplementation();

		for (int i = 0; i < taskSize; i++) {
			X integerToAdd = new X(Integer.valueOf(i));
			if(i % 10 == 0) {
				if(objectsToAdd.size() < 1000000)
				objectsToAdd.add(integerToAdd);
			}else {
				collection.add(integerToAdd);
			}
		}

	}

}
