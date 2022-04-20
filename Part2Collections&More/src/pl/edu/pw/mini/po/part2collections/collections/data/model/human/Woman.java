package pl.edu.pw.mini.po.part2collections.collections.data.model.human;

public class Woman extends Human {
	
	private boolean studying;
	
	public Woman(String name) {
		super(name);
	}

	@Override
	public void apply(HumanVisitable humanVisitable) {
		humanVisitable.visitWoman(this);
	}

	public Woman(String name, boolean isStudying) {
		super(name);
		this.studying = isStudying;
	}

	public boolean isStudying() {
		return studying;
	}

}
