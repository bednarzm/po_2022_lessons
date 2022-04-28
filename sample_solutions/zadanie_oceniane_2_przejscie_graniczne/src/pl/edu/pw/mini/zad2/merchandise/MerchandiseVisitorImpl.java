package pl.edu.pw.mini.zad2.merchandise;

public class MerchandiseVisitorImpl implements MerchandiseVisitor{

	@Override
	public int visit(Merchandise t) {
		return 0;
	}

	@Override
	public int visit(Counterfeit t) {
		return t.getValue();
	}

}
