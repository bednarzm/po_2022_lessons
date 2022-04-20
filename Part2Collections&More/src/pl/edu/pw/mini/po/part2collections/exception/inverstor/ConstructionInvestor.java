package pl.edu.pw.mini.po.part2collections.exception.inverstor;

import pl.edu.pw.mini.po.part2collections.exception.concrete.section.ConstructionSiteException;
import pl.edu.pw.mini.po.part2collections.exception.concrete.weld.UkradliSpawarkeException;
import pl.edu.pw.mini.po.part2collections.exception.management.ConstructionManager;
import pl.edu.pw.mini.po.part2collections.exception.management.ConstructionSiteManagerException;

public class ConstructionInvestor {

	private ConstructionManager constructionManager = new ConstructionManager();

	public void execute() {
		try {
			constructionManager.manage();
		} catch (ConstructionSiteManagerException e) {
			
			
			System.out.println(" >>> " + e.getCause().getCause().getCause());
			
		}
	}
}
