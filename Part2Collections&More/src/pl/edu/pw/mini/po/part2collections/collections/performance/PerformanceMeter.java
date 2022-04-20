package pl.edu.pw.mini.po.part2collections.collections.performance;

import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.ArrayListAddPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.add.LinkedListAddPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.ArrayListContainsObjectPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.contains.LinkedListContainsObjectPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex.ArrayListGetByIndexPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.getbyindex.LinkedListGetByIndexPerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.ArrayListRemovePerformanceTask;
import pl.edu.pw.mini.po.part2collections.collections.performancetasks.list.remove.LinkedListRemovePerformanceTask;

public class PerformanceMeter {
	
	public static void main(String [] args) {
		/*
		System.out.println("Adding duration: ");
		measureTaskPerformance(new ArrayListAddPerformanceTask(20_000_000, "ArrayListAdd"));
		measureTaskPerformance(new LinkedListAddPerformanceTask(20_000_000, "LinkedListAdd"));
		System.out.println();
		*/
		
		/*
		System.out.println("Get by index duration: ");
		measureTaskPerformance(new ArrayListGetByIndexPerformanceTask(100_000_000, "ArrayListGetByIndex"));
		measureTaskPerformance(new LinkedListGetByIndexPerformanceTask(100_000_000, "LinkedListGetByIndex"));
		System.out.println();
		*/
		
		/*
		System.out.println("Remove: ");
		measureTaskPerformance(new ArrayListRemovePerformanceTask(400_000, "ArrayListRemove"));
		measureTaskPerformance(new LinkedListRemovePerformanceTask(400_000, "LinkedListRemove"));
		System.out.println();
		*/
		/*
		System.out.println("Contains: ");
		measureTaskPerformance(new ArrayListContainsObjectPerformanceTask(200_000_000, "ArrayListContains"));
		measureTaskPerformance(new LinkedListContainsObjectPerformanceTask(200_000_000, "LinkedListContains"));
		System.out.println();
		*/
		
	}

	public static void measureTaskPerformance(PerformanceMeterTask performanceMeterTask) {
		performanceMeterTask.prepareTask();
		
		long timeBefore = System.currentTimeMillis();
		performanceMeterTask.doTask();
		long timeAfter = System.currentTimeMillis();
		
		double duration = (timeAfter - timeBefore)/1000.0;
		
		System.out.println("The " + performanceMeterTask + " duration (in seconds) is: " + duration);
		
	}
	
}
