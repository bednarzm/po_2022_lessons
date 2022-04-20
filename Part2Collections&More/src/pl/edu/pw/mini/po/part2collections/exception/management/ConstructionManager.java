package pl.edu.pw.mini.po.part2collections.exception.management;

import pl.edu.pw.mini.po.part2collections.exception.concrete.section.ConstructionSiteException;
import pl.edu.pw.mini.po.part2collections.exception.site.ConstructionSite;

public class ConstructionManager {

	private ConstructionSite constructionSite = new ConstructionSite();
	
	public void manage() throws ConstructionSiteManagerException {
		try {
			constructionSite.construct();
		} catch (ConstructionSiteException e) {
			e.printStackTrace();
			throw new ConstructionSiteManagerException("Problem z budow. Mozliwe opoznienie.", e);
		}
	}

}
