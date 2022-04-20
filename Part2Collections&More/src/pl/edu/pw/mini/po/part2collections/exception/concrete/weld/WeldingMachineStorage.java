package pl.edu.pw.mini.po.part2collections.exception.concrete.weld;

public class WeldingMachineStorage {

	private WeldingMachine weldingMachine;

	public WeldingMachineStorage() {}

	public WeldingMachineStorage(WeldingMachine weldingMachine) {
		this.weldingMachine = weldingMachine;
	}

	public WeldingMachine takeWeldingMachineFromStorage() {
		WeldingMachine result = weldingMachine;
		weldingMachine = null;
		return result;
	}

	public void putWeldingMachine(WeldingMachine weldingMachine) {
		this.weldingMachine = weldingMachine;
	}

}
