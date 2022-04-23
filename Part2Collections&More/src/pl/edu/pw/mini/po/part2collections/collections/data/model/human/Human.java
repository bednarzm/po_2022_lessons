package pl.edu.pw.mini.po.part2collections.collections.data.model.human;

public abstract class Human {
	
	private String name;
	
	private Integer additionalId; 
	
	public void apply(HumanVisitable humanVisitable) {
		
	}
	
	public Human(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public Integer getAdditionalId() {
		return additionalId;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Human) {
			Human human = (Human)obj;
			if(this.name == null) {
				if(human.getName() == null) {
					result = true;
				}
			} else if(this.name.equals(human.getName())) {
				result = true;
			}
			
		}
		
		return result;
	}
	
}
