package pl.edu.pw.mini.po.part2collections.collections.performance;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashSet;
import java.util.Set;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.ArrayListAddPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.LinkedListAddPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.ArrayListContainsObjectPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.LinkedListContainsObjectPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex.ArrayListGetByIndexPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex.LinkedListGetByIndexPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.ArrayListRemovePerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.LinkedListRemovePerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add.HashSetAddObjectSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add.LinkedHashSetAddObjectSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.add.TreeSetAddObjectSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains.HashSetContainsSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains.LinkedHashSetContainsPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.contains.TreeSetContainsPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove.RemoveFromHashSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove.RemoveFromLinkedHashSetPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.set.remove.RemoveFromTreeSetPerformanceTask;

public class PerformanceMeter {

	public static void main(String [] args) {
		doPerformanceTest();
	}

	private static void doPerformanceTest() {

		System.out.println("Get by index duration: ");
		measureTaskPerformance(new ArrayListGetByIndexPerformanceTask(100_000_000, "ArrayListGetByIndex"));
		measureTaskPerformance(new LinkedListGetByIndexPerformanceTask(100_000_000, "LinkedListGetByIndex"));
		System.out.println();

		System.out.println("Add: ");
		measureTaskPerformance(new ArrayListAddPerformanceTask(10_000_000, "ArrayListAdd"));
		measureTaskPerformance(new LinkedListAddPerformanceTask(10_000_000, "LinkedListAdd"));
		measureTaskPerformance(new HashSetAddObjectSetPerformanceTask(10_000_000, "HashSetAdd"));
		measureTaskPerformance(new LinkedHashSetAddObjectSetPerformanceTask(10_000_000, "LinkedHashSetAdd"));
		measureTaskPerformance(new TreeSetAddObjectSetPerformanceTask(10_000_000, "TreeAdd"));
		System.out.println();
		
		System.out.println("Remove: ");
		measureTaskPerformance(new ArrayListRemovePerformanceTask(400_000, "ArrayListRemove by Iterator"));
		measureTaskPerformance(new LinkedListRemovePerformanceTask(400_000, "LinkedListRemove by Iterator"));
		measureTaskPerformance(new RemoveFromHashSetPerformanceTask(400_000, "HashSetRemove by Iterator"));
		measureTaskPerformance(new RemoveFromLinkedHashSetPerformanceTask(400_000, "LinkedHashSetRemove by Iterator"));
		measureTaskPerformance(new RemoveFromTreeSetPerformanceTask(400_000, "TreeSetRemove by Iterator"));
		System.out.println();
		
		System.out.println("Contains: ");
		measureTaskPerformance(new ArrayListContainsObjectPerformanceTask(200_000, "ArrayListContains"));
		measureTaskPerformance(new LinkedListContainsObjectPerformanceTask(200_000, "LinkedListContains"));
		measureTaskPerformance(new HashSetContainsSetPerformanceTask(200_000, "HashSetContains"));
		measureTaskPerformance(new LinkedHashSetContainsPerformanceTask(200_000, "LinkedHashSetContains"));
		measureTaskPerformance(new TreeSetContainsPerformanceTask(200_000, "TreeSetContains"));

		System.out.println();
	}
	
	public static void measureTaskPerformance(PerformanceMeterTask performanceMeterTask) {
		performanceMeterTask.prepareTask();

		long timeBefore = System.nanoTime();
		performanceMeterTask.doTask();
		long timeAfter = System.nanoTime();

		double duration = (timeAfter - timeBefore)/1000000.0;
		System.out.println("The " + performanceMeterTask + " duration (in seconds) is: " + BigDecimal.valueOf(duration).round(new MathContext(6)) + "ms");

	}

}
