package pl.edu.pw.mini.po.part2collections.exception.concrete.weld;

public class WeldingMachine {
	
	private boolean outOfOrder;
	
	public void use() throws SpawarkaZepsutaException {
		if(outOfOrder) {
			throw new SpawarkaZepsutaException("Prund nie dochodzi!");
		} else {
			System.out.println("Bzzzz...");
		}
	}
	
}
