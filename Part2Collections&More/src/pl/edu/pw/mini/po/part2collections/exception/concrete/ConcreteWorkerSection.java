package pl.edu.pw.mini.po.part2collections.exception.concrete;

import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WorkerSection;

public class ConcreteWorkerSection extends WorkerSection {

	@Override
	public void doJob() {
		System.out.println("I am mixing concrete...");
	}
	
}
