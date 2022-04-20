package pl.edu.pw.mini.po.part2collections.exception.site;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.part2collections.exception.concrete.ConcreteWorkerSection;
import pl.edu.pw.mini.po.part2collections.exception.concrete.section.ConstructionSiteException;
import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WorkerSection;
import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WorkerSectionException;
import pl.edu.pw.mini.po.part2collections.exception.concrete.weld.WeldingWorkerSection;

public class ConstructionSite {

	private List<WorkerSection> workerSections = new ArrayList<>();

	public ConstructionSite() {
		workerSections.add(new ConcreteWorkerSection());
		workerSections.add(new WeldingWorkerSection());
	}

	public void construct() throws ConstructionSiteException {
		for(WorkerSection workerSection : workerSections) {
			try {
				workerSection.doJob();
			} catch (WorkerSectionException e) {
				e.printStackTrace();
				throw new ConstructionSiteException("Problem na budowie", e);
			}
		}
	}

}
