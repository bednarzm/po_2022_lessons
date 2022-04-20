package pl.edu.pw.mini.po.part2collections.exception.concrete.weld;

import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WeldingSectionException;
import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WorkerSection;

public class WeldingWorkerSection extends WorkerSection {
	
	private WeldingMachineStorage weldingMachineStorage = new WeldingMachineStorage(null);
	private Welder welder = new Welder();
	
	@Override
	public void doJob() throws WeldingSectionException {
		
		prepareWelder();
		welder.doJob();
		
		try {
			prepareWelder();
			welder.doJob();
		} catch (UkradliSpawarkeException e) {
			e.printStackTrace();
			throw new WeldingSectionException("Na sekcji cos sie zepsulo", e);
		} catch (SpawarkaZepsutaException e) {
			e.printStackTrace();
			throw new WeldingSectionException("Na sekcji cos sie zepsulo", e);
		} 
		
		finishWork();
	}
	
	private void prepareWelder() throws UkradliSpawarkeException {
		WeldingMachine weldingMachine = weldingMachineStorage.takeWeldingMachineFromStorage();
		if(weldingMachine != null) {
			welder.setWeldingMachine(weldingMachine);
		} else {
			throw new UkradliSpawarkeException("Ukradli i tyle!");
		}
	}
	
	private void finishWork() {
		WeldingMachine weldingMachine = welder.getWeldingMachine();
		welder.setWeldingMachine(null);
		weldingMachineStorage.putWeldingMachine(weldingMachine);
	}
	
}
