package pl.edu.pw.mini.po.part2collections.exception.concrete.weld;

public class Welder {

	private WeldingMachine weldingMachine;

	public void doJob() throws SpawarkaZepsutaException {
		weldingMachine.use();
	}

	public WeldingMachine getWeldingMachine() {
		return weldingMachine;
	}

	public void setWeldingMachine(WeldingMachine weldingMachine) {
		this.weldingMachine = weldingMachine;
	}
	
}
