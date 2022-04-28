package pl.edu.pw.mini.zad2.merchandise;

public interface MerchandiseVisitor {

	public int visit(Merchandise t);

	public int visit(Counterfeit t);
}
